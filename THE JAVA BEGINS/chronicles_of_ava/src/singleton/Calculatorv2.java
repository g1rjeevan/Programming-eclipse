package singleton;

public class Calculatorv2 {
	
        private static Calculatorv2 c;
        private static int count=0;
		private Calculatorv2(){
			
			System.out.println("Running constructor now");
		    count++;
		}
		
		void divide(int n1,int n2){
			System.out.println("number "+n2+" is dividing "+n2);
			double result=(double)n1/n2;
			System.out.println("Result "+result);
		}
		
		public static Calculatorv2 getInstance(){
			
			System.out.println("Running getInstance() now");
			if(count==0){
				c = new Calculatorv2();
			}
			
			return c;
		
	}
}



