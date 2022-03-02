import java.util.*;

public class PhoneInfo {
	
	String name;
	String pNum;
	
	public PhoneInfo(String name, String pNum) {
		this.name = name;
		this.pNum = pNum;
	}
	
	public void showInfo() {
		System.out.println("Name : " + name);
		System.out.println("PhoneNumber : " + pNum);
	}
	
	public int hashcode() {
		return name.hashCode();
	}
	
	public boolean equals(Object obj) {
		
		PhoneInfo phone = (PhoneInfo)obj;
		if(name.compareTo(phone.name)==0)
			return true;
		else return false;
	}
}

class UnivPhoneInfo extends PhoneInfo{
	
	String major;
	int year;
	
	
	public UnivPhoneInfo(String name, String pNum, String major, int year) {
		super(name, pNum);
		this.major = major;
		this.year = year;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("major : " + major );
		System.out.println("year : " + year);
	}
}

class OfficePhoneInfo extends PhoneInfo {
	
	String office;
	
	public OfficePhoneInfo(String name, String pNum, String office) {
		super(name, pNum);
		this.office = office;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("office : " + office);
	}
	
}
