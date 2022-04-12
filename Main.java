import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main{
		
	static int size;
	
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 배열의 사이즈를 받아옴
		size = Integer.parseInt(st.nextToken());
		
		
		Integer[] Aarray = new Integer[size];
		Integer[] Barray = new Integer[size];
		
		//A와 B 배열에 원소를 저장
		for(int i = 0; i <2; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < size ; j++) {
				if( i == 0 )
					Aarray[j] = Integer.parseInt(st.nextToken());
				else
					Barray[j] = Integer.parseInt(st.nextToken());
			}
		}
		//------ 입력 ------

		/*
		size = 5;
		Integer[] Aarray = {1,1,1,6,0};
		Integer[] Barray = {2,7,8,3,1};
		*/
		
		bw.write(solution(Aarray, Barray)+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
	// Aarray는 오름차순으로 정렬, Barray 내림차순으로 정렬해 서로 원소들의 곱값을 최소화합니다.
	public static int solution(Integer[] Aarray, Integer[] barray) { 
		
		int sum = 0;
		
		Arrays.sort(Aarray);
		Arrays.sort(barray, Collections.reverseOrder()); //Integer[]..?-->int[]..?
		
		for(int i = 0; i < size; i++) 
			sum +=Aarray[i] * barray[i];
		return sum;
		
	}
}