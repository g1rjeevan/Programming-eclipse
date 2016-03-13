package assignMent;

import java.util.List;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class PlaylistShuffler {

	public static void main(String[] args) {

		LinkedList<Song> l1=new LinkedList<Song>();
		//ArrayList l2=new ArrayList();
		
		l1.add(new Song("Hello\t\t","ADELE\t\t","Best of Oct15\t",2015,0455));
		l1.add(new Song("See you again ","Wiz Khalifa\t","Best of 15\t",2015,0322));
		l1.add(new Song("The Other Side","Jason Duerolo\t","Best of 14\t",2014,0455));
		l1.add(new Song("Beautiful Now\t","Zeddft.Benllion","Best of Aug'15\t",2015,0433));
		l1.add(new Song("Papercut\t","Zedd\t\t","Best of Aug'15\t",2015,0444));
		l1.add(new Song("Unbelievable\t","Owl City\t","Best of Jul'15\t",2015,0431));
		List<Song> l=(List<Song>) l1;
		Iterator<Song> i=l.iterator();

		System.out.println("Before Shuffle");
		System.out.println();
		System.out.println("No.SONG NAME\t ALBUM\t\t ARTIST \t RELEASE LENGTH");
		
		int i3=1;
		while(i.hasNext()){
			Song x=i.next();
			System.out.println(i3+" "+x.Name+" "+x.Album+" "+x.Artist+" "+x.date+" \t "+x.Length);
			i3++;
		}
		Collections.shuffle(l);
		System.out.println();
		System.out.println("After Shuffle");
		System.out.println();
		System.out.println("No.SONG NAME\t ALBUM\t\t ARTIST \t RELEASE LENGTH");
		Iterator<Song> i1=l.iterator();
		
		i3=1;
		while(i1.hasNext()){
			Song x=i1.next();
			System.out.println(i3+" "+x.Name+" "+x.Album+" "+x.Artist+" "+x.date+" \t "+x.Length);
			i3++;
		}
	}
}
