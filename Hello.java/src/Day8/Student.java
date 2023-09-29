package Day8;

public class Student 
{
	int id;
	String name;
	Student(int i, String n)
	{
		id = i;
		name = n;
	}
	void display()
	{
		System.out.println("Student ID : " + id + "\nName : " + name);
	}
}
