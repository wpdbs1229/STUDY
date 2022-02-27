public class stringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//문자가 없고 초기 용랼이 16자인 문자열을 생성합니다.
		StringBuilder str = new StringBuilder();
		
		//to.String은 str이 나타내는 문자열을 반환합니다!
		System.out.println(str.toString());
		
		//str  문자열에 hello world 문자열을 추가합니다.
		str.append("hello world");
		
		System.out.println(str);
		
		//set.CharAt(index, 변환하고 싶은 문자)는 해당하는 index의 값의 문자를 변환하고 싶은 문자로 바꿔줍니다.
		for(int i = 0; i <str.length(); i++) 
			str.setCharAt(i ,'k');
		//단, 음수값이 지정되면 java.lang.StringIndexOutOfBoundsException: String index out of range 오류가 발생
		
		
		//str의 내용을 초기화된 str1을 생성합니다.
		StringBuilder str1 = new StringBuilder(str);
		
		System.out.println(str1);
		
		
		//지정된 문자열을 생성합니다.
		StringBuilder str2 = new StringBuilder("Hi String!");
		
		System.out.println(str2);
		
		
	
	}
	
}
