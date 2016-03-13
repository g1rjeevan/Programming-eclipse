
public class Pattern1
{
    public static void main(String[] args)
      {
	     int line=10,space=line-1;
	    
	     for( int i=0;i<line;i++)
		    {
		    	System.out.print("*");
		      for (int j=0;j<space;j++)
		       {  
		    	  
		    	  System.out.print("-");
		       }
		      
		    	  System.out.print("*");
		    	  space++;
		    	  System.out.println();
		     }
	    
	    
	     for( int i=0;i<line;i++)
	     {
	    	System.out.print("*");
	      for (int j=0;j<space;j++)
	       {  
	    	  
	    	  System.out.print("-");
	       }
	      
	    	  System.out.print("*");
	    	  space--;
	    	  System.out.println();
	     }
      }
}

