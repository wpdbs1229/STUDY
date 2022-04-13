import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

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