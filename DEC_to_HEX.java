import java.util.Scanner;

public class DEC_to_HEX {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String userin = null;
		int num_of_entered_values = 0;
		int sum_of_entered_values = 0;
		int max_value = 0;
		int min_value = 0;
		double average_value = 0;
		
		while (true) {
			
			System.out.print("Please enter an integer number or Q to quit: ");		
			userin = in.next();
			
			// checking input
			if (userin.equalsIgnoreCase("Q")) {
				break;
			}
			try {
				Integer.parseInt(userin);
			}
			catch (NumberFormatException exception) {
				continue;
			}
			
			int decimal = Integer.parseInt(userin);
			
			// collecting statitics
			num_of_entered_values++;
			sum_of_entered_values += decimal;
			if (max_value < decimal) {
				max_value = decimal;
			}
			
			if (num_of_entered_values > 0) {
				min_value = (num_of_entered_values == 1) ? decimal :
							(min_value > decimal) ? decimal : min_value;
			}
							
			// hex calc
			String hex = "";
			int remainder = 0;
        		
			 while (decimal > 0) {
				 char value;
                 remainder = decimal % 16;

                 if (remainder < 10) {
                	 value = (char)('0' + remainder);
                 } else {
                	 value = (char)('A' + remainder - 10);
                 }
                 hex = value + hex;
                 decimal /= 16;
             }
						

			System.out.println("Hexa-decimal value of " + Integer.parseInt(userin) + " = " + hex);      
			System.out.println();
		}
			
		average_value = sum_of_entered_values / num_of_entered_values;
		
		System.out.println("\nNumber of values entered = " + num_of_entered_values);
		System.out.println("Sum = " + sum_of_entered_values);
		System.out.println("Max value = " + max_value);
		System.out.println("Min value = " + min_value);
		System.out.println("Average value = " + average_value);
		System.out.println("\nBye for now. Have a great day!");
		
		in.close();


	}
}