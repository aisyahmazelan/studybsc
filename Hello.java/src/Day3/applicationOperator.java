package Day3;

import java.util.Scanner;

public class applicationOperator 
{
	public static void main(String[] args) 
	{
		//System.out.println("Enter your password : ");
		Scanner sc = new Scanner(System.in);
		
		/*int a = 230857;
		int b = 658236489;
		int c = 7342;
		
		System.out.println(a%10);
		System.out.println(b%10000);
		System.out.println((c%100)/10);*/
		
		/*int num = scanner.nextInt();
		
		if (num % 2 == 0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}*/
		
		/*int a =7;
		if (a>4)
			System.out.println("Bigger than 4");
		else if (a>5)
			System.out.println("Bigger than 5");
		else
			System.out.println("Equal to 7");*/
		
		/*int num = scanner.nextInt();
		if (num==1)
			System.out.println("One");
		else if (num==2)
			System.out.println("Two");
		else if (num==3)
			System.out.println("Three");		
		else if (num==4)
			System.out.println("Four");		
		else if (num==5)
			System.out.println("Five");		
		else if (num==6)
			System.out.println("Six");		
		else if (num==7)
			System.out.println("Seven");		
		else if (num==8)
			System.out.println("Eight");		
		else if (num==9)
			System.out.println("Nine");		
		else
			System.out.println("Out of range");*/
		
		/*String password = sc.nextLine();
		
		if (password.equals("s3cr3t!"))
		{
			System.out.println("Welcome");
		}
		else
		{
			System.out.println("Wrong password!");
		}*/
		
		
		/*System.out.println("Enter width : ");
		int width = sc.nextInt();
		System.out.println("Enter height  : ");
		int height = sc.nextInt();
		
		
		if (width>0)
		
			if (width==height)
				System.out.printf("Square. Area is %.2f" , (double) width*height);
			
			else
				System.out.printf("Rectangle. Area is %.2f" , (double) width*height);
		
		else
			System.out.println("Enter radius  : ");
			int radius = sc.nextInt();
			
			System.out.printf("Circle. Area is %.2f" , (double)2*3.142*radius);*/
			
		/*System.out.println("Select your drink : ");
		String order =sc.nextLine();
		Double coffee = 1.00;
		Double tea = 0.60;
		Double sugar = 0.40;
		
		
		if (order.equals("coffee")) 
		{
			System.out.println("Do you want sugar?");
			String extra = sc.nextLine();
				
			if (extra.equals("yes"))
				System.out.printf("The price is RM %.2f" , coffee+sugar );
			
			else
				System.out.printf("The price is RM %.2f" , coffee );
		}
		else 
		{
			System.out.println("Do you want sugar?");
			String extra = sc.nextLine();
			
			if (extra.equals("yes"))
				System.out.printf("The price is RM %.2f" , tea+sugar );
			
			else
				System.out.printf("The price is RM %.2f" , tea );
		}*/
	
		int n = sc.nextInt();
		int sum = 1;
		System.out.print(1);
		for (int i = 2; i <= n; i += 1)
		{
			System.out.print("+" + i);
			sum += i;
		}
		System.out.println("=" + sum);
		
	}
}
