import Model.Vehicles;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {
public static void main(String[] args) {

	Vehicles hatchback = new Vehicles(1994, "Subaru", "Legacy", 170000, 4000);
	Vehicles suv = new Vehicles(2002, "Ford", "Explorer", 100000, 7000);
	Vehicles sedan = new Vehicles(2015, "Toyota", "Camry", 50000, 30000);
	Vehicles truck = new Vehicles(1999, "Ford", "Ranger", 100000, 4000);
	Vehicles crossover = new Vehicles(1998, "Toyota", "Rav-4", 200000, 3500);

	ArrayList<Vehicles> allVehicles = new ArrayList<Vehicles>();

	allVehicles.add(hatchback);
	allVehicles.add(suv);
	allVehicles.add(sedan);
	allVehicles.add(truck);
	allVehicles.add(crossover);
	while (true) {
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Welcome to our car dealership. What would you like to do? Enter one of the following options: All Vehicles, Search Price, or Add Vehicle");
	
	try {
	
	String navigationChoice = bufferedReader.readLine();
	
	if (navigationChoice.equals("All Vehicles")) {
	for (Vehicles individualVehicles : allVehicles) {
	System.out.println("----------------------");
	System.out.println(individualVehicles.year);
	System.out.println(individualVehicles.brand);
	System.out.println(individualVehicles.model);
	System.out.println(individualVehicles.miles);
	System.out.println(individualVehicles.price);
	}
	} else if (navigationChoice.equals("Search Price")) {
	System.out.println("What is your maximum budget for a vehicle?");
	String stringUserMaxBudget = bufferedReader.readLine();
	int userMaxBudget = Integer.parseInt(stringUserMaxBudget);
	System.out.println("Alright, here's what we have in your price range:");
	for (Vehicles individualVehicle : allVehicles) {
	if (individualVehicle.worthBuying(userMaxBudget)) {
	System.out.println("----------------------");
	System.out.println(individualVehicle.year);
	System.out.println(individualVehicle.brand);
	System.out.println(individualVehicle.model);
	System.out.println(individualVehicle.miles);
	System.out.println(individualVehicle.price);
	}
	}
	} else if (navigationChoice.equals("Add Vehicle")) {
	System.out.println("Alright, let's add a vehicle! What year was this vehicle made?");
	int userVehicleYear = Integer.parseInt(bufferedReader.readLine());
	System.out.println("Great! What make or brand is the vehicle?");
	String userVehicleBrand = bufferedReader.readLine();
	System.out.println("Got it! What model is it?");
	String userVehicleModel = bufferedReader.readLine();
	System.out.println("And how many miles does it have on it?");
	int userVehicleMiles = Integer.parseInt(bufferedReader.readLine());
	System.out.println("Finally, what's its price?");
	int userVehiclePrice = Integer.parseInt(bufferedReader.readLine());
	Vehicles userVehicles = new Vehicles(userVehicleYear, userVehicleBrand, userVehicleModel, userVehicleMiles, userVehiclePrice);
	allVehicles.add(userVehicles); //I'm new!

	System.out.println("Alright, here's your new vehicle:");
	System.out.println("----------------------");
	System.out.println(userVehicles.year);
	System.out.println(userVehicles.brand);
	System.out.println(userVehicles.model);
	System.out.println(userVehicles.miles);
	System.out.println(userVehicles.price);
	} else {
	System.out.println("I'm sorry, we don't recognize your input");
	}
	} catch (IOException e) {
	e.printStackTrace();
	}
}
}
}
