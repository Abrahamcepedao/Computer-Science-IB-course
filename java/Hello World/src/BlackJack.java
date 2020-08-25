import java.util.Scanner;
public class BlackJack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myVar = new Scanner(System.in);
		
		
		int player1 = 0;
		int player2 = 0;
		
		System.out.println("How many games do you want to play?");
		int number = myVar.nextInt();
		int games = -1;
		while(games < (number*2 - 2)) {
			games = games + 1;
			if(games % 2 == 0) {
				System.out.println("It is your turn player1");
				int a = (int)(Math.random()*11);
				while (a == 0) {
					a = (int)(Math.random()*11);
				}
				System.out.println(a);
				int b = (int)(Math.random()*11);
				while (b == 0) {
					b = (int)(Math.random()*11);
				}
				System.out.println(b);
				int sum = a + b;
				System.out.println("Your current sum is: " + sum);
				System.out.println("Do you want another number? 0 = yes, no = any other number");
				int yes = myVar.nextInt();
				if(yes == 0) {
					System.out.println(yes);
					int three = (int)(Math.random()*11);
					while (three == 0) {
						three = (int)(Math.random()*11);
					}
					System.out.println("this is your third card: " + three);
					sum = a + b + three;
					System.out.println("Now your current sum is: " + sum);
					if (sum <= 21) {
						System.out.println("The sum of your cards is: " + sum);
					} else if(a == 11) {
						a = 1;
						System.out.println("You need a another card since your sum is greater than 21");
						int c = (int)(Math.random()*11);
						while (b == 0) {
							b = (int)(Math.random()*11);
						}
						System.out.println("This is your extra card: " + c);
						sum = a + b + c + three;
						System.out.println("The sum of your cards is: " + sum);
					} else if(b == 11){
						b = 1;
						System.out.println("You need a another card since your sum is greater than 21");
						int c = (int)(Math.random()*11);
						while (c == 0) {
							c = (int)(Math.random()*11);
						}
						System.out.println("This is your extra card: " + c);
						sum = a + b + c + three;
						System.out.println("The sum of your cards is: " + sum);
					} else if(three == 11){
						three = 1;
						System.out.println("You need a another card since your sum is greater than 21");
						int c = (int)(Math.random()*11);
						while (c == 0) {
							c = (int)(Math.random()*11);
						}
						System.out.println("This is your extra card: " + c);
						sum = a + b + c + three;
						System.out.println("The sum of your cards is: " + sum);
					} else {
						System.out.println("The sum of your cards is: " + sum);
						System.out.println("You will probably lose");
					}
				} else {
					System.out.println("Ok then your current sum is still: " + sum);
					if (sum <= 21) {
						System.out.println("The sum of your cards is: " + sum);
					} else if(a == 11) {
						a = 1;
						System.out.println("You need a another card since your sum is greater than 21");
						int c = (int)(Math.random()*11);
						while (c == 0) {
							c = (int)(Math.random()*11);
						}
						System.out.println("This is your extra card: " + c);
						sum = a + b + c;
						System.out.println("The sum of your cards is: " + sum);
					} else if(b == 1){
						b = 1;
						System.out.println("You need a another card since your sum is greater than 21");
						int c = (int)(Math.random()*11);
						while (c == 0) {
							c = (int)(Math.random()*11);
						}
						System.out.println("This is your extra card: " + c);
						sum = a + b + c;
						System.out.println("The sum of your cards is: " + sum);
					} else {
						System.out.println("The sum of your cards is: " + sum);
					}
				}
				 
				System.out.println("Now it is your turn player2");
				int d = (int)(Math.random()*11);
				while (d == 0) {
					d = (int)(Math.random()*11);
				}
				System.out.println(d);
				int e = (int)(Math.random()*11);
				while (e == 0) {
					e = (int)(Math.random()*11);
				}
				System.out.println(e);
				int sum2 = d + e;
				System.out.println("Your current sum is: " + sum2);
				System.out.println("Do you want another number? 0 = yes, no = any other number");
				int no = myVar.nextInt();
				if(no == 0) {
					int three2 = (int)(Math.random()*11);
					while (three2 == 0) {
						three2 = (int)(Math.random()*11);
					}
					System.out.println("this is your third card: " + three2);
					sum2 = d + e + three2;
					System.out.println("Now your current sum is: " + sum2);
					if (sum2 <= 21) {
						System.out.println("The sum of your cards is: " + sum2);
					} else if(d == 11) {
						d = 1;
						System.out.println("You need a third card since your sum is greater than 21");
						int f = (int)(Math.random()*11);
						if (f == 0) {
							f = 1;
						}
						System.out.println("This is your extra card: " + f);
						sum2 = d + e + f + three2;
						System.out.println("The sum of your cards is: " + sum2);
					} else if(e == 11){
						e = 1;
						System.out.println("You need a third card since your sum is greater than 21");
						int f = (int)(Math.random()*11);
						if (f == 0) {
							f = 1;
						}
						System.out.println("This is your extra card: " + f);
						sum2 = d + e + f + three2;
						System.out.println("The sum of your cards is: " + sum2);
					} else if (three2 == 11){
						three2 = 1;
						System.out.println("You need a third card since your sum is greater than 21");
						int f = (int)(Math.random()*11);
						if (f == 0) {
							f = 1;
						}
						System.out.println("This is your extra card: " + f);
						sum2 = d + e + f + three2;
						System.out.println("The sum of your cards is: " + sum2);
					} else {
						System.out.println("The sum of your cards is: " + sum2);
					}
				} else {
					System.out.println("Ok then your current sum is still: " + sum2);
					if (sum2 <= 21) {
						System.out.println("The sum of your cards is: " + sum2);
					} else if(d == 11) {
						d = 1;
						System.out.println("You need a third card since your sum is greater than 21");
						int f = (int)(Math.random()*11);
						if (f == 0) {
							f = 1;
						}
						System.out.println("This is your extra card: " + f);
						sum2 = d + e + f;
						System.out.println("The sum of your cards is: " + sum2);
					} else if (e == 11){
						e = 1;
						System.out.println("You need a third card since your sum is greater than 21");
						int f = (int)(Math.random()*11);
						if (f == 0) {
							f = 1;
						}
						System.out.println("This is your extra card: " + f);
						sum2 = d + e + f;
						System.out.println("The sum of your cards is: " + sum2);
					} else {
						System.out.println("The sum of your cards is: " + sum2);
					}
				}
				if (sum > 21) {
					sum = 0;
				} else if(sum2 > 21) {
					sum2 = 0;
				}
				if ((sum > sum2)&&(sum <= 21)){
					player1 = player1 + 1;
					System.out.println("You won this round player1, congratulations! You have: " + player1 + "points");
				} else if ((sum2 > sum)&&(sum2 <= 21)){
					player2 = player2 + 1;
					System.out.println("You won this round player2, congratulations! You have: " + player2 + "points\"");
				} else if((sum == sum2)&&(sum <= 21)&&(sum2 <= 21)){
					System.out.println("It is a tie, so both get a point");
					player1 = player1 + 1;
					player2 = player2 + 1;
					System.out.println("Player1 you have: " + player1 + "points");
					System.out.println("Player2 you have: " + player2 + "points");
				} else {
					System.out.println("No one won");
					System.out.println("Player1 you have: " + player1 + "points");
					System.out.println("Player2 you have: " + player2 + "points");
				}
			
			
			} else {
				System.out.println("It is your turn player2");
				int a = (int)(Math.random()*11);
				if (a == 0) {
					a = 1;
				}
				System.out.println(a);
				int b = (int)(Math.random()*11);
				if (b == 0) {
					b = 1;
				}
				System.out.println(b);
				int sum = a + b;
				System.out.println("Your current sum is: " + sum);
				System.out.println("Do you want another number? 0 = yes, no = any other number");
				int yes = myVar.nextInt();
				if(yes == 0) {
					System.out.println(yes);
					int three = (int)(Math.random()*11);
					if (three == 0) {
						three = 1;
					}
					System.out.println("This is your third card: " + three);
					sum = a + b + three;
					System.out.println("Now your current sum is: " + sum);
					if (sum <= 21) {
						System.out.println("The sum of your cards is: " + sum);
					} else if(a == 11) {
						a = 1;
						System.out.println("You need a third card since your sum is greater than 21");
						int c = (int)(Math.random()*11);
						if (c == 0) {
							c = 1;
						}
						System.out.println("This is your extra card: " + c);
						sum = a + b + c + three;
						System.out.println("The sum of your cards is: " + sum);
					} else if(b == 11){
						b = 1;
						System.out.println("You need a third card since your sum is greater than 21");
						int c = (int)(Math.random()*11);
						if (c == 0) {
							c = 1;
						}
						System.out.println("This is your extra card: " + c);
						sum = a + b + c + three;
						System.out.println("The sum of your cards is: " + sum);
					} else if(three == 11){
						three = 1;
						System.out.println("You need a third card since your sum is greater than 21");
						int c = (int)(Math.random()*11);
						if (c == 0) {
							c = 1;
						}
						System.out.println("This is your extra card: " + c);
						sum = a + b + c + three;
						System.out.println("The sum of your cards is: " + sum);
					} else {
						System.out.println("The sum of your cards is: " + sum);
						System.out.println("You will probably lose");
					}
				} else {
					System.out.println(yes);
					System.out.println("Ok then your current sum is still: " + sum);
					if (sum <= 21) {
						System.out.println("The sum of your cards is: " + sum);
					} else if(a == 11) {
						a = 1;
						System.out.println("You need a third card since your sum is greater than 21");
						int c = (int)(Math.random()*11);
						if (c == 0) {
							c = 1;
						}
						System.out.println("This is your extra card: " + c);
						sum = a + b + c;
						System.out.println("The sum of your cards is: " + sum);
					} else if(b == 11){
						b = 1;
						System.out.println("You need a third card since your sum is greater than 21");
						int c = (int)(Math.random()*11);
						if (c == 0) {
							c = 1;
						}
						System.out.println("This is your extra card: " + c);
						sum = a + b + c;
						System.out.println("The sum of your cards is: " + sum);
					} else {
						System.out.println("The sum of your cards is: " + sum);
						System.out.println("You will probably lose");
					}
				}
				 
				System.out.println("Now it is your turn player1");
				System.out.println("It is your turn player1");
				int d = (int)(Math.random()*11);
				if (d == 0) {
					d = 1;
				}
				System.out.println(d);
				int e = (int)(Math.random()*11);
				if (e == 0) {
					e = 1;
				}
				System.out.println(e);
				int sum2 = d + e;
				System.out.println("Your current sum is: " + sum2);
				System.out.println("Do you want another number? 0 = yes, no = any other number");
				int no = myVar.nextInt();
				if(no == 0) {
					int three2 = (int)(Math.random()*11);
					System.out.println("This is your thrid card: " + three2);
					sum2 = d + e + three2;
					System.out.println("Now your current sum is: " + sum2);
					if (sum2 <= 21) {
						System.out.println("The sum of your cards is: " + sum2);
					} else if(d == 11) {
						d = 1;
						System.out.println("You need a third card since your sum is greater than 21");
						int f = (int)(Math.random()*11);
						if (f == 0) {
							f = 1;
						}
						System.out.println("This is your extra card: " + f);
						sum2 = d + e + f + three2;
						System.out.println("The sum of your cards is: " + sum2);
					} else if(e == 11){
						e = 1;
						System.out.println("You need a third card since your sum is greater than 21");
						int f = (int)(Math.random()*11);
						if (f == 0) {
							f = 1;
						}
						System.out.println("This is your extra card: " + f);
						sum2 = d + e + f + three2;
						System.out.println("The sum of your cards is: " + sum2);
					} else if(three2 == 11) {
						three2 = 1;
						System.out.println("You need a third card since your sum is greater than 21");
						int f = (int)(Math.random()*11);
						if (f == 0) {
							f = 1;
						}
						System.out.println("This is your extra card: " + f);
						sum2 = d + e + f + three2;
						System.out.println("The sum of your cards is: " + sum2);
					} else {
						System.out.println("The sum of your cards is: " + sum2);
						System.out.println("You will probably lose");
					}
				} else {
					System.out.println("Ok then your current sum is still: " + sum2);
					if (sum2 <= 21) {
						System.out.println("The sum of your cards is: " + sum2);
					} else if(d == 11) {
						d = 1;
						System.out.println("You need a third card since your sum is greater than 21");
						int f = (int)(Math.random()*11);
						if (f == 0) {
							f = 1;
						}
						System.out.println("This is your extra card: " + f);
						sum2 = d + e + f;
						System.out.println("The sum of your cards is: " + sum2);
					} else if(e == 1){
						e = 1;
						System.out.println("You need a third card since your sum is greater than 21");
						int f = (int)(Math.random()*11);
						if (f == 0) {
							f = 1;
						}
						System.out.println("This is your extra card: " + f);
						sum2 = d + e + f;
						System.out.println("The sum of your cards is: " + sum2);
					} else {
						System.out.println("The sum of your cards is: " + sum2);
						System.out.println("You will probably lose");
					}
				}
				if (sum > 21) {
					sum = 0;
				} else if(sum2 > 21) {
					sum2 = 0;
				}
				if ((sum > sum2)&&(sum <= 21)){
					player2 = player2 + 1;
					System.out.println("You won this round player2, congratulations! You have: " + player2 + "points");
				} else if ((sum2 > sum)&&(sum2 <= 21)){
					player1 = player1 + 1;
					System.out.println("You won this round player1, congratulations! You have: " + player1 + "points\"");
				} else if((sum == sum2)&&(sum <= 21)&&(sum2 <= 21)){
					System.out.println("It is a tie, so both get a point");
					player1 = player1 + 1;
					player2 = player2 + 1;
					System.out.println("Player1 you have: " + player1 + "points");
					System.out.println("Player2 you have: " + player2 + "points");
				} else {
					System.out.println("No one won");
					System.out.println("Player1 you have: " + player1 + "points");
					System.out.println("Player2 you have: " + player2 + "points");
				}
			}
		}
	}

}
