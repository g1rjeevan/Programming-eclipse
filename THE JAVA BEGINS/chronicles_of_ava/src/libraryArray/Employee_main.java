package libraryArray;
import java.util.Arrays;
public class Employee_main {

	public static void main(String[] args) {
		System.out.println("******************");
		Employee[] empArr=new Employee[5];
		empArr[0]=new Employee(3265,"Vinay",12565.25);
		empArr[1]=new Employee(1245,"Suresh",39298.33);
		empArr[2]=new Employee(1212,"Ramesh",22342.23);
		empArr[3]=new Employee(1221,"Hemanth",25565.32);
		empArr[4]=new Employee(5343,"Theju",75535.67);
		
		System.out.println();
		System.out.println("Unsorted Employee Data");
		for (int i = 0; i < empArr.length; i++) {
			System.out.println(empArr[i].id+"\t"+empArr[i].name+"\t"
					+empArr[i].salary);
		}
		
		Arrays.sort(empArr);
		System.out.println();
		System.out.println("Sorted Employee Data - idWise");
		
		for (int i = 0; i < empArr.length; i++) {
			System.out.println(empArr[i].id+"\t"+empArr[i].name+"\t"
					+empArr[i].salary);
		}
		
		Sortbysalary salaryWise = new Sortbysalary();
		
		Arrays.sort(empArr,salaryWise);
		System.out.println();
		System.out.println("Sorted Employee Data - salaryWise");
		for (int j = 0; j < empArr.length; j++) {
			System.out.println(empArr[j].id+"\t"+empArr[j].name+"\t"
					+empArr[j].salary);
		}
		
        Sortbyname nameWise = new Sortbyname();
		
		Arrays.sort(empArr,nameWise);
		System.out.println();
		System.out.println("Sorted Employee Data - nameWise");
		for (int k = 0; k < empArr.length; k++) {
			System.out.println(empArr[k].id+"\t"+empArr[k].name+"\t"
					+empArr[k].salary);
		}
		System.out.println("******************");
	
	}

}
