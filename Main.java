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
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int size = Integer.parseInt(st.nextToken());  
		int[] job_arr = new int[size];
		
		st =new StringTokenizer(br.readLine());
		
		for(int i = 0; i < size; i++) 
			job_arr[i] = Integer.parseInt(st.nextToken());  
		
		
		Arrays.sort(job_arr);
		
		int personal_time = 0;
		int total_time = 0;
		
		for(int i = 0; i<size; i++) {
			personal_time += job_arr[i];
			total_time += personal_time;
		}
		
		bw.write(total_time+"\n");
		bw.flush();
		bw.close();

		/*
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] job arr = new int[size];
		
		for(int i = 0; i < size; i++)
			job_arr[i] = sc.nextInt();
		
		Arrays.sort(job_arr);
		
		int total_time = 0;
		int personal_time = 0;
		
		for(int i = 0; i <size; i++) {
			personal += job_arr[i];
			total_time += personal_time;
		}
		System.out.println(total_time);
		*/
	}
}
