import java.util.Scanner;

public class Main{
	
	static int[] cash_arr; // = {1,5,10,50,100,500,1000,5000,10000,50000};
	static int size; // = 10;
	static int price; // = 4790;
	static int cash_num; // = 0;
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt(); // 현금의 종류의 갯수를 가져온다.
		price = sc.nextInt(); // 가격을 가져온다.
		
		cash_arr = new int[size]; //배열의 크기를 선언
		
		for(int i = 0; i < size; i++) 
			cash_arr[i] = sc.nextInt(); //현금의 종류을 저장
		
		
		solution();
	}
	
	public static void solution() { 
		
		
		for(int i = size-1; i >= 0; i--) {
			int num = 0; 
			if( price != (price % cash_arr[i])) {
				
				cash_num += price/ cash_arr[i];
				num = price/cash_arr[i]; 
				price -= num* cash_arr[i];
			}
		}
		System.out.println(cash_num);
	
	}
}