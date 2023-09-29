package Day8;

import java.util.Scanner;

public class CarTest 
{
	public static void main (String[] args)
	{
		Scanner scanner = new
				Scanner(System.in);
				System.out.println("Insert brand : ");
				String brand = scanner.nextLine();
				System.out.println("Insert model : ");
				String model = scanner.nextLine();
				System.out.println("Insert horse power : ");
				int horsePower = scanner.nextInt();
				
		
		Car car = new Car (brand, model, horsePower);
		System.out.println(car);
		System.out.println(car.getBrand());
	}
}
