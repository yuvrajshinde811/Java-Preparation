package Arrays;

import java.util.*;

public class ArrayFundamentals {

	public static void main(String[] args) {

		ArrayFundamentals obj = new ArrayFundamentals();

		obj.manualArray();
		obj.stringArray();
		obj.inputArray();
	}

	public void manualArray() {
		int[] marks = {98, 92, 96, 93, 95}; // creating array manually my inserting each value
		System.out.println(marks[1]);
	}

	public void stringArray() {
//		String[] subjects = new String[3];
		String[] subjects = {"English", "Math", "Marathi", "Science", "History"};
		System.out.println(subjects[1]);
	}

	public void inputArray() {
		int[] arr = new int[5];
		Scanner in = new Scanner(System.in);

		for(int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
			System.out.print(arr[i] + " ");

		}

		String[] str = new String[4];

		for(int i = 0; i < str.length; i++) {
			str[i] = in.next();
		}

		System.out.println(Arrays.toString(str));
		in.close();
	}

}