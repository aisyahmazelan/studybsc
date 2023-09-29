package Day2;

public class StaticMethodProblems 
{
	public static void main (String[] args)
	{
		EggsAndHam();
		OnBoat();
		EggsAndHam();
		System.out.println();
		Lollipop();
		System.out.println();
		Lollipop();
		CallLollipop();
	}
		public static void EggsAndHam()
		{
			System.out.println("I do not like green eggs and ham,\nI do not like them, Sam I am!");
		}
		public static void OnBoat()
		{
			System.out.println("I do not like them on boat,\nI do not like them with a goat.");
		}
	

		public static void Lollipop()
		{
			System.out.println("Lollipop, lollipop\nOh, lolli lolli lolli");
		}
		public static void CallLollipop()
		{
			System.out.println("Call my baby lollipop");
		}
}
