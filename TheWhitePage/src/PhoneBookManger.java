/*
 * Control Class
 */

import java.util.Scanner;


interface INPUT_SELECT{
	
	int NORMAL = 1, UNIV = 2, COMPANY = 3;
}

public class PhoneBookManger {
	final int MAX_SIZE = 100;
	private PhoneInfo[] books = new PhoneInfo[MAX_SIZE];
	private int numOfIndex;
	
	//PhoneInfo 자료형을 입력받음
	private PhoneInfo readPhoneInfo() {
		
		System.out.print("이름 : ");String name = MenuViewer.keyboard.next();
		System.out.print("전화번호 : ");String phoneNumber = MenuViewer.keyboard.next();

		return new PhoneInfo(name, phoneNumber);
	}
	
	//PhoneUnivInfo 자료형을 입력받음
	private PhoneInfo readUnivPhoneInfo() {
		
		System.out.print("이름 : ");String name = MenuViewer.keyboard.next();
		System.out.print("전화번호 : ");String phoneNumber = MenuViewer.keyboard.next();
		System.out.print("전공 : ");String major = MenuViewer.keyboard.next();
		System.out.print("학년 : ");String year = MenuViewer.keyboard.next();

		return new PhoneUnivInfo(name, phoneNumber, major, year);
	}
	
	//PhoneCompanyInfo 자료형을 입력받음
	private PhoneInfo readCompanyPhoneInfo() {
		
		System.out.print("이름 : ");String name = MenuViewer.keyboard.next();
		System.out.print("전화번호 : ");String phoneNumber = MenuViewer.keyboard.next();
		System.out.print("회사 : ");String company = MenuViewer.keyboard.next();
	

		return new PhoneCompanyInfo(name, phoneNumber, company);
	}
	
	/*
	 *  입력되는 데이터의 자료형에 따라 입력받는 멤버 수가 다르기 때문에 각 switch문을 통해 유형에 따라 입력할 수 있게 하였습니다.
	 *  각 데이터의 자료형이 달라도 상속관계에 있기 때문에 상위 클래스인 PhoneInfo 참조변수를 통해 저장되게 하였습니다.
	 */
	public void InputData() {
		
		PhoneInfo phoneInfo = null;
		
		System.out.println("데이터 입력을 시작합니다.");
		System.out.println("1. 일반, 2. 대학, 3. 회사");
		System.out.print("선택 : "); int choice = MenuViewer.keyboard.nextInt();
		
	
		switch(choice){
			case INPUT_SELECT.NORMAL:
				phoneInfo = readPhoneInfo();
				break;
			case INPUT_SELECT.UNIV:
				phoneInfo = readUnivPhoneInfo();
				break;
			case INPUT_SELECT.COMPANY:
				phoneInfo = readCompanyPhoneInfo();
				break;
				
		}
		
		books[numOfIndex++] = phoneInfo;
		System.out.println("데이터 입력이 완료되었습니다.");
	}
	/*
	 * name을 통해 데이터를 찾고, 존재하면 해당 배열의 인덱스를 반환합니다.
	 */
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
		books[numOfIndex] = null; // 끝자락에 있는 데이터를 삭제합니다.
		System.out.println("데이터 삭제가 완료 되었습니다.");
	}
	
}
//메뉴를 출력합니다.
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