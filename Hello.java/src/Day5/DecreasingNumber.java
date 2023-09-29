package Day5;

import java.util.Scanner;

public class DecreasingNumber 
{
	public static void main(String[] args) 
	{
		/*System.out.println("Insert number : ");
		Scanner scanner= new Scanner(System.in);
		long number = scanner.nextLong();
		
		while (number >= 1)
		{
		System.out.println(number);
		number--;
		}*/
		
		/*System.out.println("Insert number : ");
		Scanner scanner= new Scanner(System.in);
		int number = scanner.nextInt();
		
		while (number < 1 || number >100)
		{
			System.out.println("Invalid\nInsert new number : ");
			number = scanner.nextInt();
		}
		
		System.out.println(number);*/
		
		/*System.out.println("Insert number : ");
		Scanner scanner= new Scanner(System.in);
		int number = scanner.nextInt();
		String command = scanner.nextLine();
		while (!command.equals("end"))
		{
			switch (command)
			{
			case "inc" : number++; break;
			case "dec" : number--; break;
			}
			command = scanner.nextLine();
		}
		System.out.println(number);*/
		
		/*System.out.println("Insert number : ");
		Scanner scanner= new Scanner(System.in);
		long number = scanner.nextLong();
		long sum = 0;
		while (number>0)
		{
			sum += number % 10; number /=10;
		}
		System.out.println(sum);*/
		
		/*System.out.println("Insert number : ");
		Scanner scanner= new Scanner(System.in);
		int stopNum = scanner.nextInt();
		int previousNum = stopNum;

		while (true)
		{
			int num = scanner.nextInt();
			if (num == stopNum)
				break;
			previousNum = num;
		}
		
		System.out.println(previousNum * 1.2);*/
		
		/*System.out.println("Insert number : ");
		Scanner scanner= new Scanner(System.in);
		int num = scanner.nextInt();
		int k = 1;
		
		while (k <= num)
		{
			System.out.println(k);
			k = k * 2 + 1;
		}*/
		
		/*System.out.println("Insert number : ");
		Scanner scanner= new Scanner(System.in);
		int num = scanner.nextInt();
		int k = 1;
		for (int i = 0; i<= num; i+=2)
		{
			if (k > 0)
				System.out.println("");
			System.out.println(k);
			k = k * 2 * 2;
		}
		System.out.println();*/
		
		/*System.out.println("Insert number : ");
		Scanner scanner= new Scanner(System.in);
		int n = scanner.nextInt();
		int n = 3;
		for (int row = 1; row <= n; row++)
		{
			for (int col = 1; col <= n; col++)
			{
				System.out.print (" *");
				
			}
			System.out.println();
		}*/
		
		/*System.out.println("Insert number : ");
		Scanner scanner= new Scanner(System.in);
		int size = scanner.nextInt();
		for (int row = 1; row <= size; row++)
		{
			for (int col = 1; col <= row; col++)
			{
				System.out.print (" *");
				
			}
			System.out.println();
		}*/
		
		/*System.out.println("Insert number : ");
		Scanner scanner= new Scanner(System.in);
		int height = scanner.nextInt();
		int row = 1;
		while (row <= height)
		{
			int col = 0;
			while (col++ < row)
			{
				System.out.print (" *");
			}
			System.out.println();
			row++;
		}*/
		
		
		byte b = 0;
		
		b--;
		
		System.out.println(b);
	}
	
}
