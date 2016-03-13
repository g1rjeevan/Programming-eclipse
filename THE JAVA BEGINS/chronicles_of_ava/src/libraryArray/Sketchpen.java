package libraryArray;

public class Sketchpen implements Pen{

	String inkColor;
	double price;
	Sketchpen(String inkColor,double price){
		this.inkColor=inkColor;
		this.price=price;
		
	}
	public void write(){
		System.out.println("Writing......");
		
	}
	public void refill(){
		System.out.println("refilling....");
	}
	public String toString(){
		return "Sketchpen[ ink="+this.inkColor+", price= "+this.price+"]";
	}
}