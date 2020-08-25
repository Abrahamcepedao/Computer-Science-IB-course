package Model;
import Model.Vehicles;
public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicles hatchback = new Vehicles(1984, "porshce", "Carrera", 183666, 2000000);
		Vehicles suv = new Vehicles(1988, "Audi", "A5", 1776463, 4783278);
		Vehicles sedan = new Vehicles(1688, "ferrari", "knight", 183666, 34283285);
		Vehicles truck = new Vehicles(1984, "porshce", "Carrera", 183666, 2000000);
		Vehicles crossover = new Vehicles(1988, "Audi", "A5", 1776463, 4783278);
		Vehicles jeep = new Vehicles(1688, "ferrari", "knight", 183666, 34283285);
	
		
		
		
		Vehicles[] allVehicles = {hatchback, suv, sedan, crossover, truck, jeep};
		System.out.println("All vehicles: ");
		for (Vehicles individualVehicles : allVehicles) {
			System.out.println("-------------------");
			System.out.println(individualVehicles.year);
			System.out.println(individualVehicles.brand);
			System.out.println(individualVehicles.model);
			System.out.println(individualVehicles.miles);
			System.out.println(individualVehicles.price);
		}
		
	}
	

}
