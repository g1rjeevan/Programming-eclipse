package Patterns;

class Pattern20
{
	public static void main(String[] args) 
	{    int row=3,col=3,mid=col/2,star=1;
		for(int i=0;i<=row;i++)
		{
			for (int j=0;j<=col;j++)
			{
			for(int k=0;k<star;k++)
				{
                 System.out.print("*");
				}
				if(mid>i)
				{
					star++;
					
				}
				else
				{
					star--;
				}
				System.out.println();
            }
		}
		
	}
}
