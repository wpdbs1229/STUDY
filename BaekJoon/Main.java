import java.util.Scanner;

public class Main{
	
	
	public static void main(String[] args) {
		
		
		
		int a = 24, b = 18;
		/*Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		*/
		solution(a, b);
	}
	
	public static void solution(int x, int y) { 
		
		int gcd_Num = gcd(x,y);
		int lcm_Num = lcm(gcd_Num, x, y);
		
		System.out.println(gcd_Num);
		System.out.println(lcm_Num);
	}
	
	public static int gcd(int x, int y) {
		
		if( y == 0)
			return x;
		return gcd(y, x % y);
		
		
	}
	public static int lcm(int gcd, int x, int y) {
		
		return gcd * (x / gcd) * (y / gcd); 
	}
	
}