package Day8;

import java.util.Scanner;

public class Multiply 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner (System.in);
		System.out.print("Insert number : ");
		int numbs = scanner.nextInt();
		
		if (numbs < 0)
		{
			numbs = Math.abs(numbs);
		}
		System.out.println("Total multiplication : " + getMultipleOfEvensAndOdds(numbs));
	}
	
	public static int getMultipleOfEvensAndOdds (int num)
	{
		return getSumOfEvenDigits(num)*getSumOfOddDigits(num);
	}
	
	public static int getSumOfEvenDigits(int num)
	{
		int sum = 0;
		while (num > 0)
		{
			int digit = num%10;
			if (digit%2==0)
			{
				sum += digit;
			}
			num /= 10;
		}
		System.out.println("Total sum of even number : " + sum);
		return sum;
	}
	
	public static int getSumOfOddDigits(int num)
	{
		int sum = 0;
		while (num>0)
		{
			int digit = num%10;
			if (digit%2!=0)
			{
				sum+=digit;
			}
			num /= 10;
		}
		System.out.println ("Total sum of odd number : " + sum);
		return sum;
	}
	
	
}
