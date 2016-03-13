package libraryArray;

public class Penmain {

	public static void main(String[] args) {
		
		System.out.println("**************************");
		System.out.println();
		Pen[] arr1=new Pen[20];//Array of interface type
		//Array of Pen type
		int count=0,bpcount=0,mpcount=0,spcount=0;
		arr1[0]=new Ballpen("Blue",10.25);
		arr1[1]=new Sketchpen("Blue",20.25);
		arr1[2]=new Markerpen("Blue",25.25);
		arr1[3]=new Ballpen("Red",11.25);
		arr1[4]=new Sketchpen("Red",21.25); 
		arr1[5]=new Markerpen("Red",26.25);
		arr1[6]=new Ballpen("Green",12.25);
		arr1[7]=new Sketchpen("Green",22.25);
		arr1[8]=new Markerpen("Green",27.25);
		
		System.out.println("Total capacity : "+arr1.length);
		for (int j = 0; j < arr1.length; j++) {
			if(arr1[j]!=null){
				count++;
				if(arr1[j]instanceof Ballpen)
					bpcount++;
				else if(arr1[j]instanceof Markerpen)
					mpcount++;
				else if(arr1[j]instanceof Sketchpen)
					spcount++;
			}
		}
		System.out.println();
		System.out.println("Total pen available: "+count);
		System.out.println();
		System.out.println("Total  Ballpen available: "+bpcount);
		System.out.println();
		System.out.println("Total Markerpen available: "+mpcount);
		System.out.println();
		System.out.println("Total Sketchpen available: "+spcount);
		System.out.println();
		System.out.println("**************************");
	}

}
