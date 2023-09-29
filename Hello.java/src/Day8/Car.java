package Day8;

public class Car 
{
	private String brand;
	private String model;
	private int horsePower;
	
	public Car(String brand, String model, int horsePower) {
		this.brand=brand; this.model=model; this.horsePower=horsePower;
	}
	public Car(String brand2, String model2) {
		// TODO Auto-generated constructor stub
	}
	public String getBrand() { return this.brand; }
	public void setBrand (String brand) {this.brand = brand;} 
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s%n%s\n%d", this.brand, this.model, this.horsePower);
	}
//	public String toString()
//	{
//		return String.format("%s:%s:%d", this.brand, this.model, this.horsePower);
//	}
}
