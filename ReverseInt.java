class Solution{
	
	
	public int[] soultion(long n) {
		
		String str = String.valueOf(n);
		
		StringBuilder sb = new StringBuilder(str); 
		
		sb.reverse();
		
		int[] arr = new int[sb.length()];
		
		for(int i =0; i<sb.length(); i++) {
			arr[i] = Integer.parseInt(Character.toString(sb.charAt(i))) ;
			
		}
		
		return arr;
	}
}

public class ReverseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long n = 12345;
		Solution s = new Solution();
		int[] arr = s.soultion(n);
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i]);
	}

}
