

public class Simplecar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Simplecar car1 = new Simplecar();
		System.out.println("The distance traveled is: " + car1.getDistance() + " and the price is: $" + car1.getPrice());
		Simplecar car2 = new Simplecar();
		car2.velocity = 100;
		car2.brand = "ferrari";
		System.out.println("The distance traveled is: " + car2.getDistance() + " and the price is: $" + car2.getPrice());
		Simplecar car3 = new Simplecar();
		car2.velocity = 200;
		car2.brand = "astonmartin";
		System.out.println("The distance traveled is: " + car3.getDistance() + " and the price is: $" + car3.getPrice());
		
		
		
	}
	double velocity;
	double time;
	String color;
	String brand;
	
	Simplecar(){
		velocity = 20;
		time = 20;
		color = "red";
		brand = "tesla";
	}
	

	
	Simplecar(double newVelocity){
		velocity = newVelocity;
	}
	
	double getDistance() {
		return velocity * time;
	}
	double getPrice() {
		return (color.length() * brand.length()*100);
	}
	
	
	void setVelocity(double newVelocity) {
		velocity = newVelocity;
	}
	void setTime(double newTime) {
		time = newTime;
	}
	void setColor(String newColor) {
		color = newColor;
	}
	void setBrand(String newBrand) {
		brand = newBrand;
	}
	

}
