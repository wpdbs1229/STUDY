class AAA1{ public int num = 2;}
class BBB1 extends AAA1{ public int num = 5;}
class CCC1 extends BBB1{ public int num = 7;}

public class ValReDecle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CCC1 refa = new CCC1();
		BBB1 refb = refa;
		AAA1 refc = refb;
		
		System.out.println(refa.num);
		System.out.println(refb.num);
		System.out.println(refc.num);
	}
	/*
	 *  refb는 CCC1의 인스턴스를 참조하고 있지만 참조변수의 자료형이 BBB이기 때문에 BBB class의 num에 접근한다.
	 *  메소드는 참조변수 자료형에 따라 차이가 없지만 변수의 경우 참조 변수 자료형에 따라 접근 가능한 인스턴스 변수에 차이가 있다.
	 */
}
