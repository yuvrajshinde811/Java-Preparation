package Arrays;

import java.util.Arrays;

public class Swapping{
	
	public static void main(String[] args) {
		int[] arr = {10, 45, 98, 62, 78, 26};
//		int[] arr = {0,  1,   2,  3,  4,  5};
		
		Swap(arr,2,4);
		System.out.println(Arrays.toString(arr));
		
		
		System.out.println("Array after reversing");
		reverse(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	static void Swap(int[]arr, int index1, int index2) {
		
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	static void reverse(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start < end) {
			// swapping
			Swap(arr, start, end);
			start++;
			end--;
		}
		
	}
}
