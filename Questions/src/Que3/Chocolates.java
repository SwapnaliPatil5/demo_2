package Que3;

public class Chocolates {
	public static void main(String[]args){
	 int credits = 15;
	 
    int chocobars = 0;
    
    while (credits<=15&&credits>0) {
    	for (int i=1; i<=3; i++) {
    		chocobars++;
    		credits--;
    	}
    	chocobars=chocobars+1;              //as wrapper is returned
    }
    System.out.println("Total ChocoBars : " +chocobars);	
	
	}
}
