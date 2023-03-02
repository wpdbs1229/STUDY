/*	Data Class 
 *  이름과 전화번호만 저장하는 기본 클래스
 */
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

/*
 *  PhoneInfo 클래스를 상속받으며, 학과, 학년을 저장하는 클래스
 */
class PhoneUnivInfo extends PhoneInfo{
	
	String major;
	String year;
	
	public PhoneUnivInfo(String name, String phoneNumber, String major, String year) {
		super(name, phoneNumber);
		this.major = major;
		this.year = year;
	}
	//phoneInf showPhoneInfo를 Overriding
	public void showPhoneInfo() {
		
		super.showPhoneInfo(); //상위 클래스의 오버라이딩된 메소드를 불러온다
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + year);
		
	}
}

/*
 *  PhoneInfo 클래스를 상속받으며, 회사를 저장하는 클래스
 */
class PhoneCompanyInfo extends PhoneInfo{
	
	String company;
	
	public PhoneCompanyInfo(String name , String phoneNumber, String company) {
		super(name, phoneNumber);
		this.company = company;
	}
	//phoneInf showPhoneInfo를 Overriding
	public void showPhoneInfo() {
		super.showPhoneInfo(); //상위 클래스의 오버라이딩된 메소드를 불러온다
		System.out.println("회사 : "+ company);
	}
}