import java.util.Scanner;
public class TipCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("At which restaurant did you go?");
		String rest = input.next();
		System.out.println(rest);
		System.out.println("How much did is the price? in cents");
		double payment = input.nextDouble();
		
		
		
		
		System.out.println("Please answer the following questions, taking into consideration these values:");
		System.out.println("1 = bad");
		System.out.println("2 = can be improved");
		System.out.println("3 = regular");
		System.out.println("4 = not bad");
		System.out.println("5 = excelent");
		
		System.out.println("The first question is:");
		System.out.println("Did you enjoy the food at " + rest + " ?");
		int answer = input.nextInt();
		if (answer > 5) {
			System.out.println("Enter valid number");
			answer = input.nextInt();
		} else if (answer < 1) {
			System.out.println("Enter valid number");
			answer = input.nextInt();
		} else {
			answer = answer;
		}
		System.out.println("Was the service good at " + rest + " ?");
		int answer2 = input.nextInt();
		if (answer2 > 5) {
			System.out.println("Enter valid number");
			answer2 = input.nextInt();
		} else if (answer2 < 1) {
			System.out.println("Enter valid number");
			answer2 = input.nextInt();
		} else {
			answer2 = answer2;
		}
		System.out.println("Did you like the place");
		int answer3 = input.nextInt();
		if (answer3 > 5) {
			System.out.println("Enter valid number");
			answer3 = input.nextInt();
		} else if (answer3 < 1) {
			System.out.println("Enter valid number");
			answer3 = input.nextInt();
		} else {
			answer3 = answer3;
		}
		System.out.println("Would you recommend  " + rest + " ?");
		int answer4 = input.nextInt();
		if (answer4 > 5) {
			System.out.println("Enter valid number");
			answer4 = input.nextInt();
		} else if (answer4 < 1) {
			System.out.println("Enter valid number");
			answer4 = input.nextInt();
		} else {
			answer4 = answer4;
		}
		System.out.println("Would you like to go back to " + rest + " ?");
		int answer5 = input.nextInt();
		if (answer5 > 5) {
			System.out.println("Enter valid number");
			answer5 = input.nextInt();
		} else if (answer5 < 1) {
			System.out.println("Enter valid number");
			answer5 = input.nextInt();
		} else {
			answer5 = answer5;
		}
		
		float average = (float)(answer + answer2 + answer3 + answer4 + answer5)/5;
		System.out.println(average);
		
		float average2 = average * 5;
		
		
		float tip = (float)(payment * ((average2 / 100) + 1));
		System.out.println("Your final payment plus the tip is: " + tip);
		
		
		
	}
}




