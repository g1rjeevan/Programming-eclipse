class Pattern16 
{
	
	public static void main(String[] args) 
	{
		int row=13,column=13;
		int mid=(row+1)/2;
		int Sb=(column-row+1),Eb=column;
		
	 for(int i=1;i<=row;i++)
		{ 
		 for(int j=1;j<=column;j++)
			   {    
			     if(j<=Sb)
				{System.out.print("*");}
				else
				{System.out.print(" ");}
			  }
				if(i<mid)
				{Sb++;}
				else
				{Sb--;}
       System.out.println();

		}
	}
}