import java.util.concurrent.locks.ReentrantLock;
import java.util.Scanner;
import java.util.concurrent.locks.Condition;

class StringComm{
	
	String newString;
	boolean isNewString = false;
	
	private final ReentrantLock entLock = new ReentrantLock();
	private final Condition readCond = entLock.newCondition();
	private final Condition writeCond = entLock.newCondition(); 
	// 문장을 읽을 때 사용하는 key readCond , 문자을 저장할 때 사용한 key writeCond를 entLock 대상으로 Condition 인스턴스 생성 	
	
	public void setNewsString(String news) { //새로운 문자열을 저장하기위한 메소드
		entLock.lock();//다른 인스턴스를 접근하지 못하게 함
		
		try {
			if(isNewString == true) { // 기존의 문장이 아직 존재한다면
				writeCond.await(); // writeCond를 기존의 문장을 가져갈 때까지 대기시킨다.
			}
			newString = news;  //새로운 문장을 저장
			isNewString = true; //새로운 문자열을 저장하면 안됨을 표시
			readCond.signal();//새로운 문자가 오는 것을 기달리는 쓰레드를 호출
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			entLock.unlock(); // 다른 인스턴스가 접근가능하게 함
		}
	}
	
	public String getNewsString() { //새로운 문자열을 가져가기위한 메소드
		String retStr = null; 
		
		entLock.lock(); //다른 인스턴스를 접근하지 못하게 함
		try {
			if(isNewString == false) // 저장되어있는 문자열이 없다면
				readCond.await(); // 읽어오는 쓰레들 잠시 대기
			
			retStr = newString; // 새로이 문자열을 저장
			isNewString = false; // 새로운 문자열 저장되도 상관 없음을 표시
			writeCond.signal();//혹시 문자열을 쓰기위해 기달리고 있는 쓰레드를 호출
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			entLock.unlock(); //// 다른 인스턴스가 접근가능하게 함
		}
		return retStr;
	}
}

class StringWriter extends Thread{
	
	StringComm comm;
	
	public StringWriter(StringComm comm) {
		this.comm = comm;
	}
	
	public void run() { 
		Scanner scan = new Scanner(System.in); 
		String writeStr;
		
		System.out.println("문장을 적어주세요!");
		writeStr = scan.nextLine(); //새로운 문자열을 입력받음
		comm.setNewsString(writeStr); // setNewsString 메소드를 통해 문자열을 저장
	}
}

class StringReader extends Thread{
	
	StringComm comm;
	
	public StringReader(StringComm comm) {
		this.comm = comm;
	}
	
	public void run() {
		System.out.println(comm.getNewsString());
	}
}
public class ConditionSyncStringReadWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringComm comm = new StringComm();
		StringWriter wStr = new StringWriter(comm);
		StringReader rStr = new StringReader(comm);
		
		System.out.println("입출력 쓰레드 실력-^3^-");
		wStr.start();
		rStr.start();
	}

}
