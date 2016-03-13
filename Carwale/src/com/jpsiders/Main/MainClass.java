package com.jpsiders.Main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.jspiders.DB.DBonObject;
import com.jspiders.User.DisplayAllCars;
import com.jspiders.User.DisplayGivenCar;
import com.jspiders.User.DisplayOnRoadPrice;
import com.jspiders.admin.DeleteTheCar;
import com.jspiders.admin.DeleteTheState;
import com.jspiders.admin.InsertCar;
import com.jspiders.admin.InsertNewStateTax;
import com.jspiders.admin.UpdateTheCar;
import com.jspiders.admin.UpdateTheStateTax;

public class MainClass {
	public static void main(String[] args) throws IOException{

		Scanner scan=new Scanner(System.in);

		Connection con=DBonObject.conObject();
		try{
			
				con.setAutoCommit(false);
			

			System.out.println("Enter the 1 for ADMIN and 2 for USER");

			int choice=scan.nextInt();

			switch (choice) {
			case 1:{System.out.println("Enter respective number to perform action");

			System.out.println("press 1 Insert Car");

			System.out.println("press 2 Insert The State");

			System.out.println("press 3 Update The Car Details");

			System.out.println("press 4 Update The State Details");

			System.out.println("press 5 Delete The Car Details");

			System.out.println("press 6 Delete The State Details");

			int choice1=scan.nextInt();

			switch (choice1) {

			case 1:{
				Carwale i1=new InsertCar();
				i1.insertcar(con);


			}

			break;

			case 2:{
				Carwale i2=new InsertNewStateTax();
				i2.insertstate(con);
			}

			break;

			case 3:{
				Carwale u1=new UpdateTheCar();
				u1.updatecar(con);

			}

			break;

			case 4:{
				Carwale u2=new UpdateTheStateTax();
				u2.updatestate(con);
			}

			break;

			case 5:{
				Carwale d1=new DeleteTheCar();
				d1.deletecar(con);
			}

			break;

			case 6:{
				Carwale d2=new DeleteTheState();
				d2.deletestate(con);
			}

			break;

			default:System.err.println("Invalid Key Entry");
			break;
			}
			}

			break;

			case 2:{
				System.out.println("press 1 Display All Car Details");
				System.out.println("press 2 Display Given Car Details");
				System.out.println("press 3 Display The Given Car's On-Road Price");
				int choice2=scan.nextInt();

				switch (choice2) {

				case 1:{ Carwale da1=new  DisplayAllCars();
				da1.displayallcars(con);

				}

				break;

				case 2:{
					Carwale da2=new DisplayGivenCar();
					da2.displaygivencars(con);

				}

				break;

				case 3:{
					Carwale da3=new DisplayOnRoadPrice();
					da3.displayonroadprice(con);
				}

				break;



				default:System.err.println("Invalid Key Entry");
				break;
				}
			}

			break;

			default:System.err.println("Invalid Key Entry");
			break;
			}

			con.commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try {
				if(con!=null){
						con.close();
					} 
				scan.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}
}