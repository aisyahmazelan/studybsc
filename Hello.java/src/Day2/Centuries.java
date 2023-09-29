package Day2;

import java.util.Scanner;

public class Centuries 
{
	public static void main (String[] args)
	{
		byte centuries = 20;
		short years = 2000;
		int days = 730484;
		long hours = 17531616;
		
		System.out.printf("%d centuries = %d years = %d days = %d hours.", centuries, years, days, hours);
	
		Scanner scanner = new Scanner(System.in);
		
		int meters = Integer.parseInt(scanner.nextLine());
		double kilometers = meters/1000.0;
		System.out.printf("%.2f",kilometers);
	}
}
