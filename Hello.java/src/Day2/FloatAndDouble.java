package Day2;

import java.util.Scanner;

public class FloatAndDouble 
{
	public static void main(String[] args)
	{
	//float floatPI = 3.141592653589793238f;
	//double doublePI = 3.141592653589793238;
	//System.out.println("Float PI is : " + floatPI);
	//System.out.println("Double PI is : " + doublePI);
	Scanner scanner = new Scanner(System.in);
		
	double num = Double.parseDouble(scanner.nextLine());
	double result = num * 1.31;
	System.out.printf("%.3f", result);
	
	
	scanner.close();
	}
}
