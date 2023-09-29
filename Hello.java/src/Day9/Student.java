package Day9;


import java.util.ArrayList;
import java.util.List;

class Student {

	public static List<Student> students = new ArrayList<Student>();

	private String firstName, lastName, city;
	private int age;

	public Student(String firstName, String lastName, int age, String city) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.city = city;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	static Student getStudent(List<Student> students, String firstName, String lastName) {
		for (Student student : students) {
			if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName))
				return student;
		}
		return null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s %s is %d years old.", firstName, lastName, age);
	}
}