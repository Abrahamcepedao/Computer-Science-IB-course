package org.mechaevil.util.Conversions;
import java.util.Scanner;
public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		int students;
		do {
			System.out.println("How many students are in the class?");
		    while (!input.hasNextInt()) {
		        System.out.println("That's not a number!");
		        input.next(); // this is important!
		    }
		    students = input.nextInt();
		} while (students <= 0);		
		
		
		
		String [] namesStudents  = new String[students];
		
		for(int i = 0; i < students; i++) {
			int x = 0;
			
			System.out.println("Enter the name of the " + (i + 1) + " student");
			
			while(input.hasNextInt()) {
				System.out.println("That's not a String!");
		        System.out.println("Try again");
		        namesStudents[i] = input.next();
			}
			namesStudents[i] = input.next();
			    
			    
			
		}
		for(int i = 0; i < students; i++) {
			System.out.println("Student " + (i+1) + " " + namesStudents[i]);
		}
		
		
		
		System.out.println("How many subjects do they take?");
		int subject;
		while (!input.hasNextInt()) {
	        System.out.println("That's not a number!");
	        input.next(); // this is important!
	    }
		subject = input.nextInt();
		
		String subjects [] = new String[subject];
		
		for(int i = 0; i < subject; i++) {
			System.out.println("Enter the subject " + (i + 1));
			
			while(input.hasNextInt()) {
				System.out.println("That's not a String!");
		        System.out.println("Try again");
		        subjects[i] = input.next();
			}
			subjects[i] = input.next();
		}
		for(int i = 0; i < subject; i++) {
			System.out.println(subjects[i]);
		}
		
		int id [] = new int[students];
		for(int i = 0; i < students; i++) {
			id[i] = i + 1;
		}
		for(int i = 0; i < students; i++) {
			System.out.println("Student id: " + id[i]);
		}
		
		int grades [][] = new int[students][subject];
		
		for(int i = 0; i < students; i++) {
			int e = 0;
			for(e = 0; e < subject; e++) {
				System.out.println("Enter the grade of " + namesStudents[i] + " for his " + subjects[e] + " subject");
				int grade;
			    while (!input.hasNextInt()) {
			        System.out.println("That's not a number!");
			        input.next(); // this is important!
			    }
			    grade = input.nextInt();
			
				System.out.println("i = " + i);
				System.out.println("e = " + e);
				grades[i][e] = grade;
				System.out.println("The grade for " + namesStudents[i] + " in " + subjects[e] + " was: " + grades[i][e]);
			}
		}
		
		System.out.println("Which ID do you want to look for?");
		int idy;
	    while (!input.hasNextInt()) {
	        System.out.println("That's not a number!");
	        input.next(); // this is important!
	    }
	    idy = input.nextInt();
	    
		if(idy != (int)idy) {
			System.out.println("Enter a valid number in the form of integer");
			idy = input.nextInt();
		}
		System.out.println("The student with the ID " + idy + "is called " + namesStudents[idy-1]);
		for(int i = 0; i < subject; i++) {
			System.out.println("For " + subjects[i] + " " + namesStudents[idy-1] + " got: " + grades[idy-1][i]);
		}
		int average = 0;
		for(int i = 0; i < subject; i++) {
			average = average + grades[idy-1][i];
		}
		average = average / subject;
		System.out.println("The final average for " + namesStudents[idy-1] + " is: " + average);
	}

}
