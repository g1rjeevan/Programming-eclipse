package Loosecoupling;

public class Garage {
	Vehicle v1=null;
	
	Vehicle getVehicle(char type){
		
		if(type=='c'){
		v1=new Car();
		}
	
		else{
		v1=new Bike();
		}
        
        
				return v1;
	}
  
}
