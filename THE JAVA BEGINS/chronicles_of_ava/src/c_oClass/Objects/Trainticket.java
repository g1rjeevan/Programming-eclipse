package c_oClass.Objects;
import java.util.Scanner;


class Ticketcounter{

			int tot_ticket=200;


void availableticket(){
						System.out.println("\t"+"Available ticket: "+tot_ticket);
	                  }


void bookticket(int n){
					if(n<=tot_ticket){
						 System.out.println("\t"+n+" tickets has been booked");
						 tot_ticket=tot_ticket-n;
						 }
					else{
						System.out.println("\t"+"Insufficient tickets");
						}
	                  }


void cancelticket(int n){
						System.out.println("\t"+n+" tickets has been cancel");
						tot_ticket=tot_ticket+n;
                        }

}

class Trainticket{
					
					
private static Scanner s;

public static void main(String[] args){ 
	s = new Scanner(System.in);					
	boolean y=true;
	Ticketcounter t1 = new Ticketcounter();
	int x;
	
	System.out.println();
	while(y){
								  System.out.println("\tWelcome to ticket booking counter\n");
								   System.out.println("\tPress 1 to book a ticket");
								   System.out.println("\tPress 2 to cancel a ticket");
								   System.out.println("\tPress 3 to view available ticket");
								   System.out.println("\tPress 4 to close the ticket booking counter \n");
								   x=s.nextInt();
				 
							  switch(x){

								  case 1 : System.out.print("\tEnter the number of tickets to be booked:");
										   x=s.nextInt();
										   t1.bookticket(x);
										   break;
								  case 2 : System.out.println("\tEnter the number of tickets to be cancelled:\t");
										   x=s.nextInt();
										   t1.cancelticket(x);
										   break;
								  case 3 : t1.availableticket();
										   break;
								  case 4 : y=false;
										   break;
									  } 
					  System.out.println();
					  }

						}
				}
