import java.awt.Choice;

public class phoneBook05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PhoneBookManger phone = new PhoneBookManger();
		int choice = 0;
		
		while(true) {
			MenuViewer.showMenu();
			choice = MenuViewer.keyboard.nextInt();
			
			switch(choice) {
			case 1:
				phone.InputData();
				break;
			case 2:
				phone.searchData();
				break;
			case 3:
				phone.DeletData();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}

}
