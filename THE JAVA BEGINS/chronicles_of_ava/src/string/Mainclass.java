package string;

public class Mainclass {

	public static void main(String[] args) {
            ImplementationString i= new ImplementationString("   imamotherfucker     ");
            String s=i.substring1(3);
            System.out.println(s);
            String s1=i.substring1(4,11);
            System.out.println(s1);
            String s2=i.concat("bitch");
            System.out.println(s2);
            String s3=i.replace('m', 's');
            System.out.println(s3);
            String s4=i.trim();
            System.out.println(s4);
            
            
	}

}
