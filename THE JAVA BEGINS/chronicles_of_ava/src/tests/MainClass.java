package tests;

/*class A
{
    static int i = 1111;
 
    static
    { System.out.println("A1");
        i = i-- - --i;
    }
 
    {System.out.println("A.2");
        i = i++ + ++i;
    }
}
 
class B extends A
{
    static
    {System.out.println("B.1");
        i = --i - i--;
    }
 
    {System.out.println("B.2");
        i = ++i + i++;
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    { System.out.println("BEFORE instantiate");
       B b=new B();
        System.out.println("after instantiate");
 
      System.out.println(b.i);
    }
}
public class MainClass
{
    public static void main(String[] args)
    {
        Integer i1 = 27;
 
        Integer i2 = 27;
 
        System.out.println(i1 == i2);
 
        Integer i3 = 128;
 
        Integer i4 = 128;
 
        System.out.println(i3 == i4);
    }
}
/*public class MainClass
{
    public static void main(String[] args)
    {
        B b = new B();
        
    }
}
class A
{
    void method(int i)
    {
        //method(int)
    }

	
}
 
class B extends A
{
    @Override
    void method(Integer i)
    {
        //method(Integer)
    }
}
class MainClass{
	public static void main(String[] args){
         String s="        jeevan           ";
         String a=s.trim();
		 char[] c = s.toCharArray();
		int[] i = toInteger(c);
		 byte[] ascii = toBytes(c);
		 System.out.println(s+" ");
		 System.out.println(i+" ");
		 System.out.println(c+" ");
		 System.out.println(a+" ");
		 System.out.println(ascii+" ");


	}

	private static int[] toInteger(char[] c) {
		int[] toRet = new int[c.length];
		for (int i = 0; i < toRet.length; i++) {
			toRet[i]=(int)c[i];
		}
		return toRet;
	}

	private static byte[] toBytes(char[] c) {
		byte[] toRet = new byte[c.length];
		for (int i = 0; i < toRet.length; i++) {
			toRet[i]=(byte)c[i];
		}
		return toRet;
	}
	public static void main(String args[]) 
    {    
         int a = 3;
         int b = 6;
	     int c = a | b;
         int d = a & b;             
         System.out.println(c + " "  + d);
    }   public static void main(String args[]) 
    {    
        double a = 295.04;
        int  b = 300;
        byte c = (byte) a;
        byte d = (byte) b;
        System.out.println(c + " "  + d);
   } public static void main(String args[]) 
   {
       int x = 2;
       int y = 0;
       for ( ; y <  10; ++y) {
           if (y % x == 0) 
               continue;  
           else if (y == 8)
                break;
           else
              System.out.print(y + " ");
       }
  }

}
class MainClass{
	
	 public static void main(String args[]) 
      {
          int array_variable[][] = {{ 1, 2, 3}, { 4 , 5, 6}, { 7, 8, 9}};
          int sum = 0;
          for (int i = 0; i <  3; ++i)
              for (int j = 0; j <   3 ; ++j)
                  sum = sum + array_variable[i][j];
          System.out.print(sum / 5);
      } 
}
*/