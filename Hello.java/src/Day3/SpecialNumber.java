package Day3;

import java.util.Scanner;

public class SpecialNumber 
{
	public static void main(String[] args) 
	{
		//System.out.println("Enter a number : ");
		//Scanner scanner = new Scanner(System.in);
		//int n = Integer.parseInt(scanner.nextLine());

		/*for (int num = 1; num <= n; num++) 
			{
			int sumOfDigits = 0;
			int digits = num;
			while (digits > 0) 
				{
				sumOfDigits += digits % 10;// remainder
				digits = digits / 10;	
				}
			if (sumOfDigits == 5 || sumOfDigits == 7 || sumOfDigits== 11)
				System.out.println(num + " -> True ");
			else
				System.out.println(num + " -> False");
			}*/
		
		/*char ch = 'a';
		System.out.printf("The code of '%c' is : %d%n", ch, (int) ch);
		
		ch = 'b';
		System.out.printf("The code of '%c' is : %d%n", ch, (int) ch); ch = 'A';
		
		
		System.out.printf("The code of '%c' is : %d%n", ch, (int) ch); ch = 'd';
		
		System.out.printf("The code of '%c' is : %d%n", ch, (int) ch);*/
		
		//reverse char
		/*char firstChar = scanner.nextLine().charAt(0);
		char secondChar = scanner.nextLine().charAt(0);
		char thirdChar = scanner.nextLine().charAt(0);
		
		System.out.printf("%c %c %c", thirdChar, secondChar, firstChar);*/
		
		//character literal
		/*char symbol = 'a';
		symbol = '\u0169';
		
		System.out.println(symbol);*/
		
		String firstName = "Ivan";
		String lastName = "Ivanov";
		String fullName = String.format("%s %s",firstName, lastName);
		String fullName1 = firstName + " " + lastName;
		int age = 21;
		
		//System.out.printf("Your full name is %s.",fullName1);
		System.out.printf("Hello, I am %s. I am %s  years old.", fullName, age);
	}
}
