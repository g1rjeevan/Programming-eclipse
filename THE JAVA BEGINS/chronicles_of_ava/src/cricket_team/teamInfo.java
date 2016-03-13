package cricket_team;


@SuppressWarnings("rawtypes")
public class teamInfo implements Comparable{

	int nPed, nR, nW;
	String pName;
	
	teamInfo(String pName,int nPed,int nR, int nW){
		this.pName=pName;
		this.nPed=nPed;
		this.nR=nR;
		this.nW=nW;
	}
	public int compareTo(Object arg){
		teamInfo tI=(teamInfo)arg;
		return this.nPed-tI.nPed;
	}
}
