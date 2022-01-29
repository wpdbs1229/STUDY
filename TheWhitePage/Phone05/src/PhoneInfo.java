class PhoneInfo {
	
	String name;
	String phoneNumber;
	
	public PhoneInfo(String name, String phoneNumber) {
		
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public void showPhoneInfo() {
		
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
	}
}

class PhoneUnivInfo extends PhoneInfo{
	
	String major;
	String year;
	
	public PhoneUnivInfo(String name, String phoneNumber, String major, String year) {
		super(name, phoneNumber);
		this.major = major;
		this.year = year;
	}
	
	public void showPhoneInfo() {
		
		super.showPhoneInfo();
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + year);
		
	}
}

class PhoneCompanyInfo extends PhoneInfo{
	
	String company;
	
	public PhoneCompanyInfo(String name , String phoneNumber, String company) {
		super(name, phoneNumber);
		this.company = company;
	}
	
	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("회사 : "+ company);
	}
}