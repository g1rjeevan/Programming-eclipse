

import java.util.Comparator;



@SuppressWarnings("rawtypes")
public class Sortbyname implements Comparator{
	
	public int compare(Object o1,Object o2)
	//From Employee main the argument passed are the 
	{
		teamInfo e1=(teamInfo)o1;
		teamInfo e2=(teamInfo)o2;
		return e1.pName.compareTo(e2.pName);
	}
}
