package tests;
import javax.swing.JOptionPane;

public class Without_3rd_variable_swap {
public static void main(String[] args) {
	System.out.println("----------------");
	String fn = JOptionPane.showInputDialog("enter the first number");
	String sn = JOptionPane.showInputDialog("enter the second number");
	
	int i=Integer.parseInt(fn);
	int j=Integer.parseInt(sn);
	System.out.println();
	System.out.println(i);
	System.out.println(j);
	i=i+j;
	System.out.println();
	System.out.println("----------------");
	System.out.println();
	System.out.println(i);
	System.out.println(j);
	j=i-j;
	System.out.println();
	System.out.println("----------------");
	System.out.println();
	System.out.println(i);
	System.out.println(j);
	i=i-j;
	System.out.println();
	System.out.println("----------------");
	System.out.println();
	System.out.println(i);
	System.out.println(j);
	System.out.println();
	JOptionPane.showMessageDialog(null, "the swap between two numbers "+fn+" and "+sn+" without using 3rd variable "+ i+" and "+j , "RESULT", JOptionPane.PLAIN_MESSAGE);
	System.out.println("----------------");
	
}
}

