import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
		
	static int Narr_size;
	static int Marr_size;


	
	public static void main(String[] args) throws IOException  {
		
		int[] Narr;
		int[] Marr;
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 비교 N 배열의  사이즈 입력받기
		Narr_size = Integer.parseInt(st.nextToken()); 
		Narr = new int[Narr_size]; 
		
		
		
		// 비교 N 배열의 원소값 입력
		st = new StringTokenizer(br.readLine()); 
		for(int i = 0; i < Narr_size; i++) 
			Narr[i] = Integer.parseInt(st.nextToken()); 
		
		// 비교 M 배열의 사이즈 입력
		st = new StringTokenizer(br.readLine());
		Marr_size = Integer.parseInt(st.nextToken());
		Marr = new int[Marr_size];
		
		// 비교 M 배열의 원소값 입력
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i<Marr_size; i++) 
			Marr[i] = Integer.parseInt(st.nextToken());
			
		//-----------------------입력--------------------
		solution(Narr, Marr);

	}
	
	
	public static void solution(int[] Narr, int[] Marr) { 
		
		int left = 0;
		int right = Narr_size-1; 
		
		//이진 탐색을 사용하기 위해 오름차순으로 정렬
		Arrays.sort(Narr);
		
		//M 배열의 원소들이 N 배열에 있는 지 탐색
		for(int i = 0; i < Marr_size; i++) 
			System.out.println(binary_search(Narr, left, right, Marr[i]));

		
		
	}
	// 재귀를 이용한 이진탐색
	public static int binary_search(int[] arr, int left, int right, int key) {
		
		// 이진 탐색 종료 조건1(탐색 실패..ㅠ 0을 반환)
		if( left > right)
			return 0;
		int mid = left + (right - left) / 2;
		
		//이진탐색 종료 조건 2(탐색 성공! 1을 반환)
		if( arr[mid] == key )
			return 1;
		// 중간 원소보다 값이 크면 오른쪽
		else if( arr[mid] < key)
			return binary_search(arr, mid+1, right, key);
		
		// 중간 원소보다 값이 작으면 왼쪽
		else
			return binary_search(arr, left, mid-1, key);
			
		
	}
	
	
}

/*
 이진 탐색의 시간 복잡도 
 best - O(1)
 average - Θ(log n)
 worst - O(log n)
*/
