package Model;
import Model.Pets;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Pet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		Pets pet1 = new Pets(null, null, 0, null, null, 0);
		Pets pet2 = new Pets(null, null, 0, null, null, 0);
		Pets pet3 = new Pets(null, null, 0, null, null, 0);
		Pets pet4 = new Pets(null, null, 0, null, null, 0);
		Pets pet5 = new Pets(null, null, 0, null, null, 0);
		Pets pet6 = new Pets(null, null, 0, null, null, 0);
		Pets pet7 = new Pets(null, null, 0, null, null, 0);
		Pets pet8 = new Pets(null, null, 0, null, null, 0);
		Pets pet9 = new Pets(null, null, 0, null, null, 0);
		Pets pet10 = new Pets(null, null, 0, null, null, 0);
		
		Pets[] allPets = {pet1,pet2,pet3,pet4,pet5,pet6,pet7,pet8,pet9,pet10};
		int i = 0;
		for (Pets individualPets : allPets) {
			i++;
			System.out.println("Enter the data for the " + i + " pet");
			try {
				System.out.println("Enter the name");
				individualPets.name = bufferedReader.readLine();
				System.out.println("Enter the type");
				individualPets.type = bufferedReader.readLine();
				System.out.println("Enter the age");
				String age = bufferedReader.readLine();
				individualPets.age = Integer.parseInt(age);
				System.out.println("Enter the gender");
				individualPets.gender = bufferedReader.readLine();
				System.out.println("Enter the color");
				individualPets.color = bufferedReader.readLine();
				System.out.println("Enter the size");
				String size = bufferedReader.readLine();
				individualPets.size = Integer.parseInt(size);
			} 
				catch(IOException e) {
					e.printStackTrace();
				}
			
		}
		
		for (Pets individualPets : allPets) {
			System.out.println("-------------------");
			System.out.println("name: " + individualPets.name);
			System.out.println("type:" + individualPets.type);
			System.out.println("age:" + individualPets.age);
			System.out.println("gender:" + individualPets.gender);
			System.out.println("color:" + individualPets.color);
			System.out.println("size:" + individualPets.size);
		}
	}
	

}
