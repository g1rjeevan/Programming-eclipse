package Patterns;

public class Patterns21 {
	public static void main(String[] args) {
		
		Loop2 l2 = new Loop2();
		l2.start();
		try{
			Thread.sleep(1000);
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		Loop l=new Loop();
		l.start();
		System.out.println();
		try{
			Thread.sleep(1000);
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		System.out.println();
		System.out.println();
		
		Loop1 l1=new Loop1();
		l1.start();
		System.out.println();
		
		
	}
}
class Loop extends Thread{
	synchronized public void run(){
		
	int row=10,col=10;
		for (int i = 0; i <=row; i++) {
			
			
			for (int j = 0; j <=col; j++) {
				if(j==0||j==col||i==j||i==(row-j))
					System.out.print("*"+" ");
			//(i<=j^i>=(row-j)^i>=j^i<=(row-j))
			//(i<=j&&i>=(row-j)&&i>=j&&i<=(row-j))
				else if(i>j&&i<(row-j)||i<j&&i>(row-j))
					System.out.print("-"+" ");
				else
					System.out.print(" "+" ");
			}
		System.out.println();
		
		}
		
	}
	
}
class Loop1 extends Loop{
	synchronized public void run(){
		
	int row=10,col=10;
		for (int i = 0; i <=row; i++) {
			
			
			for (int j = 0; j <=col; j++) {
				if(j==0||j==col||i==j||i==(row-j))
					System.out.print("*"+" ");
			
				else if(i<=j^i>=(row-j)^i>=j^i<=(row-j))
					System.out.print("-"+" ");
				else
					System.out.print(" "+" ");
			}
		System.out.println();
		
		}
		
	}
	
}
class Loop2 extends Loop1{
	synchronized public void run(){
		
	int row=10,col=10;
		for (int i = 0; i <=row; i++) {
			
			
			for (int j = 0; j <=col; j++) {
				if(j==0||j==col||i==j||i==(row-j))
					System.out.print("*"+" ");
						
				else if(i<=j&&i>=j&&i>=(row-j)&&i<=(row-j))
					System.out.print("-"+" ");
				else
					System.out.print(" "+" ");
			}
		System.out.println();
		
		}
		
	}
	
}
