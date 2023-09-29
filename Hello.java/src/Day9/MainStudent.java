package Day9;

import java.util.Scanner;

public class MainStudent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter {firstName} {lastName} {age} {city}:");
		String line = "";
		while(!line.equals("end")) {
			line = sc.nextLine();
			if (line.equals("end") || line.split(" ").length != 4)
				continue;
			String[] data = line.split(" ");
			Student exist = Student.getStudent(Student.students, data[0], data[1]);
			if (exist != null) {
				exist.setAge(Integer.parseInt(data[2]));
				exist.setCity(data[3]);
			} else {
				Student newStudent = new Student(data[0], data[1], Integer.parseInt(data[2]), data[3]);
				Student.students.add(newStudent);
			}
		}
		
		System.out.print("Enter a city: ");
		String city = sc.nextLine();
		for (Student s: Student.students) {
			if (s.getCity().equals(city))
				System.out.println(s);
		}
	}

}

