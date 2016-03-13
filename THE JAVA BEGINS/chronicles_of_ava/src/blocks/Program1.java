package blocks;

public class Program1 {
	
public static void main(String[] args) {
	
	System.out.println("11******************");
	Pen P = new Pen();
	System.out.println("i value :"+P.i);
	System.out.println("j value :"+Pen.j);
	System.out.println("22******************");
	System.out.println("k value :"+P.k);
	System.out.println("l value :"+Pen.l);
	System.out.println("33******************");
	P.k++;
	Pen.l++;
	System.out.println("i value :"+P.k);
	System.out.println("i value :"+Pen.l);
	System.out.println("44******************");
	Pen P1 = new Pen();
	System.out.println("k value :"+P1.k);
	System.out.println("i value :"+Pen.l);
	System.out.println("55******************");
	new Pen();
	System.out.println("66******************");
	System.out.println("k value :"+new Pen().k);
	System.out.println("77******************");
	new Pen();

     }

}
