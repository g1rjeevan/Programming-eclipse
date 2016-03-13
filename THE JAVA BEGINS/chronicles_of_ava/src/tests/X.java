package tests;
public class X {
 public static void main(String[] args) {
	try{
		badmethod();
		System.out.print("A");
	}
	catch(RuntimeException ex){
		System.out.print("B");
	}
	catch(Exception e){
		System.out.print("C");
	}
	finally{
		System.out.print("D");
	}
	System.out.print("E");
}
 public static void badmethod(){
	 throw new RuntimeException();
 }
}
