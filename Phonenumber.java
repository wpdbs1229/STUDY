
public class Phonenumber {

	public String starnum(String phone_number) {
		
		
		StringBuilder answer = new StringBuilder(phone_number);
		for(int i =0 ; i<phone_number.length()-4; i++)
			answer.setCharAt(i, '*');
		
		return answer.toString();
		
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
