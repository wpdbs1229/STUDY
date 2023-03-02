/*class Box{
	public void simpleWrap() {System.out.println("simple wrap");}
}
class PaperBox extends Box{
	public void paperWrap() {System.out.println("paper wrap");}
}
class GoldPaperBox extends PaperBox{
	public void goldWrap() {System.out.println("Goldpaper wrap");}
}
	
public class InstanceOf {

	public static void wrapBox(Box box) {
		
		if(box instanceof GoldPaperBox) 
			((GoldPaperBox)box).goldWrap();
		else if(box instanceof PaperBox)
			((PaperBox)box).paperWrap();
		else
			box.simpleWrap();
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
*/