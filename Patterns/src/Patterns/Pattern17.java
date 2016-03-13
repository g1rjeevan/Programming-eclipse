package Patterns;


public class Pattern17
{

	
	public static void main(String[] args) 
	{
		int row=13,column=13;
		int mid=(row+1)/2;
		int Sb=(column-row+1),Eb=column,Sb1=(column-row+2),Eb1=column-1;
		
	 for(int i=1;i<=row;i++)
		{ 
		 for(int j=1;j<=column;j++)
			   {    
			     if(j<=Sb||j>=Eb&&(Sb1-Sb)<1||(Eb1-Eb)<1)
				{System.out.print("*");}
				 
				else
				{System.out.print(" ");}
			  }
				if(i<mid)
				{Sb++;Eb--;}
				else
				{Sb--;Eb++;}
       System.out.println();

		}
	}
}


