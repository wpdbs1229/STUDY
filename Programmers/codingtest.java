import java.util.*;

class Solution{
	
	public long solution(long n) {
		
		String[] list = String.valueOf(n).split("");
		Arrays.sort(list);
		
		
		StringBuilder sb =new StringBuilder();
		for(String aList :  list) sb.append(aList);
		
		return Long.parseLong(sb.reverse().toString());
	}
}
public class codingtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution s = new Solution();
		long n = 42392;
		n = s.solution(n);
		System.out.println(n);
	}

}
