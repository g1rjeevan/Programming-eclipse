package upcasting;

public class Main1 
{
        public static void main(String[] args) {
	        Run1 r1=new Run1();
	       Sample1 s1=r1;
        	Demo1 d1 = r1;
        	System.out.println("*****************");
	           System.out.println("H value: "+r1.h);
	           r1.test();
	           System.out.println("*****************");
	           System.out.println("c value: "+r1.c);
	           System.out.println("b value: "+r1.b);
	           s1.test(1);
	           System.out.println("*****************");
	           System.out.println("k value: "+r1.k);
	           System.out.println("d value: "+r1.d);
	           d1.test('g');
	           System.out.println("*****************");
	           
        }
}
