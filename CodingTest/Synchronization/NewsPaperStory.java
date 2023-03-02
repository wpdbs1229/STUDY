class NewsPaper{
	
	String todayNews;
	
	public void setNews(String news) {
		todayNews = news;
	}
	
	public String getTodayNews() {
		return todayNews;
	}
}

class NewsWriter extends Thread{
	
	NewsPaper news;
	
	public NewsWriter(NewsPaper news) {
		this.news =news;
	}
	
	public void run() {
		
		news.setNews("today news!!");
	}
}

class NewsReader extends Thread{
	
	NewsPaper news;
	
	public NewsReader(NewsPaper news) {
		
		this.news = news;
	}
	
	public void run() {
		 
		System.out.println(news.getTodayNews());
	}
}
public class NewsPaperStory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewsPaper paper = new NewsPaper();
		NewsWriter newsWriter = new NewsWriter(paper);
		NewsReader newsReader = new NewsReader(paper);
		
	
		newsReader.start();
		newsWriter.start();
		
		try {
			newsWriter.join();
			newsReader.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
