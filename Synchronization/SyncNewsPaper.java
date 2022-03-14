class NewsPaper{
	
	String todayNews;
	boolean isTodayNews = false;
	
	public void setTodayNews(String news) {
		todayNews = news;
		isTodayNews = true;
		
		synchronized(this){
			notifyAll();  // 모든 쓰레드를 깨운다.
		}
	}
	
	public String getTodayNews() {
		
		if(isTodayNews == false) {
			
			try {
				synchronized(this) {
				wait();
				}
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		return todayNews;
		
	}
	
}

class NewsWriter extends Thread{
	
	NewsPaper news;
	
	public NewsWriter(NewsPaper news) {
		this.news = news;
	}
	
	public void run() {
		
		news.setTodayNews("today News!!");
	}
}

class NewsReader extends Thread{
	
	NewsPaper  news;
	
	public NewsReader(NewsPaper news) {
		this.news = news;
	}
	
	public void run() {
		System.out.println(news.getTodayNews());
	}
}
public class SyncNewsPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewsPaper paper = new NewsPaper();
		NewsWriter writer = new NewsWriter(paper);
		NewsReader reader1 = new NewsReader(paper);
		NewsReader reader2 = new NewsReader(paper);
		
		try {

		reader1.start();
		reader2.start();
		
		Thread.sleep(1000); // 
		writer.start();
		
		reader1.join();
		reader2.join();
		writer.join();
		
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	

	}

}
