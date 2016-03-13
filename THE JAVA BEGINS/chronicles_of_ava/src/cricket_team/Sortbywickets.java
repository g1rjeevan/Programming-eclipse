package cricket_team;

import java.util.Comparator;


@SuppressWarnings("rawtypes")
public class Sortbywickets implements Comparator{
		
		public int compare(Object o1,Object o2)
		//From Players main the argument passed are the 
		{
			teamInfo tiArr1=(teamInfo)o1;
			teamInfo tiArr2=(teamInfo)o2;
			return tiArr1.nW-tiArr2.nW;
		}


	}

