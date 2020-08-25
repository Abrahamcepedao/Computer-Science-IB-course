import java.util.Scanner;
public class projectOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int array[] = new int[10];
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*1000);
		}
		System.out.println("This is the initial array");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println(" ");
		int counter = 0;
		int number = 0;
		
		for(int i = 0; i < array.length; i++) {
			for(int e = 1; e < (array.length); e++) {
				if(array[e-1] > array[i]) {
					number = array[e-1];
					array[e-1] = array[i];
					array[i] = number;
				}
			}
		}
		System.out.println("This is the final array");
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i] + ", ");
		}
		
		
		
		
		
		////////////////////////
		int array2[] = new int[10];
		for(int i = 0; i < array2.length; i++) {
			array2[i] = (int)(Math.random()*1000);
		}
		int max = array2[0];
		for(int i = 0; i < array2.length; i++) {
			if(array2[i] > max) {
				max = array2[i];
			}
		}
		System.out.println("Your max number is: " + max);
		
		
		
		
		
		////////////////////////
		int array3[] = new int[10];
		for(int i = 0; i < array3.length; i++) {
			array3[i] = (int)(Math.random()*1000);
		}
		int min = array3[0];
		for(int i = 0; i < array3.length; i++) {
			if(array3[i] < min) {
				min = array3[i];
			}
		}
		System.out.println("Your min number is: " + min);
		
		
		
		
		
		
		
		
		
		////////////////////////
		int client;
		do {
			System.out.println("How many clients do you want to store?");
		    while (!input.hasNextInt()) {
		        System.out.println("That's not a number!");
		        input.next(); // this is important!
		    }
		    client = input.nextInt();
		} while (client <= 0);		
		String [] names = new String[client];
		for(int i = 0; i < client; i++) {
			System.out.println("Enter the name of the " + (i + 1) + " client");
			while(input.hasNextInt()) {
				System.out.println("That's not a String!");
		        System.out.println("Try again");
		        names[i] = input.next();
			}
			names[i] = input.next();
		}
		
		
		
		
		
		
		
		int factors;
		do {
			System.out.println("How many factors do you want to take into account?");
		    while (!input.hasNextInt()) {
		        System.out.println("That's not a number!");
		        input.next(); // this is important!
		    }
		    factors = input.nextInt();
		} while (factors <= 0);
		
		
		String [] facts = new String[factors];
		for(int i = 0; i < facts.length; i++) {
			System.out.println("Enter factor " + (i + 1));
			while(input.hasNextInt()) {
				System.out.println("That's not a String!");
		        System.out.println("Try again");
		        facts[i] = input.next();
			}
			facts[i] = input.next();
		}
		
		
		
		
		
		
		
		
		String [][] clients  = new String[client][factors];
		
		for(int i = 0; i < client; i++) {
			for(int e = 0; e < factors; e++) {
				System.out.println("Enter the " + facts[e] + " of " + names[i]);
				while(input.hasNextInt()) {
					System.out.println("That's not a String!");
			        System.out.println("Try again");
			        clients[i][e] = input.next();
				}
				clients[i][e] = input.next();
			}
		}
		
		for(int i = 0; i < client; i++) {
			for(int e = 0; e < factors; e++) {
				System.out.println("The " + facts[e] + " of " + names[i] + " is " + clients[i][e]);
			}
		}
		
		
		
		
		////////////////////////
		String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		int [] salary = new int[12];
		int average = 0;
		int total = 0;
		int maxnumber = salary[0];
		int minnumber = 0;
		for(int i = 0; i < salary.length; i++) {
			System.out.println("Enter the salary for " + months[i]);
		    while(salary[i] == 0) {
		    		salary[i] = (int)(Math.random()*1000);
		    }
		    System.out.println(salary[i]);
			total = total + salary[i];
			average = total/salary.length;
			if(salary[i] > maxnumber) {
				maxnumber = salary[i];
			}	
		}
		minnumber = salary[0];
		for(int i = 0; i < salary.length; i++) {
			if(salary[i] < minnumber) {
				minnumber = salary[i];
			}
		}
		
		for(int i = 0; i < salary.length; i++) {
			if(i == 0) {
				System.out.println("Month   sales");
			}
			System.out.println(months[i] + ": " + salary[i]);
		}
		System.out.println("Your total sales for the year was: " + total);
		System.out.println("Your average sales for each month was: " + average);
		int x = 0;
		int y = 0;
		do {
			for(int i = 0; i <salary.length; i++) {
				if(maxnumber == salary[i]) {
					x = 1;
					y = i;
				}
			}
		}while(x == 0);
		int z = 0;
		int t = 0;
		do {
			for(int i = 0; i <salary.length; i++) {
				if(minnumber == salary[i]) {
					z = 1;
					t = i;
				}
			}
		}while(z == 0);
		System.out.println("Your best month was: " + months[y] + " with an amount of: " + maxnumber);
		System.out.println("Your worst month was: " + months[t] + " with an amount of: " + minnumber);


	
		
		
		
	}

}
