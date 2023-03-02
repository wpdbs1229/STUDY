class Sum{
	
	int num;
	
	public Sum() {num = 0;}
	public void addNum(int n) {num +=n;}
	public int getNum() {return num;}
}

class AdderThread extends Thread{
	
	Sum sum;
	int start;
	int end;
	
	public AdderThread(Sum sum, int s, int e) {
		
		this.sum = sum;
		start = s;
		end = e;
	}
	
	public void run() {
		
		for(int i = start; i <=end; i++) {
			sum.addNum(i);
		}
	}
}
public class ThreadHeapMultAccess {

	public static void main(String[] args) {
		
		Sum s = new Sum();
		AdderThread a1 = new AdderThread(s,1,50);
		AdderThread a2 = new AdderThread(s,51,100);
		
		a1.start();
		a2.start();
		try {
			a1.join();
			a2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(s.getNum());
	}
}
