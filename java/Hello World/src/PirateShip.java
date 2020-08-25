import java.util.Scanner;
public class PirateShip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean prove = false;
		int count = 0;
		 do {
			 count = count + 1;
			 int gold = (int)(Math.random()*100);
			 System.out.println("gold equals: " + gold);
			 int pirate = (int)(Math.random()*100);
			 System.out.println("pirates equals: " + pirate);
			 if ((pirate <= gold)||(pirate + gold <= 100)) {
				 prove = true;
				 System.out.println("You got it right in the " + count + " time");
				 return ;
			 } else {
				 prove = false;
			 } 
		 } while (prove == false);
		 int c = 1000000000;
		 
		
		 for(int i = 0; i <(c * c * c); i++) {
			 System.out.println(c);
		 }
		
			 
	}

}
