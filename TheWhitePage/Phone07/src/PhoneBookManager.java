import java.util.*;

interface INPUT_SELECT{
	int General = 1, Univ = 2, Office = 3;
}

class MenuChoiceException extends Exception{
	
	int wrongChoice;
	public MenuChoiceException(int choice) {
		
		super("you select wrong");
		wrongChoice = choice;
	}
	
	public void showChoice() {
		System.out.println("Wrong Choice : " + wrongChoice);
	}
}
public class PhoneBookManager {
	
	public static Scanner scan = new Scanner(System.in);
	
	HashSet<PhoneInfo> storage = new HashSet<PhoneInfo>();
	 //PhoneInfo로 자료형을 하면 상속받은 Univ, OfficePhineInfo도 넣을 수 있을까??
	static PhoneBookManager inst = null;
	
	public static PhoneBookManager cerateManager() {
		
		if(inst == null)
			inst = new PhoneBookManager();
		return inst;
	}
	
	
	public PhoneInfo readPhoneInfo() {
		
		//PhoneInfo pInfo = null;
		System.out.println("Name : ");
		//pInfo.name = scan.next();
		String name = scan.next();
		System.out.println("PhoneNumber : ");
		//pInfo.pNum = scan.next();
		String pNum = scan.next();
		return new PhoneInfo(name, pNum);
	}
	
	public UnivPhoneInfo readUnivPhoneInfo() {
		
		
		System.out.println("Name : ");
		String name = scan.next();
		System.out.println("PhoneNumber : ");
		String pNum = scan.next();
		System.out.println("Major : ");
		String major = scan.next();
		System.out.println("Year : ");
		int year = scan.nextInt();
		
		return new UnivPhoneInfo(name, pNum, major, year);
	}
	
	public OfficePhoneInfo readOfficePhoneInfo() {
		
		OfficePhoneInfo oInfo = null;
		System.out.println("Name : ");
		String name = scan.next();
		System.out.println("PhoneNumber : ");
		String pNum = scan.next();
		System.out.println("Office : ");
		String office = scan.next();
		return new OfficePhoneInfo(name, pNum, office);
	}
	
	public void input() throws MenuChoiceException {
		
		PhoneInfo phone = null;
		
		System.out.println("Start Input Data");
		System.out.println("1. 일반, 2. 대학, 3. 회사 ");
		int choice = scan.nextInt();
		
		if( INPUT_SELECT.General>choice || INPUT_SELECT.Office < choice)
			throw new MenuChoiceException(choice);
			
		switch(choice) {
			case INPUT_SELECT.General:
				phone = readPhoneInfo();
				break;
			case INPUT_SELECT.Univ:
				phone = readUnivPhoneInfo();
				break;
			case INPUT_SELECT.Office:
				phone = readOfficePhoneInfo();
				break;
		}
		
		boolean isAdded = storage.add(phone); // 값이 저장되면 true, 중복된 값이라 실패되면 false를 반환한다.
		if(isAdded == true)
			System.out.println("data saved");
		else System.out.println("data that already exixt");
	}
	
	public PhoneInfo search(String name) {
		
		PhoneInfo phone = null;
		Iterator<PhoneInfo> itr = storage.iterator();
		
		while(itr.hasNext()) {
			phone = itr.next();
			if( name.compareTo(phone.name)==0) 
				return phone;
		}
		return null;
	}
	
	public void searchData() {
		System.out.println("Input name");
		String name = scan.next();
		System.out.println("...Searching");
		PhoneInfo  phone = search(name);
		if( phone == null)
			System.out.println("Not Exixt");
		else 
			phone.showInfo();
		
	}
	
	public void delete() {
		
		System.out.println("Input name");
		String name = scan.next();
		System.out.println("...Deleting");
	
		Iterator<PhoneInfo> itr = storage.iterator();
		while(itr.hasNext()) {
			PhoneInfo phone = itr.next();
			if( name.compareTo(phone.name)==0) {
				itr.remove();
				System.out.println("...Complete");
				return;
			}
				
		}
		
		
		/*Iterator<PhoneInfo> itr = storage.iterator();
		while(itr.hasNext()) {
			if( itr.next().name == name) {
				storage.remove(itr.next());
				System.out.println("Complete");
			}	
		}
		*/
	}
}
