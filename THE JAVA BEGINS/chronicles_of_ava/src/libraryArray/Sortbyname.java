package libraryArray;
import java.util.Comparator;

public class Sortbyname implements Comparator{
	
	public int compare(Object o1,Object o2)
	//From Employee main the argument passed are the 
	{
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		return e1.name.compareTo(e2.name);
	}
}
