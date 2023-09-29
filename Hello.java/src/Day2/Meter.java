package Day2;

import java.util.Scanner;

public class Meter 
{
	public static void main(String[] args)
	{
		
		Scanner scanner = new Scanner(System.in);
		
		//int meters = Integer.parseInt(scanner.nextLine());
		//double kilometers = meters/1000.0;
		
		//System.out.printf("%.2f",kilometers);
		//int centuries = Integer.parseInt(scanner.nextLine())
		System.out.print("Enter centuries : ");
		byte centuries = scanner.nextByte();
		short years = (short) (centuries*100);
		int days = (int) (years*365);
		long hours = (long) (days*24);
		long minutes = (long) (hours*60);
		
		System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes.", centuries, years, days, hours, minutes);
	}
}
