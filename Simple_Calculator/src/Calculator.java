import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		//Declare variables
		
		int number_1;
		int number_2;
		String operator;
		String resultText = "The result is ";
		String tryAgainText = "Something wrong, please try again... \n";
		
		Scanner input = new Scanner(System.in);
		
		do {
			//Assigning values to the variables
			System.out.println("Please inter first number:");
			number_1 = input.nextInt();
			
			System.out.println("Please inter operator:");
			operator = input.next();
			
			System.out.println("Please inter second number:");
			number_2 = input.nextInt();
			
			//main code (logic)
			if (operator.equals("+")) {
				System.out.println(resultText + (number_1 + number_2) + "\n");
			}
			else if (operator.equals("-")) {
				System.out.println(resultText + (number_1 - number_2) + "\n");
			}
			else if (operator.equals("*")) {
				System.out.println(resultText + (number_1 * number_2) + "\n");
			}
			else if (operator.equals("/")) {
				System.out.println(resultText + (number_1 / number_2) + "\n");
			}
			else{
				System.out.println(tryAgainText);
			}
			
		} while(true);

	}

}
