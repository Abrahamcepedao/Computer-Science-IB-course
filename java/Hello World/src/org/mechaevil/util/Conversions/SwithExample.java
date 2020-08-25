package org.mechaevil.util.Conversions;
import java.util.Scanner;
public class SwithExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("What was your grade?");
		int grade = input.nextInt();
		System.out.println(grade);
		
		if((grade <= 100) && (grade >= 95)) {
			grade = 1;
		} else if((grade <= 94) && (grade >= 80)) {
			grade = 2;
		} else if((grade <= 79) && (grade >= 70)) {
			grade = 3;
		} else {
			grade = 4;
		}
		switch (grade) {
			case 1: 
				System.out.println("Excellent work");
				break;
			case 2: 
				System.out.println("Good work");
				break;
			case 3: 
				System.out.println("You can do better");
				break;
			default:
				System.out.println("Sorry you have to work harder");
		}
		int matrix [][] = {
				{1, 2, 3, 4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
		};
		
		String matrix2 [][] = {
				{"Gray", "Model s", "Tesla"},
				{"Black", "Carrera", "Porsche"},
				{"Blue", "R8", "Audi"}
		};
		System.out.println("matrix.length" + matrix[0].length);
		int c = 0;
		for(c = 0; c < 3; c = c + 1) {
			int i = 0;
			for(i = 0; i < 3; i = i + 1) {
				System.out.print(matrix2[c][i]);
				System.out.print(" ");
			}
			System.out.println();
		}
		int e = 0;
		for(e = 0; e < 4; e = e + 1) {
			int i = 0;
			for(i = 0; i < 4; i = i + 1) {
				System.out.print(matrix[e][i]);
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
		
		
		
		int random = 0;
		int z = 0;
		while(z == 0) {
			random = (int)(Math.random()*16);
			if(random == 0) {
				random = (int)(Math.random()*16);
			} else {
				z = 1;
			}
		}
		
		System.out.println("my random number is = " + random);
		int xaxis = 0; 
		int yaxis = random / matrix[0].length; 
		if(random < matrix[0].length) {
			xaxis = random - 1;
		} else if(random % matrix[0].length == 0){
			xaxis = matrix[0].length - 1;
			yaxis = (random / matrix[0].length) - 1;
		} else {
			xaxis = (random % matrix[0].length) - 1; 
		}
		System.out.println("Your xaxis is = " + xaxis);
		System.out.println("Your yaxis is = " + yaxis);
		System.out.println(matrix[yaxis][xaxis]);
		
		
		
		
		
		
		
		
		int x = -1;
		int y = 0;
		
		for(int i = 0; i < 16; i = i + 1) {
			x = x + 1;
			if(x > 3) {
				x = 0;
				y = y + 1;
			}
			System.out.println(matrix[y][x]);
		}
		System.out.println("How many numbers do you want to list?");
		int value = input.nextInt();
		String [] names = new String[value];
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("Enter the name " + (i+1));
			names[i] = input.nextLine();
		}
		for(int i = 0; i < names.length; i++) {
			System.out.println("Name " + (i+1) + names[i]);
		}
		
		String answer = "yes";
		while(answer.equals("yes")) {
			System.out.println("Search for a name");
			String l = input.nextLine();
			String f = input.nextLine();
			int w = 0;
			for(int i = 0; i < names.length; i++) {
				if(names[i].equals(l)) {
					System.out.println("The array position of " + l + " is " + i);
					w = 9;
				}
			}
			if(w == 0) {
				System.out.println("that name does not exist... try again");
			}
			System.out.println("Do you want to search for another name");
		}
		
		
		
		
		
		
	}

}
