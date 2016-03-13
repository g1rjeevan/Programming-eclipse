package assignMent;

import java.sql.Time;
import java.util.Date;

public class Song implements Comparable{
	String Name;
	String Artist;
	String Album;
	int date;
	int Length;
	Song(String Name,String Artist,String Album,int date,int Length){
		this.Name=Name;
		this.Artist=Artist;
		this.Album=Album;
		this.date=date;
		this.Length=Length;
	}
	
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
