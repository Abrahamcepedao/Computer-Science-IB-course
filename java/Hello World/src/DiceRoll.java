import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException; 

public class DiceRoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many games do you want to play?");
		int games = input.nextInt();
		System.out.println(games);
		System.out.println("Of how many players?");
		int players = input.nextInt();
		System.out.println(players);
		int points[] = new int[players];
		
		int player[] = new int[players];
		int count = 1;
		while(count <= games) {
			count = count + 1;
			for(int i = 0; i < players; i = i + 1) {
				
				int num1 = (int)(Math.random()*6);
				if (num1 == 0) {
					num1 = (int)(Math.random()*6);
				}
				System.out.println("Your first number is:" + num1);
				int num2 = (int)(Math.random()*6);
				if (num2 == 0) {
					num2 = (int)(Math.random()*6);
				}
				System.out.println("Your second number is:" + num2);
				
				
				
				if(num1 == num2) {
					points[i] = (num1 + num2) * 2;
					System.out.println("Player" + i +  " you total sum is: " + points[i]);
					System.out.println(" ");
				} else {
					points[i] = num1 + num2;
					System.out.println("Player" + i +  " you total sum is: " + points[i]);
					System.out.println(" ");
				}
			}
			boolean okey = true;
			boolean okeyy = true;
			int largest = points[0];
			int winner = player[0];
			for(int x = 1; x< players; x = x + 1){
				
				if(points[x] > largest) {
					largest = points[x];
					winner = x;
					okey = false;
				} 
				if (points[x] == largest) {
					okeyy = false;
				}
				
			}
			if(okey == false) {
				player[winner] = player[winner] + 1;
				System.out.println("Player" + winner + " now you have " + player[winner] + " points");
			} else  if(okey == true){
				player[0] = player[0] + 1;
				System.out.println("Player" + 0 + " now you have " + player[0] + " points");
			} else if (okeyy == false) {
				System.out.println("It is a tie");
			}
			
			
			String enter = input.nextLine();
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			
			
			
		}
		
	}

}