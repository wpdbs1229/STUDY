import java.util.*;

interface SELECT_INIT{
	int INPUT = 1, SEARCH = 2, DELET = 3, EXIT =4;
}
class Menu{
	
	public void showMenu() {
		System.out.println("select number");
		System.out.println("1. input data");
		System.out.println("2. search data");
		System.out.println("3. delet data");
		System.out.println("4. Exit");
	}
}
public class PhoneBook {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) throws MenuChoiceException  {
		// TODO Auto-generated method stub
		
		PhoneBookManager manager = PhoneBookManager.cerateManager();
		Menu menu = new Menu();
		int choice = 0;
		while(true) {
			try {
				menu.showMenu();
				choice = scan.nextInt();
				
				if(choice > SELECT_INIT.EXIT || choice < SELECT_INIT.INPUT)
					throw new MenuChoiceException(choice);
				
				switch(choice) {
					case SELECT_INIT.INPUT:
						manager.input();
						break;
					case SELECT_INIT.SEARCH:
						manager.searchData();
						break;
					case SELECT_INIT.DELET:
						manager.delete();
						break;
					case SELECT_INIT.EXIT:
						break;
			}
			}catch(MenuChoiceException e){
				e.showChoice();
				System.out.println(" RESTART INIT MENU");
			}
		}
	}

}
