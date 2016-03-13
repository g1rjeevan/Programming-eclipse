package string;

public class ImplementationString implements Modstring{
	
	private String s;

	ImplementationString(String s){
		this.s=s;
	}
	@Override
	public String substring1(int startIndex) {
		char[] c=s.toCharArray();
		int j=0;
		char[] c1=new char[c.length-startIndex];
		String s1=null;
		for (int i = startIndex; i < c.length; i++) {
			
			c1[j]=c[i];
			j++;
		}
		s1=new String(c1);
		return s1;
	}

	@Override
	public String substring1(int startIndex, int endIndex) {
		char[] c=s.toCharArray();
		int j=0,m=0;
	
		char[] c1=new char[endIndex-startIndex];
		
		String s1=null;
		for (int i=startIndex;i<=(endIndex+m);i++){
			try{
			
			c1[j]=c[i];
			j++;
			
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				m--;
			}
		}
		

		s1=new String(c1);
		return s1;
	}

	@Override
	public String concat(String str) {
		String s1=s+str;
		return s1;
	}

	@Override
	public String replace(char original, char replacement) {
		char[] c=s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if(c[i]==original){
				c[i]=replacement;
			}
		}
		String s1=new String(c);
		return s1;
	}

	@Override
	public String trim() {
		String s1=s.trim();
		return s1;
	
		
			}
		
	

}
