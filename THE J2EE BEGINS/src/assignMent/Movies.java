package assignMent;

import java.sql.Time;
import java.util.Date;

public class Movies implements Comparable{
	String MovieName;
	String Actor;
	String Actress;
	int ratings;
	Time Length;
	Movies(String MovieName,String Actor,String Actress,int ratings,Time Length){
		this.MovieName=MovieName;
		this.Actor=Actor;
		this.Actress=Actress;
		this.ratings=ratings;
		this.Length=Length;
	}
	
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
