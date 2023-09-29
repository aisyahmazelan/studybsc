package Day10;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class New {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*String str = "Hello, Java";
		String name = sc.nextLine();
		System.out.println("Hi, " + name);
		
		 str = new String (new char[] {'s', 't', 'r'});
		char[] charArr = str.toCharArray();
		//['s','t','r']*/
		
		/*String s = "abc";
		String[] arr = new String[3];
		for (int i = 0; i < arr.length; i++) {arr[i] = s; }
		String repeated = String.join("", arr);
		System.out.println(repeated);*/
		
		/*String[] words = sc.nextLine().split(" ");
		List<String>result = new ArrayList<>();
		for (String word : words) {
			result.add(word.repeat(word.length()));
		}
		System.out.println(String.join("", result));*/
		
		/*String card = "10C";
		String power = card.substring(0, 2);
		System.out.println(power);
		
		String text = "My name is John";
		String extactWord = text.substring(11);
		System.out.println(extactWord);*/
		
		/*String fruits = "banana, apple, kiwi, banana, apple";
		System.out.println(fruits.indexOf("banana"));
		System.out.println(fruits.indexOf("orange"));
		

		System.out.println(fruits.lastIndexOf("banana"));
		System.out.println(fruits.lastIndexOf("orange"));*/
		
		/*String text = "Hello, muhilan@gmail.com, you have been using muhilan@gmail.com in your registration";
		String[] words = text.split(", ");
		for (int i = 0; i < words.length; i++)
		System.out.println(words[i]);*/
		
		/*StringBuilder sb = new StringBuilder();
		sb.append("Hello Peter, how are you?");
		System.out.println(sb.charAt(1));
		
		sb.insert(11, "Ivanov");
		System.out.println(sb);*/
		
		/*Random randGen = new Random(12345);
		System.out.println("Random[1...1000000]: " + (randGen.nextInt(1_000_000) + 1));
		Random randGen2 = new Random(12345);
		System.out.println("Random[1...1000000] : " + (randGen2.nextInt(1_000_000) + 1));*/
		
		/*String.format("|%6d|", 99);
		System.out.println(String.format("|%6d|", 99));
		
		String.format("|%-6d|", 99);
		System.out.println(String.format("|%-6d|", 99));
		
		String.format("|%06d|", 99);
		System.out.println(String.format("|%06d|", 99));
		
		String.format("|%06.2f|", 3.5);
		System.out.println(String.format("|%06.2f|", 3.5));*/
		
		BigDecimal initialAmount = new BigDecimal(sc.next());
		BigDecimal interestRate = new BigDecimal(sc.next());
		
		BigDecimal hundred = new BigDecimal(100);
		BigDecimal total = initialAmount.add(initialAmount.multiply(interestRate.divide(hundred)));
		//total = initialAmount + (initialAmount*(interestRate/100))
		
		System.out.println(total);

	}
	
}
