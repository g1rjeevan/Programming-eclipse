package Patterns;

class Pattern1 
{
	public static void main(String[] args) 
	{
		int row=4,column=4,a=1;
	 for(int i=1;i<=row;i++)
		{
		 for(int j=1;j<=column;j++)
			{
			if(a<5)
				{
                 System.out.print(a);
				 a++;
				}
            else
				{
				System.out.print(a);
				a=1;
				}
				
			}
			System.out.println(" ");

		}
	}
}
