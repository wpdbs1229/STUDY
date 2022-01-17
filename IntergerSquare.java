
public class IntergerSquare {
	
	public static long determine(long n) {
		
		int num;
		
		for(int i = 1; i < n+1; i++) {
		
			if( i == n/i) {
				return (long) Math.pow(i+1,2);
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		
		System.out.println(determine(121));
		System.out.println(determine(3));
		
	
	}
}
