import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		
		int sugar_kg = sc.nextInt();
		System.out.println(solution(sugar_kg));
		
		
	}
	
	public static int solution(int sugar_kg) { 
		int bag;
		/*
		 *  설탕 무게를 5로 나눠지기 전까지 3킬로 봉지에 담습니다.(단, 3kg보다 작아진다면 더이상 봉지에 담지 않습니다.)
		 *  5로 나눠지면 봉지에 담는 걸 멈추고 5kg 봉지에 담습니다!!
		 *  5로 나눠지지 않고 3kg 봉지에 계속 담기다면 3kg봉지에만 설탕을 담습니다.
		 */
		for( bag = 0; sugar_kg % 5 != 0 && sugar_kg >= 3; bag++) 		
			sugar_kg -= 3;
		
		if(sugar_kg % 5 ==0) {
			bag += sugar_kg / 5;
			return bag;
		}
		else if(sugar_kg == 0)
			return bag;
		
		return -1;
	}
}