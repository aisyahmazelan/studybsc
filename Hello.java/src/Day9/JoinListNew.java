package Day9;

import java.text.DecimalFormat;
import java.util.*;



public class JoinListNew {

	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		LinkedList <String> l_list = new LinkedList <String> ();
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");
		l_list.add("Pink");
		l_list.add("Orange");
		
		System.out.println("The original linked list : " + l_list);
		Collections.swap(l_list, 0, 2);
		System.out.println("The new linked list after swap : " + l_list);*/
		
		/*Map<K, V> <String, Double> fruits = new LinkedHashMap<>();
		fruits.put(("banana", 2.20);
		fruits.put(("kiwi", 4.50);
		for (Map.Entry<String, Double>entry:fruits.entrySet())
		{
			System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
		} */
		Scanner sc = new Scanner(System.in);
		/*double[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
		Map<Double, Integer> counts = new TreeMap<>();
		for (double num : nums)
		{
			if (!counts.containsKey(num))
			{
				counts.put(num, 0);	
			}
			counts.put(num, counts.get(nums) + 1);
		}
		
		for (Map.Entry<Double, Integer> entry : counts.entrySet())
		{
			DecimalFormat df = new DecimalFormat("#.#######");
			System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
		}*/
		
		/*int n = Integer.parseInt(sc.nextLine());
		Map <String,ArrayList<String>> word = new LinkedHashMap<>();
		for (int i = 0; i < n; i++ )
			{
			String words = sc.nextLine();
			String synonym = sc.nextLine();
			word.putIfAbsent(words,new ArrayList<>());
			word.get(words).add(synonym);
			}
		for (Map.Entry<String,ArrayList<String>> entry : word.entrySet())
		{
			System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
		}*/
		
		//int min = Arrays.stream(new int[] {15, 25, 35}).min().getAsInt(); 
		//System.out.println(min);
		
		/*ArrayList<Integer> nums = new ArrayList<>() {{add(15); add(25); add(35); }};
		
		//int sum = nums.stream().mapToInt(Integer::intValue).sum();
		
		int min = nums.stream().mapToInt(Integer::intValue).min().getAsInt();
		System.out.println(min);
		
		int max = nums.stream().mapToInt(Integer::intValue).max().getAsInt();
		System.out.println(max);
		
		int sum = nums.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
		double avg = nums.stream().mapToInt(Integer::intValue).average().getAsDouble();
		System.out.println(avg);
		
		int[] nums Arrays.stream(sc.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
		System.out.println(nums);
		
		String[] words = {"abc", "def", "geh", "yyy"};
		words = Arrays.stream(words).map(w -> w + "yyy").toArray(String[]::new);*/
		
		/*String[] words = Arrays.stream(sc.nextLine().split(" ")).filter(w -> w.length() % 2 == 0).toArray(String[]::new);
		
		for (String word : words)
		{
			System.out.println(word);
		}*/
		
	/*	List<Integer> nums =Arrays.stream(sc.nextLine().split(" ")).map(e -> Integer.parseInt(e)).
				sorted((n1,n2) -> n2.compareTo(n1)).limit(3).collect(Collectors.toList());
		for (int num : nums)
		{
			System.out.print(num + " ");
		}*/
		
		/*String[] words = sc.nextLine().split(" ");
		Random rnd = new Random();
		for (int pos1 = 0; pos1 <words.length; pos1++)
		{
			int pos2 = rnd.nextInt(words.length);
			String temp = words[pos1];
			words[pos1] = words[pos2];
			words[pos2] = temp;
		}
		
		System.out.println(String.join(System.lineSeparator(), words));*/
		
		public Student(String firstName, String lastName,int age, String city)
		{
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
			this.city = city;
		}
	}

}
