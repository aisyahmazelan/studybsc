package Day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Shuffle {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String values = scanner.nextLine();
		List<String> list_Strings = Arrays.stream(values.split(" ")).collect(Collectors.toList());
		List<Integer> nums = new ArrayList<>();
		for (int i = 0; i < list_Strings.size(); i++)
			nums.add(Integer.parseInt(list_Strings.get(i)));

		Collections.shuffle(list_Strings);
		System.out.print(list_Strings);
	}
}
