import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class gMain12
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name ");
		String s1=s.nextLine();
		gMain12 g=new gMain12();
		s1=g.gName(s1);
		System.out.println();
		System.out.println(s1);
		s.close();

	}
	public String gName(String name)
	{
		HashSet<Integer> l1=new HashSet<Integer>();
		for (int i = 6; i<=15; i++) {
			l1.add(i);
		}
		List<Integer> l3 = new ArrayList<Integer>(l1);//casting hashset to list for to use the shuffle from list 
		
		Collections.shuffle(l3);//Generating a shuffle which will relocate 
		//all the order of insertion in HashSet object l1.

		Object j=l3.get(5);		//here retrieving the integer at index 5 in the l1.
		return name+" "+j;
	}
}
