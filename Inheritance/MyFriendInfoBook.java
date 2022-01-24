import java.util.Scanner;

// Data 클래스
class Friend{
	
	String name;
	String phoneNum;
	String address;
	
	public Friend(String name, String phoneNum, String address) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.address = address;
	}
	
	public void showData() {
		System.out.println("이름 : " + name);
		System.out.println("전화 : " + phoneNum);
		System.out.println("주소 : " + address);
	}
	
	/*
	 * 오버라이딩을 통해 Freind참조 변수로 각 하위 클래스의 showBasicInfo 메소드를 호출하기위해 정의 하였다.  
	 */
	public void showBasicInfo() {}
}

class  HighFriend extends Friend{
	
	String work;
	
	public HighFriend(String name, String phoneNum, String address, String work){ 
		super(name, phoneNum, address);
		this.work = work;
	}
	
	public void showData() {
		super.showData();
		System.out.println("직장 : " + work);
	}
	
	public void showBasicInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화 : " + phoneNum);
	}
}

class UnivFriend extends Friend{
	
	String major;
	
	public UnivFriend(String name, String phoneNum, String address, String major) {
		super(name, phoneNum, address);
		this.major = major;
	}
	
	public void showData() { 
		super.showData();
		System.out.println("전공 : "+ major);
	}
	
	public void showBasicData() {
		System.out.println("이름 : " + name);
		System.out.println("전화 : " + phoneNum);
		System.out.println("전공 : "+ major);
	}
}

/*
 *  목적, 또는 제공하는 기능에 맞게 프로그램의 흐름을 컨트롤하는 Control 또는 Manager 클래스
 */
class FriendInfoHandler {
	
	
	// 데이터 접근할 수 없게 private로 선언 간접적으로 접근할 메소드를 제공
	private Friend[] myFriends;
	private int numOfFriends;
	
	//생성자를 이용한 초기화
	public FriendInfoHandler(int num) {
		
		myFriends = new Friend[10]; // 참조배열에 실제 인스턴스의 주소를 참조하게한다.
		numOfFriends = 0;
	}
	
	// Friend형 매개변수를 받아 myFriends에 친구 정보를 저장하는 메소드 private이므로 간접 접근이 필요
	private void addFriendInfo(Friend fre) {
		myFriends[numOfFriends++] = fre; 
	}
	
	// 사용자의 입력을 받고 addFriendInfo를 통해 Data를 저장
	public void addFriend(int choice) {
		
		String name, phoneNum, address, work, major;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : "); name = scan.nextLine();
		System.out.print("전화 : "); phoneNum = scan.nextLine();
		System.out.print("주소 : "); address = scan.nextLine();
		
		if( choice == 1) {
			System.out.println("직업 : "); work = scan.nextLine();
			addFriendInfo(new HighFriend(name, phoneNum, address, work ));
			//인스턴스 생성으로 인해 반환되는 참조 값을 매개변수로 전달, 참조 변수인 배열에 저장
		}
		else if( choice == 2) {
			System.out.println("학과 : "); major = scan.nextLine();
			addFriendInfo(new UnivFriend(name, phoneNum, address, major));
		}
		
	}
	
	public void showAllData() {
		
		for(int i = 0 ; i < numOfFriends; i++) {
			
			myFriends[i].showData();
			System.out.println("");
		}
	}
	public void showSimpleData() {
		
		for(int i = 0 ; i < numOfFriends; i++) {
			
			myFriends[i].showBasicInfo();
			System.out.println("");
		}
	}
	
}
public class MyFriendInfoBook {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FriendInfoHandler handler = new FriendInfoHandler(10);
		
		while(true) {
			
			System.out.println("***메뉴 선택***");
			System.out.println("1.고교 정보 저장");
			System.out.println("2.대학 친구 저장");
			System.out.println("3.전체 정보 출력");
			System.out.println("4.기본 정보 출력");
			System.out.println("5.프로그램 종료");
			System.out.println("선택 : ");
			
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 : case 2:
				handler.addFriend(choice);
				break;
			case 3 :
				handler.showAllData();
				break;
			case 4 : 
				handler.showSimpleData();
				break;
			case 5 :
				System.out.println("프로그램 종료");
				return;
			}
			
		}
	}

}
