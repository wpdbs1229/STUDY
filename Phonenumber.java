
public class Phonenumber {

	public String starnum(String phone_number) {
		
		
		StringBuilder answer = new StringBuilder(phone_number);  // 전화번호를 받아 StringBuilder로 객체를 생성
		for(int i =0 ; i<phone_number.length()-4; i++)
			answer.setCharAt(i, '*');   //setCharAt로 원하는 인덱스의 값을 *로 바꿔줍니다.
		
		return answer.toString(); //바꾼 전화번호를 반환합니다.
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  ph_num1 = "01023456913";
		String  ph_num2 = "042336423";
		
		Phonenumber star = new Phonenumber();
		
		System.out.println(star.starnum(ph_num1));
		System.out.println(star.starnum(ph_num2));
		
		
	}

}

// 개인정보 보호를 위해 고객의 전화번호를 끝자리 4자리만 남기고 *로 바꾸는 코드 입니다.
