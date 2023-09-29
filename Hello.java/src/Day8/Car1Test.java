package Day8;

import java.util.Scanner;

//public Car (String brand, String model)
//{
//	this.brand = brand;
//	this.model = model;
//	horsePower = -1;
//}

public Car1(String brand, String model, int horsePower)
{
	this(brand, model);
	this.horsePower = horsePower;
}


public class Car1Test 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Insert brand : ");
		System.out.println("Insert brand : ");
		String brand = scanner.nextLine();
		System.out.println("Insert model : ");
		String model = scanner.nextLine();
		System.out.println("Insert horse power: ");
		String horsePower = scanner.nextLine();
		
		if (horsePower.equals(""))
		{
			Car car =new Car(brand, model);
			System.out.println(car);
		}
		else
		{
			int hp = Integer.parseInt(horsePower);
			Car car = new Car(brand, model, hp);
			System.out.println(car);
		}
	}
