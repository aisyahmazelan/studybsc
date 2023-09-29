package Day2;

public class ScopeAndLifetime 
{
	public static void main (String[] args)
	{
		String outer = "I'm inside the Main()";
		for (int i = 0; i<10; i++)
		{
			String inner = "Im'm inside the loop";
		}
		System.out.println(outer);
		//System.out.println(inner); Error
	}
}
