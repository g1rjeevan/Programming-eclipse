package libraryArray;

public class Ballpen implements Pen{

	String inkColor;
	double price;
	Ballpen(String inkColor,double price){
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
		return "Ballpen[ ink="+this.inkColor+", price= "+this.price+"]";
	}
}
