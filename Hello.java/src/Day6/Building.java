package Day6;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Building 
{
	public static void main(String[] args) 
	{
		Scanner scanner= new Scanner(System.in);
		/*System.out.println("Insert floors : ");
		Scanner scanner= new Scanner(System.in);
		int floors = scanner.nextInt();
		System.out.println("Insert rooms : ");
		int rooms = scanner.nextInt();
		for (int f = floors; f>=1; f--)
		{
			for (int r = 0; r<rooms; r++) 
			{
				if (f == floors)
					System.out.print("L"+ f + r + " ");
				else if (f % 2 == 0)
					System.out.print("O" + f + r + " ");
				else
					System.out.print("A" + f + r + " ");
			}
		System.out.println();
		}*/
		
		/*String destination;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Insert destination : ");
		while (!(destination = scanner.nextLine()).equals("End"))
		{
			System.out.println("Insert needed budget : ");
			double neededSum = Double.parseDouble(scanner.nextLine());
			double collectedSum = 0;
			while (collectedSum < neededSum)
			{
				System.out.println("Insert deposited : ");
				collectedSum += Double.parseDouble(scanner.nextLine());
				System.out.printf("Collected : %.2f\n", collectedSum);
			}
			System.out.printf("Going to %s!\n", destination);
			System.out.println("Insert new destination : ");
		}*/
		
		/*Scanner scanner= new Scanner(System.in);
		System.out.println("Insert letter : ");
		
		char start = scanner.nextLine().charAt(0);
		System.out.println("Insert letter : ");
		char end = scanner.nextLine().charAt(0);
		System.out.println("Insert letter : ");
		char x = scanner.nextLine().charAt(0);			
		
		int counter = 0;
		for (char l1 = start; l1<=end; l1++)
		{
			for (char l2 = start; l2<=end; l2++)
			{
				for (char l3 = start; l3<=end; l3++)
					if (l1 != x && l2 != x && l3 !=x)
					{
						System.out.printf("%c%c%c ", l1, l2, l3);
						counter++;
					}
			}
		}
		System.out.print(counter);*/
		
		/*String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"	};
		
		System.out.println("Insert number : ");
		int day = Integer.parseInt(scanner.nextLine());
		if (day >= 1 && day <= 7)
			System.out.println(days[day - 1]);
		else
			System.out.println("Invalid day!");*/
		
		/*System.out.println("Insert number : ");
		String values = scanner.nextLine();
		String[] items = values.split(" ");
		int[] arr = new int[items.length];
		
		for (int i = 0; i < items.length; i++)
		{
			arr[i] = Integer.parseInt(items[i]);
				System.out.println(items[i]);
		}*/
		
		/*System.out.println("Insert number : ");
		String inputLine = scanner.nextLine();
		String[] items = inputLine.split(" ");
		int[] arr = Arrays.stream(items).mapToInt(e-> Integer.parseInt(e)).toArray();
		for (int i = 0; i < arr.length; i++)
		{
				System.out.println(arr[i]);
		}*/
		
		/*System.out.println("Insert number : ");
		int n = Integer.parseInt(scanner.nextLine());
		int[] arr = new int[n];
		for (int i = 0; i<n; i++)
		{
			arr[i] = Integer.parseInt(scanner.nextLine());
		}
		System.out.println("The reverse : ");

		for (int i = n - 1; i >= 0; i--)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();*/
		
		//String[] arr = {"one", "two"};
		//for (int i = 0; i < arr.length; i++)
			
		/*int[] numbers = {1, 2, 3, 4, 5, };
		for (int number : numbers)
		{
			System.out.println(number + " ");
		}*/
		
		/*List<Integer> nums = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60));
		
		nums.remove(2);
		nums.add(100);
		nums.add(0, -100);
		for (int i = 0; i < nums.size(); i++)
			System.out.print(nums.get(i) + " ");*/
		
		System.out.println("Insert number : ");
		String values = scanner.nextLine();
		List<String> items = Arrays.stream(values.split(" ")).collect(Collectors.toList());
		List <Integer> nums = new ArrayList<>();
		for (int i = 0; i < items.size(); i++)nums.add(Integer.parseInt(items.get(i)));
		System.out.println(nums);
	}
}
