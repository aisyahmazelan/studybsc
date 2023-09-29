package Day7;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListConsole 
{
	public static void main (String[] args)
	{
		/*List<String> list = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five","six"));
		for (int index = 0; index <list.size(); index++)
			System.out.printf("arr[%d] = %s%n", index, list.get(index));*/
		
		/*Scanner sc = new Scanner (System.in);
		System.out.println("Insert list of number : ");
		List <Double> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
		
		for (int i=0; i<numbers.size() - 1; i++)
			if (numbers.get(i).equals(numbers.get(i+1)))
			{
				numbers.set(i, numbers.get(i) + numbers.get(i + 1));
				numbers.remove(i + 1);
				i = -1;
			}
			
			String output = joinElementsByDelimiter(numbers, " ");
			System.out.println(output);
	}	
	
			static String joinElementsByDelimiter(List<Double> items, String delimiter)
			{
				String output = "";
				for (Double item : items)
					output += (new DecimalFormat("0.#").format(item) + delimiter);
				return output;
			}*/
		/*Scanner sc = new Scanner (System.in);
		System.out.println("Insert list of number : ");
		
		List<Integer> nums1 = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		List<Integer> nums2 = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		List <Integer> resNums = new ArrayList<>();
		for (int i = 0; i < Math.min(nums1.size(),  nums2.size()); i++)
		{
			resNums.add(nums1.get(i));
			resNums.add(nums2.get(i));
		}
		if (nums1.size() > nums2.size())
		{
			resNums.addAll(getRemainingElements(nums1, nums2));
		}
		else if (nums2.size() > nums1.size())
		{
			resNums.addAll(getRemainingElements(nums2, nums1));
		}
		System.out.println(resNums.toString().replaceAll("[\\[\\],]", ""));
	}
	public static List<Integer> getRemainingElements(List<Integer> longerList, List<Integer>shorterList)
	{
		List<Integer> nums = new ArrayList<>();
		for (int i = shorterList.size(); i<longerList.size(); i++)
			nums.add(longerList.get(i));
		return nums;
	}*/
		
	/*public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Insert list of number : ");
		printSign(Integer.parseInt(sc.nextLine()));
	}
	public static void printSign(int number)
	{
		if (number > 0)
			System.out.printf("The number %d is positive.", number);
		else if (number < 0)
			System.out.printf("The number %d is negative.", number);
		else
			System.out.printf("The number %d is zero.", number);

	}*/
		/*Scanner sc = new Scanner (System.in);
		System.out.println("Insert a number : ");
		printTriangle(Integer.parseInt(sc.nextLine()));
	}
	public static void printLine(int start, int end)
	{
		
		for (int i = start; i<= end; i++)
		{
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void printTriangle(int n)
	{
		for (int line = 1; line <= n; line++)
			printLine(1, line);
		
		for (int line = n -1; line >= 1; line--)
			printLine(1,line);
	}*/
		
		/*Scanner scanner = new Scanner (System.in);
		System.out.println("Insert a number : ");
		double number = Double.parseDouble(scanner.nextLine());
		System.out.println("Insert the power : ");
		int power = scanner.nextInt();
		System.out.println(mathPower(number, power));
	}
	public static double mathPower (double number, int power)
	{
		
		double result = 1;
		for (int i = 0; i < power; i++)
			result *= number;
		return result;*/
		
		/*int num = 5;
		increment(num, 15);
		System.out.println(num);*/
		
		/*int[] nums = {5};
		increment(nums, 15);
		System.out.println(nums[0]);

	}
	
	/*public static void increment (int num, int value)
	{
		num += value;
		System.out.println(num);

	}
	
	public static void increment (int[] nums, int value)
	{
		nums[0] += value;
		System.out.println(nums[0]);

	}*/
	}
}
