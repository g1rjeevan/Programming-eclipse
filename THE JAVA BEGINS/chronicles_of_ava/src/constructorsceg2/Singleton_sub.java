package constructorsceg2;

public class Singleton_sub 
{
	private static Singleton_sub myObj;
    
	static{
        myObj = new Singleton_sub();
    }
    public Singleton_sub() 
    {
    	testMe();
    }
	     
    public static Singleton_sub getInstance()
	{
	        return myObj;
    }
	     
	public void testMe()
    {
	        System.out.println("Hey.... it is working!!!");
    }

}
