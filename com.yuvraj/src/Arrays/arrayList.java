package Arrays;
import java.util.*;

public class arrayList {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(19);
		numbers.add(9);
		numbers.add(13);
		numbers.add(23);
		numbers.add(45);
		numbers.add(65);
		
		System.out.println(numbers);
		
		numbers.set(0, 55);
		
		System.out.println(numbers.contains(23));
		
		System.out.println(numbers);

	}

}
