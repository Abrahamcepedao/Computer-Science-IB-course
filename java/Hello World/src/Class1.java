
import java.util.Scanner;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myVar = new Scanner(System.in);
		
		System.out.println("How many numbers do you want to sum up?");
		int number = myVar.nextInt();
		double sum = 0;
		double[] array = new double[number];
		for (int i = 0; i < number; i++) {
			array[i] = Math.random()*100000;
			System.out.println(array[i]);
			sum = sum + array[i];
		}
		System.out.println("Your total sum is: " + sum);
		
		
	}
	
}
