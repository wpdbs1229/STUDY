class Calculator{
	
	int opCnt = 0;
	
	public synchronized int add(int a, int b) {
		opCnt++;
		return a+b;
	}
	
	public synchronized int min(int a, int b) {
		
		opCnt++;
		return a-b;
	}
	
	public void showOpcnt() {
		System.out.println(opCnt);
	}
}

class AddThread extends Thread{
	
	Calculator cal;
	
	public AddThread(Calculator cal) {
		this.cal = cal;
	}
	
	public void run() {
		System.out.println("1+2 = "+cal.add(2, 1));
		System.out.println("2+4 = "+cal.add(2, 4));
	}
}

class MinThread extends Thread{
	
	Calculator cal;
	
	public MinThread(Calculator cal) {
		this.cal = cal;
	}
	
	public void run() {
		System.out.println("3-2 = "+cal.min(3, 2));
		System.out.println("5-4 = "+cal.min(5, 4));
	}
}
public class ThreadSyncMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		AddThread aThread = new AddThread(cal);
		MinThread mThread = new MinThread(cal);
		
		aThread.start();
		mThread.start();
		
		try {
			aThread.join();
			mThread.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		cal.showOpcnt();
	}

}
