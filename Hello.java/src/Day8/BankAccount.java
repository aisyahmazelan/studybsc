package Day8;

import java.util.Scanner;

public class BankAccount 
{
	private static final double DEFAULT_INTEREST = 0.15;
	private static double interestRate = DEFAULT_INTEREST;
	private static int bankaccountscount = 0;
	
	private int id;
	private double balance;


	public BankAccount()
	{
		bankaccountscount++;
		id = bankaccountscount;
		System.out.printf("Account #%d created\n", id);
	}
	
	public static void setInterest(double interest)
	{
		BankAccount.interestRate = interest;
		System.out.printf("Interest rate changed : %.2f\n", interest);
	}
	
	public int getId()
	{
		return id;
	}
	
	public void deposit(double x)
	{
		balance += x;
		System.out.printf("Deposited : %.2f to account #%d\n", x, id);
	}
	
	public double calcInterest(int month)
	{
		return balance * interestRate * month;
	}
	
	@Override
	public String toString()
	{
		//TODO Auto-generated method stub
		return String.format("Acc #%d\nBalance : RM%.2f\n", id, balance);
	}
}