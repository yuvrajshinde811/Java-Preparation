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
		numbers.add(65);
		
		System.out.println(numbers);
		
		numbers.set(0, 55); //Replace an element (index, value)
		
		System.out.println(numbers.contains(23));
		System.out.println(numbers.get(3));  //Get an element by index
		System.out.println(numbers.size()); //Get the number of elements
		System.out.println("gives index number of that value " + numbers.indexOf(45)); //Find the first matching index
		System.out.println(numbers.isEmpty());
		
		System.out.println(numbers);

	}

}
