package libraryArray;

public class Noticeboardmain {

	public static void main(String[] args) {
		StudentArray[] stArr;
		stArr=new StudentArray[5];
		stArr[0]= new StudentArray(1,"Manga");
		stArr[1]= new StudentArray(2,"conga");
		stArr[2]= new StudentArray(3,"sanga");
		stArr[3]= new StudentArray(4,"tunga");
		stArr[4]= new StudentArray(5,"ranga");
		
		
		System.out.println("------------------------");
		
		
		System.out.println("ID\tName");
		System.out.println("------------------------");
		Noticeboard.display(stArr);
		
		System.out.println("------------------------");
	}

}
