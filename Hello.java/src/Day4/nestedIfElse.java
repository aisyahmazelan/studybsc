package Day4;

import java.util.Scanner;

public class nestedIfElse 
{
	public static void main(String[] args)
	{
		/*System.out.println("Banana, Apple or Kiwi? ");
		Scanner scanner = new Scanner(System.in);
		String product = scanner.nextLine();
		System.out.println("Weekdays or weekend? : ");
		String dayOfWeek = scanner.nextLine();
		
		
		
		if (product.equals("Banana"))
			if (dayOfWeek.equals("Weekday"))
				System.out.println("2.50");
			else
				System.out.println("2.70");
		
		else if (product.equals("Apple"))
			if (dayOfWeek.equals("Weekday"))
				System.out.println("1.30");
			else
				System.out.println("1.60");
		else if(product.equals("Kiwi"))
			if (dayOfWeek.equals("Weekday"))
				System.out.println("2.20");
			else
				System.out.println("2.20");*/
		
		/*System.out.println("First number : ");
		Scanner scanner = new Scanner(System.in);
		int first = scanner.nextInt();
		System.out.println("Second number : ");
		int second = scanner.nextInt();
		System.out.println("Third number : ");
		int third = scanner.nextInt();
		
		if (first>second)
			if (first>third)
				System.out.println("Highest number is " + first);1
			else
				System.out.println(third);
		
		else if (second>third)
				System.out.println(second);
			else
				System.out.println(third);*/
		
		/*System.out.println("Insert number : ");
		Scanner scanner= new Scanner(System.in);
		int points = scanner.nextInt();
		if (points >= 0 && points <= 3)
			points +=5;
		else if (points >= 4 && points <= 6)
			points += 15;
		else if (points >= 7 && points <= 9)
			points += 20;
		System.out.println(points);*/
		
		/*System.out.println("Menu : \ncurry  noodles  sushi  spaghetti\ntea  water  coffee");
		System.out.println("Insert item : ");
		Scanner scanner= new Scanner(System.in);
		String s = scanner.nextLine();
		
		if (s.equals ("curry") || s.equals ("noodles") || s.equals ("sushi") || s.equals ("spaghetti"))
			System.out.println("Food");
		else if (s.equals ("tea") || s.equals ("water") || s.equals ("coffee"))
			System.out.println("Drinks");
		else
			System.out.println("Unknown");*/
		
		/*System.out.println("Insert number : ");
		Scanner scanner= new Scanner(System.in);
		int num = scanner.nextInt();
		
		
		boolean isValid = (num >= 100 && num <= 200) || num == 0;
		if (isValid)
			System.out.println("valid");
		else 
			System.out.println("invalid");*/
		
		/*System.out.println("Insert animal : ");
		Scanner scanner= new Scanner(System.in);
		String animal = scanner.nextLine();
		
		switch (animal)
		{
			case "dog":
			case "cat":
				System.out.println("mammal");
				break;
			default:
				System.out.println("unknown");
				break;
		}*/
		
		/*System.out.println("Insert product : ");
		Scanner scanner= new Scanner(System.in);
		String product = scanner.nextLine();
		
		switch (product)
		{
			case "banana":
			case "apple":
			case "kiwi":
			case "cherry":
			case "lemon":
			case "grapes":
				System.out.println("fruit");
				break;
			case "cucumber":
			case "pepper":
			case "carrot":
				System.out.println("vegetable");
				break;
			default:
				System.out.println("unknown");
				break;
		}*/
		
		/*System.out.println("Insert alphabet : ");
		Scanner scanner= new Scanner(System.in);
		char letter = scanner.nextLine().charAt(0);
		
		if (letter == 'A' || letter == 'a' ||letter == 'E' ||letter == 'e' ||letter == 'I' ||letter == 'i' ||letter == 'O' ||letter == 'o' ||letter == 'U' ||letter == 'u')
			System.out.println("Vowel");
		else
			System.out.println("Consonant");*/
		
		/*System.out.println("Insert letter : ");
		Scanner scanner= new Scanner(System.in);
		String product = scanner.nextLine();
		
		switch (product)
		{
			case "A":
			case "a":
			case "E":
			case "e":
			case "I":
			case "i":
			case "O":
			case "o":
			case "U":
			case "u":
				System.out.println("Vowel");
				break;
			default:
				System.out.println("Consonent");
				break;
		}*/
		
		/*System.out.println("Insert number : ");
		Scanner scanner= new Scanner(System.in);
		int num1 = scanner.nextInt();
		System.out.println("Insert letter : ");
		int num2 = scanner.nextInt();
		System.out.println("Insert letter : ");
		int num3 = scanner.nextInt();
		
		if (num1==0 || num2==0 || num3==0)
			System.out.println("Zero");
		else
		{
			int negativeNumbersCount = 0;
			if (num1<0) negativeNumbersCount++;
			if (num2<0) negativeNumbersCount++;
			if (num3<0) negativeNumbersCount++;
			if (negativeNumbersCount % 2 == 0)
				System.out.println("Positive");
			else
				System.out.println("Negative");
		}*/
		
		/*System.out.println("Insert type : ");
		Scanner scanner= new Scanner(System.in);
		String type = scanner.nextLine();
		System.out.println("Insert rows : ");
		int rows = Integer.parseInt(scanner.nextLine());
		System.out.println("Insert colllems : ");
		int cols = Integer.parseInt(scanner.nextLine());
		int seats = rows * cols;
		
		switch (type)
		{
		case "Premiere":
		case "premiere":
			System.out.printf("%.2f\n", seats * 12);
			break;
		case "Normal":
		case "normal":
			System.out.printf("%.2f\n", seats * 7.5);
			break;
		case "Discount":
		case "discount":
			System.out.printf("%.2f\n", seats * 5);
			break;
		}*/
		
		System.out.println("Insert balance : ");
		Scanner scanner= new Scanner(System.in);
		double balance = Double.parseDouble(scanner.nextLine());
		System.out.println("Insert withdraw amount : ");
		double withdraw = Double.parseDouble(scanner.nextLine());
		System.out.println("Insert limit : ");
		double limit = Double.parseDouble(scanner.nextLine());
		
		if (balance >= withdraw && withdraw <= limit)
			System.out.println("The withdraw was successfull.");
		else if (withdraw > limit)
			System.out.println("The limit was exceeded.");
		else
			System.out.println("Insufficient availability.");
	}
}
