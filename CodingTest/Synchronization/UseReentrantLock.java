
import java.util.concurrent.locks.ReentrantLock;

class IHaveTwoNum{
	int num1 = 0;
	int num2 = 0;
	
	public void addOneNum1() {
		key1.lock();
		try {
			num1 +=1;
		}
		finally
		{
			key1.unlock();
		}
	}
	
	public void addTwoNum1() {
		key1.lock();
		try {
			num1 +=2;
		}
		finally
		{
			key1.unlock();
		}
	}
	public void addOneNum2() {
		key1.lock(); //lock 메소드 한 인스턴스만 접근이 가능하게 하였습니다.
		try {
			num2 +=1;
		}
		finally
		{
			key1.unlock(); // unlock은 어떠한 경우에도 반드시 실행되어야 하기 때문에 (실행되지 않으면, 다른인스턴스들이 접근하지 못함) finally 지역안에 설정했습니다.
		}
	}
	
	public void addTwoNum2() {
		key1.lock();
		try {
			num2 +=2;
		}
		finally
		{
			key1.unlock();
		}
	}	
	
	public void showAllNums() {
		System.out.println("num1 : " + num1);
		System.out.println("num1 : " + num2);
	}
	private final ReentrantLock key1 = new ReentrantLock();
	private final ReentrantLock key2 = new ReentrantLock();
}

class AddThread extends Thread{
	
	IHaveTwoNum nums;
	
	public AddThread(IHaveTwoNum n) {
		nums = n;
	}
	
	public void run() {
		nums.addOneNum1();
		nums.addOneNum2();
		nums.addTwoNum1();
		nums.addTwoNum2();
		
	}
}
public class UseReentrantLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IHaveTwoNum nums = new IHaveTwoNum();
		AddThread at1 = new AddThread(nums);
		AddThread at2 = new AddThread(nums);
		
		at1.start();
		at2.start();
		
		try {
			at1.join();
			at2.join();
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		
		nums.showAllNums();
	}

}
