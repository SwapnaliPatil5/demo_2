


package Que2;

import java.util.Scanner;


public class Well {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int days;
		
		 System.out.print("Depth of well : ");
	  int x = sc.nextInt();
	  
	  System.out.print("Daily Climb : ");
	  int y = sc.nextInt();
	  
	  System.out.print("Slip Back : ");
	  int z = sc.nextInt();
	  
	  Well w = new Well();
	  w.calculateDays(x,y,z);
	}

	

	
	public void calculateDays(int x, int y, int z) {
		
		int days = z /(y-z);
		 System.out.println(days);
	}

}
