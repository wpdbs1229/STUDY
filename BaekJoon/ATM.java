import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

//import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		/*	
			5 (ATM을 사용하는 사람 수)
			3 4 1 3 2 ( ATM기를 이용하는데 사람마다 걸리는 시간)
		*/
		Scanner sc = new Scanner(System.in); 
		int size = sc.nextInt();  // 첫 째줄에 데이터 읽어와 배열의 사이즈 정한다..
		
		int[] job arr = new int[size]; //
		
		for(int i = 0; i < size; i++)
			job_arr[i] = sc.nextInt(); // 각 데이터를 받아와 job_arr[]에 데이터를 저장한다.
		
		Arrays.sort(job_arr); // 탐색 알고리즘을 사용해 가장 작은 값부터 값을 오름차순으로 정렬
		
		int total_time = 0;  // 총 걸리는 시간
		int personal_time = 0; // 개인의 업무를 보는 시간 + 기달려야하는 시간
		
		for(int i = 0; i <size; i++) {
			personal += job_arr[i];
			total_time += personal_time;
		}
		System.out.println(total_time); // 출력
		
	}
}
