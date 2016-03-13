package libraryArray;

public class Markerpen implements Pen{

	String inkColor;
	double price;
	Markerpen(String inkColor,double price){
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
		return "Markerpen[ ink="+this.inkColor+", price= "+this.price+"]";
	}
}
