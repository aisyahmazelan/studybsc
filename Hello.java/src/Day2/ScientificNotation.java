package Day2;

import java.math.BigDecimal;
import java.util.Scanner;

public class ScientificNotation 
{
	/*public static void main(String[] args)
	{
		double a = 1.0f;
		double b = 0.33f;
		double sum = 1.33d;
		System.out.printf("a+b=%f sum=%f equal=%b", a+b, sum, (a + b == sum));
		//a+b=1.33000001311302 sum=1.33 equal = false
		double num = 0;
		for (int i = 0; i < 1000; i++) num += 0.0001;
		System.out.println(num); //0.9999999999999062
	}*/
	
	public static void main(String[] args)
	{
		System.out.print("Enter the looping time : ");
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		
		BigDecimal sum = new BigDecimal(0);
		
		for (int i = 0; i< n; i++)
		{
			BigDecimal number = new BigDecimal(scanner.nextLine());
			sum = sum.add(number);
		}
		System.out.println(sum);
	}
}
