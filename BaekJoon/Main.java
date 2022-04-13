import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
		
	static int[] array ; //= {6, 22}
	static int size;// = 2
	
	public static void main(String[] args) throws IOException {
		
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		size = Integer.parseInt(st.nextToken());
		
		array = new int[size];
		for(int i = 0; i < size; i++) {
			st =new StringTokenizer(br.readLine());
			array[i] = Integer.parseInt(st.nextToken());	
		}
		
//-----------------------입력---------------------------
		solution();

	}
	
	/*
	
	*/
	public static void solution() { 
		int[][] Dp = new int[41][2];
		
		Dp[0][0] = 1;
		Dp[0][1] = 0;
		Dp[1][0] = 0;
		Dp[1][1] = 1;
		
		// 각 피보나치 수가 출력하는 0과 1의 수를 DP에 저장하고 40까지 저장해놓는다. 
		for(int i = 2; i <41; i++) {
			Dp[i][0] = Dp[i-1][0]+Dp[i-2][0];  
			Dp[i][1] = Dp[i-1][1]+Dp[i-2][1];
		}
		for(int j = 0; j<size; j++)
			System.out.println(Dp[array[j]][0]+" "+Dp[array[j]][1]);
	}
		
	
	
	
}

/* 재귀로 풀시 시간초과로 인해 dp로 바꿔서 문제를 풀었습니다.


public class Main{
		
	static int[] array ; //= {6, 22}
	static int size;// = 2
	static int count_zero = 0;
	static int count_one = 0;
	
	public static void main(String[] args) throws IOException {
		
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		size = Integer.parseInt(st.nextToken());
		
		array = new int[size];
		for(int i = 0; i < size; i++) {
			st =new StringTokenizer(br.readLine());
			array[i] = Integer.parseInt(st.nextToken());	
		}
		
//-----------------------입력---------------------------
		solution();

	}
	
	// 배열 저장된 데이터를 차례대로 피보 메소드에 입력 후 결과 출력
	public static void solution() { 
		
		for(int i = 0; i < size; i++) {
			//반복문을 돌때 마다 초기화
			count_zero = 0;  //0이 반환되는 수
			count_one = 0; //1이 반환되는 수
			
			fibo(array[i]);
			
			System.out.println(count_zero + " " + count_one);
		}
		
	}
	
	public static int fibo(int n) {
	
		
		if(n == 0) {
			count_zero++;
			return 0;
		}
		else if(n == 1) {
			count_one++;
			return 1;
		}
		else {
			return fibo(n-1) + fibo(n-2);
		}
			
	}
}

*/
