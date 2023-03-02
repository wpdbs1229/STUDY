class Speaker{
	
	private int volumRate;
	
	public void showCurrentState() {
		System.out.println("Volum : " + volumRate);
	}
	
	public void setVolum(int vol) {
		volumRate = vol;
	}
}

class BaseEnSpeaker extends Speaker{
	
	private int baseRate;
	
	public void showCurrentState() {
		
		//super를 통해 하위 클래스에서 오버라이딩 된 상위 클래스의 메소드를 호출할 수 있다.
		super.showCurrentState(); 
		System.out.println("Base : " + baseRate);
	}
	
	public void setBaseRate(int base) {
		
		baseRate = base;
	}
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BaseEnSpeaker bs = new BaseEnSpeaker();
		Speaker sc = new Speaker();
		
		bs.setVolum(10);
		bs.setBaseRate(20);
		//참조변수를 이용해서, 인스턴스의 오버라이딩 메소드를 호출할 떄는 하위 클래스의 메소드가 호출된다.
		bs.showCurrentState();
		sc.setVolum(100);
		sc.showCurrentState();
	}

}
