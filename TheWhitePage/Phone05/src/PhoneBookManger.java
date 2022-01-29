import java.util.Scanner;

public class PhoneBookManger {
	final int MAX_SIZE = 100;
	private PhoneInfo[] books = new PhoneInfo[MAX_SIZE];
	private int numOfIndex;
	
	private PhoneInfo readPhoneInfo() {
		
		System.out.print("이름 : ");String name = MenuViewer.keyboard.next();
		System.out.print("전화번호 : ");String phoneNumber = MenuViewer.keyboard.next();

		return new PhoneInfo(name, phoneNumber);
	}
	
	private PhoneInfo readUnivPhoneInfo() {
		
		System.out.print("이름 : ");String name = MenuViewer.keyboard.next();
		System.out.print("전화번호 : ");String phoneNumber = MenuViewer.keyboard.next();
		System.out.print("전공 : ");String major = MenuViewer.keyboard.next();
		System.out.print("학년 : ");String year = MenuViewer.keyboard.next();

		return new PhoneUnivInfo(name, phoneNumber, major, year);
	}
	
	private PhoneInfo readCompanyPhoneInfo() {
		
		System.out.print("이름 : ");String name = MenuViewer.keyboard.next();
		System.out.print("전화번호 : ");String phoneNumber = MenuViewer.keyboard.next();
		System.out.print("회사 : ");String company = MenuViewer.keyboard.next();
	

		return new PhoneCompanyInfo(name, phoneNumber, company);
	}
	
	public void InputData() {
		
		PhoneInfo phoneInfo = null;
		
		System.out.println("데이터 입력을 시작합니다.");
		System.out.println("1. 일반, 2. 대학, 3. 회사");
		System.out.print("선택 : "); int choice = MenuViewer.keyboard.nextInt();
		
	
		switch(choice){
			case 1:
				phoneInfo = readPhoneInfo();
				break;
			case 2:
				phoneInfo = readUnivPhoneInfo();
				break;
			case 3:
				phoneInfo = readCompanyPhoneInfo();
				break;
				
		}
		
		books[numOfIndex++] = phoneInfo;
		System.out.println("데이터 입력이 완료되었습니다.");
	}
	
	public int search(String name){
		
		for(int i = 0; i<books.length; i++){
			if(books[i].name.equals(name))
				return i;
		}
		return -1;
	}
	
	public void searchData() {
		
		int idx = 0;
		
		System.out.println("데이터 검색을 시작합니다.");
		System.out.print("이름 :"); String name = MenuViewer.keyboard.next();
		
		idx = search(name);
		
		if(idx != -1)
			books[idx].showPhoneInfo();
	}
	
	public void DeletData() {
		
		int idx = 0;
		
		System.out.print("이름 :"); String name = MenuViewer.keyboard.next();
		
		idx = search(name);
		
		for(int i = idx; i<books.length-1; i++) {
			books[i] = books[i+1]; 
		}
		
		numOfIndex--;
		books[numOfIndex] = null;
		System.out.println("데이터 삭제가 완료 되었습니다.");
	}
	
}
class MenuViewer{
	
	public static Scanner keyboard = new Scanner(System.in);

	public static void showMenu() {
		
		System.out.println("선택해주세요");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 프로그램 종료");
		System.out.print("선택 : ");
		
	}
}