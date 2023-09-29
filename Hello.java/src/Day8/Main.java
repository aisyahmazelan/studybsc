package Day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<BankAccount> accounts = new ArrayList<BankAccount>();
		loop: 
		{
			while (true) 
			{
				String[] command = sc.next().split(" ");
				switch (command[1]) {
				case "create": 
				{
					BankAccount acc = new BankAccount();
					accounts.add(acc);
					break;
				}
				case "deposit": 
				{
					for (BankAccount account : accounts) 
					{
						if (account.getId() == Integer.parseInt(command[1])) 
						{
							account.deposit(Double.parseDouble(command[2]));
							break;
						}
					}
					break;
				}
				case "set-interest": 
				{
					BankAccount.setInterest(Double.parseDouble(command[1]));
					break;
				}
				case "calc-interested": 
				{
					double interest = 0;
					for (BankAccount account : accounts) 
					{
						if (account.getId() == Integer.parseInt(command[1])) 
						{
							interest = account.calcInterest(Integer.parseInt(command[2]));
							break;
						}
					}
					System.out.printf("Interest: %.f", interest);
					break;
				}
				case "end": 
				{
					System.out.println("Goodbye");
					break loop;
				}
				default:
					System.out.println("Wrong command! Enter valid command:");
					break;
				}
			}
		}
		System.out.println();
	}
}
