class AAA{
	 
	public void  rideMethod() {System.out.println("'AAA' method");}
	public void  loadMethod() {System.out.println("void method");}

}

class BBB extends AAA{
	
	public void rideMethod() {System.out.println("'bbb' method");}
	public void loadMethdo(int num) {System.out.println("int method");}
}

class CCC extends BBB{
	
	public void rideMethod() {System.out.println("'ccc' method");}
	public void loadMethdo(double num) {System.out.println("double method");}
}


public class RideAndLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		AAA ref1 = new CCC();
		BBB ref2 = new CCC();
		CCC ref3 = new CCC();
		
		BBB ref = new BBB();
		
		ref.rideMethod(); 
		ref1.rideMethod();
		ref2.rideMethod();
		ref3.rideMethod();
		
		ref1.loadMethod();
		ref2.loadMethdo(0);
		ref3.loadMethdo(3.2);
	}

	/* 1.상위 클래스의 참조변수는 하위 클래스의 인스턴스를 참조할 수 있다.
	 * 2.참조변수 자료형의 상관없이 마지막으로 오버라이딩을 한 메소드만 호출된다.
	 * 3.오버라이딩 된 상위 클래스의 메소드는 오버라이딩을 한 하위 클래스의 메소드에 위해 가려진다.
	 * 4.외부에서는 참조변수를 통해서 오버라이딩 된 상위 클래스의 메소드를 호출할 수 없다.
	 * 5.해당 클래스의 오버라이딩 메소드를 호출할려면, 해당 클래스의 참조 변수가 해당 클래스의 인스턴스를 참조해야한다.
	 */
}
