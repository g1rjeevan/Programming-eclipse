package Loosecoupling;

public class Employee {

	Vehicle v1;
	void initVehicle(Vehicle v1){
		this.v1=v1;
		
	}
	void commute(){
		v1.start();
		v1.move();
		v1.stop();
	}
}
