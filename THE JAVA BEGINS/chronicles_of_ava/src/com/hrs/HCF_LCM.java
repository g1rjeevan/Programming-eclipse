package com.hrs;

public class HCF_LCM {

	public static void main(String[] args) {
		int n1=12,n2=48,p=(n1*n2);
		
		int hcf=1,i,lcm = 0;
		for(i=2;i<p;i++)
		{
			if(((n1%i)==0)&&((n2%i)==0))
			{
			hcf=i;
			}
			
		}
		lcm=p/hcf;
		System.out.println(hcf);
		System.out.println(lcm);

	}

	
}

