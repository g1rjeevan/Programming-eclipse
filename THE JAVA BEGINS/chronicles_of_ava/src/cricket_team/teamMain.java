package cricket_team;

import java.util.Arrays;


public class teamMain {
 @SuppressWarnings("unchecked")
public static void main(String[] args) {
	
		teamInfo[] tiArr=new teamInfo[11];
		tiArr[0]=new teamInfo("SACHIN",50,5000,24);
		tiArr[1]=new teamInfo("KOHLI",35,2900,13);
		tiArr[2]=new teamInfo("M.S.DOHNI",40,2000,10);
		tiArr[3]=new teamInfo("YUVI",24,1900,14);
		tiArr[4]=new teamInfo("DRAVID",38,5500,5);
		tiArr[5]=new teamInfo("SEHWAG",50,4900,28);
		tiArr[6]=new teamInfo("H.B.SINGH",40,400,129);
		tiArr[7]=new teamInfo("A.KUMBLE",45,800,200);
		tiArr[8]=new teamInfo("P.PATEL",20,1500,2);
		tiArr[9]=new teamInfo("S.DHAWAN",30,2791,9);
		tiArr[10]=new teamInfo("R.UTHAPPA",43,3557,12);
		
		
		System.out.println("Unsorted Players Data");
		System.out.println("MATCHS PLAYED"+"\t"+"PLAYERS NAME"+"\t"
				+"RUNS"+"\t"+"WICKETS");
		
		
		for (int i = 0; i < tiArr.length; i++) {
			System.out.println(tiArr[i].nPed+"\t\t"+tiArr[i].pName+"    \t"
					+tiArr[i].nR+"\t"+tiArr[i].nW);
		}
		
		Arrays.sort(tiArr);
		System.out.println();
		System.out.println("Sorted Players Data - MATCH PLAYED Wise");
		System.out.println("MATCHS PLAYED"+"\t"+"PLAYERS NAME"+"\t"
				+"RUNS"+"\t"+"WICKETS");
		
		for (int i = 0; i < tiArr.length; i++) {
			System.out.println(tiArr[i].nPed+"\t\t"+tiArr[i].pName+"    \t"
					+tiArr[i].nR+"\t"+tiArr[i].nW);
		}
		

		SortbyRuns runWise = new SortbyRuns();
		Arrays.sort(tiArr,runWise);
		System.out.println();
		System.out.println("Sorted Players Data - RUNS Wise");
		System.out.println("MATCHS PLAYED"+"\t"+"PLAYERS NAME"+"\t"
				+"RUNS"+"\t"+"WICKETS");
		for (int i = 0; i < tiArr.length; i++) {
			System.out.println(tiArr[i].nPed+"\t\t"+tiArr[i].pName+"    \t"
					+tiArr[i].nR+"\t"+tiArr[i].nW);
		}
		Sortbyname nameWise=new Sortbyname();
		Arrays.sort(tiArr,nameWise);
		System.out.println();
		System.out.println("Sorted Players Data - NAME Wise");
		System.out.println("MATCHS PLAYED"+"\t"+"PLAYERS NAME"+"\t"
				+"RUNS"+"\t"+"WICKETS");
		for (int i = 0; i < tiArr.length; i++) {
			System.out.println(tiArr[i].nPed+"\t\t"+tiArr[i].pName+"    \t"
					+tiArr[i].nR+"\t"+tiArr[i].nW);
		}
		Sortbywickets wicketsWise = new Sortbywickets();
		Arrays.sort(tiArr,wicketsWise);
		System.out.println();
		System.out.println("Sorted Players Data - WICKETS Wise");
		System.out.println("MATCHS PLAYED"+"\t"+"PLAYERS NAME"+"\t"
				+"RUNS"+"\t"+"WICKETS");
		for (int i = 0; i < tiArr.length; i++) {
			System.out.println(tiArr[i].nPed+"\t\t"+tiArr[i].pName+"    \t"
					+tiArr[i].nR+"\t"+tiArr[i].nW);
		}
}
}
