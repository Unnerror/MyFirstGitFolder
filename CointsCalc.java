import java.util.*;

public class CointsCalc {
	
	public static void main(String[] args) {
	    Scanner input = new Scanner (System. in);
	    System.out.print("Enter an integer number of cents: ");
	    int cents = input.nextInt();
	    
	    int loonies = cents / 100;    // same as: cents = cents % 100
	    cents %= 100; 
	    System.out.println("Number of loonies: " + loonies);
	    
	    int quaters = cents / 25;
	    cents %= 25;
	    System.out.println("Number of quaters: " + quaters);
	    
	    int dimes = cents / 10;
	    cents %= 10;
	    System.out.println("Number of dimes: " + dimes);
	    
	    int nickels = cents / 5;
	    cents %= 5;
	    System.out.println("Number of nickels: " + nickels);
	    
	    System.out.println("Number of nickels: " + cents);
	    
	  
		
	}

}
