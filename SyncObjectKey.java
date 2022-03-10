class IHaveTwoNum{
	
	int a = 0;
	int b = 0;
	
	public void addOneA() 
	{	
		synchronized(this)
		{
			a += 1;
		}
		
	}
	public void addTwoA() 
	{ 
		synchronized(this)
		{
			a += 2;
		}
	}
	public void addOneB() 
	{ 
		synchronized(key)
		{
			b += 1;
		}
	}
	public void addTwoB() 
	{ 
		synchronized(key)
		{
			b += 2;
		}
	}
	
	public void showAll() {
		System.out.println("A :" +a);
		System.out.println("B :" +b);
	}
	
	Object key = new Object();
}

class AccessThread extends Thread{
	
	IHaveTwoNum twoNumInst;
	
	public AccessThread(IHaveTwoNum inst) {
		twoNumInst = inst;
	}
	
	public void run() {
		twoNumInst.addOneA();
		twoNumInst.addTwoA();
		twoNumInst.addOneB();
		twoNumInst.addTwoB();
		
		
	}
}
public class SyncObjectKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IHaveTwoNum haveTwo = new IHaveTwoNum();
		AccessThread th1 = new AccessThread(haveTwo);
		AccessThread th2 = new AccessThread(haveTwo);
		
		th1.start();
		th2.start();
		
		try {
			th1.join();
			th2.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		haveTwo.showAll();
	}
/*
 *  두 쓰레드가 동시에 a에 접근할 수 있다. 동시에 접근하지 못하게 동기화처리를 해줬다.
 *  4개의 메소드를 다 동기화처리하면 IHaveTwoNum의 인스턴스가 가지고 있는 하나의 열쇠로 동기화되있기 때문에
 *  성능저하로 이루어 질 수 있다.
 *  
 *  th1은 addoneA 와 th2는 addoneB에 동시에 접근해도 상관이 없기 때문에, 블록으로 동기화 처리를해 각자의 키를 만들어 줘
 *  성능저하를 낮췄다. 정리하자면, th1은 addoneA 와 addTwoB를 호출했을때 th2 가 addOneA를 쓰게 되면 변수 A에 동시접근 할 수 있어
 *  addOneA 와 addOneB를 같은 키로 묶으면 되고 그외에 메소드끼리 다른 키로 묶으면 된다
 */
}
