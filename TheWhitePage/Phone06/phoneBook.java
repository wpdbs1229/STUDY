import java.awt.Choice;

/*
 * interface 기반의 상수표현
 */
interface INIT_SELECT{
	
	int INPUT = 1, SEARCH = 2, DELET = 3, EXIT = 4;  
}
public class phoneBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PhoneBookManger phone = new PhoneBookManger();
		int choice = 0;
		
		while(true) {
			MenuViewer.showMenu();
			choice = MenuViewer.keyboard.nextInt();
			
			switch(choice) {
			case INIT_SELECT.INPUT:
				phone.InputData();
				break;
			case INIT_SELECT.SEARCH:
				phone.searchData();
				break;
			case INIT_SELECT.DELET:
				phone.DeletData();
				break;
			case INIT_SELECT.EXIT:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}

}
