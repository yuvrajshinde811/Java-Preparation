package Arrays;
import java.util.*;

public class MultiDimension {

	public static void main(String[] args) {
		
		MultiDimension obj = new MultiDimension();
		obj.maunal_arr();
		obj.input_arr();
	}
	
	public void maunal_arr() {
		
		int [][] arr = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
		
		System.out.println("this is printed using toString");
		
		for(int row = 0; row < arr.length; row++) {
			System.out.println(Arrays.toString(arr[row]));
		}
	}
	
	public void input_arr() {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][3];
		
		for (int row = 0; row < 3; row++) {
			// for the col in each row
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = sc.nextInt();
				
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
		
		// also we can print this using the to string method
		
		for (int row = 0; row < 3; row++) {
			System.out.println(Arrays.toString(arr[row]));
		}
		
		
		// now by the enhanced for loop
		System.out.println("This is enhanced for loop");
		
		for(int[] a : arr) {
			System.out.println(Arrays.toString(a));
		}
	}
}
