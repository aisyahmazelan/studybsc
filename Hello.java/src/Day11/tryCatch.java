package Day11;

import java.util.Scanner;

public class tryCatch {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		tryFinallyExample();
		/*String s = scanner.nextLine();
		try {
			Integer.parseInt(s);
			System.out.printf("You entered a valid integer number : %s", s);
		}
		catch (NumberFormatException ex) {
			System.out.println("Invalid integer number!");
		}*/
		
		/*String str = scanner.nextLine();
		try {
			Integer.parseInt(str);
		}
		catch (Exception ex) {
			System.out.println("Cannot parse the number!");
		}
		catch (NumberFormatException ex) {
			System.out.println("Invalid integer number!")
		}*/
	}
		
		/*private static int readNumberInRange(Scanner scanner, int start, int end) {
			while (true) {
				String line = scanner.nextLine();
				try {
					int num = Integer.parseInt(line);
					if (num >= start && num <= end)
						return num;
				}
				catch (Exception ex) {
			}
				System.out.println ("Invalid number : " + line);
		}
	}
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System in);
		String[] range = scanner.nextLine().split(" ")	
	}*/
	
	/*static void tryFinallyExample() {
		System.out.println("Code executed before try-finally.");
		try {
			Scanner scanner = new Scanner (System.in);
			String str = scanner.nextLine();
			Integer.parseInt(str);
			System.out.println("Parsing was successful.");
			return; // Exit from the current method
		}
		catch (NumberFormatException ex) {
			System.out.println("Parsing failed!");
			throw ex;
		}
		finally {
			System.out.println("This cleanup code is always executed.");
		}
		//System.out.println("This code is after the try-finally block.");
	}*/
	
	public class FileParseException extends Exception {
		private int lineNum;
		public FileParseException(String msg, int lineNum) {
			super(msg + " (at line" + lineNum + ")");
			this.lineNum = lineNum;
		}
		public int getLineNum() {return lineNum;}
	}
}
	

