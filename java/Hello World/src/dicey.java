import java.util.Scanner;
public class dicey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		for(int i = 0; i < 100; i++) {
			int dice1 = 0;
			while(dice1 == 0) {
				dice1 = (int)(Math.random()*7);
			}
			int dice2 = 0;
			while(dice2 == 0) {
				dice2 = (int)(Math.random()*7);
			}
			System.out.println("Dice1 = " + dice1);
			System.out.println("Dice2 = " + dice2);
			String x = input.nextLine();
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
