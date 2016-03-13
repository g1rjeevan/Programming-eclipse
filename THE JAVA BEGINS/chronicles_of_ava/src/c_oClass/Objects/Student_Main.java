package c_oClass.Objects;
import java.util.Scanner;
class Student
{
 String name, gender, bloodtype, branch, USN,YOS,YOP,DOB;
 int score;
 void info()
	{ name="RAVI";
      gender="MALE";
	  bloodtype="A+";
	  branch="EEE";
	  USN="1DT12EE417";
      YOS="2012";
	  YOP="2015";
	  DOB="18 nov 1992";
      System.out.println("  Student name:"+name);
	  System.out.println("  Student gender:"+gender);
	  System.out.println("  Student bloodtype:"+bloodtype);
	  System.out.println("  Student branch:"+branch);
	  System.out.println("  Student YOS:"+YOS);
	  System.out.println("  Student YOP:"+YOP);
	  System.out.println("  Student DOB:"+DOB);
	  System.out.println("  Student USN:"+USN);
	}
  void marks()
	  {
       if(score>=70)
		   System.out.println(name+" passed in First class distinction");
	   else if(score>=60)
           System.out.println(name+" passed in First class ");
	   else
		   System.out.println(name+" passed in second class distinction");
	  
	  }



	
}
class Student_Main
{
     static int j;
	private static Scanner s1;
public static void main(String[] args) 
	{   
	    s1 = new Scanner(System.in);
        Student stud1 = new Student();
        System.out.println("  Program started");
		stud1.info();
        System.out.println("  Enter the percentage :");
	    
		
        j=s1.nextInt();
		stud1.score=j;
		
		stud1.marks();


		System.out.println("  Program ended");
	}
}
