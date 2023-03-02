class Box{
	public void wrap() {System.out.println("simple wrap");}
}
class PaperBox extends Box{
	public void wrap() {System.out.println("paper wrap");}
}
class GoldPaperBox extends PaperBox{
	public void wrap() {System.out.println("Goldpaper wrap");}
}
	
public class NoInstanceOf {
	
	public static void wrapBox(Box box) {
		
		box.wrap();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box box = new Box();
		PaperBox pbox = new PaperBox();
		GoldPaperBox gbox = new GoldPaperBox();
		
		
		wrapBox(box);
		wrapBox(pbox);
		wrapBox(gbox);
	}

}
