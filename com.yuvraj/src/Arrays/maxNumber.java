package Arrays;

public class maxNumber {

	public static void main(String[] args){
		
		int[] arr = {12, 78, 65, 89, 42, 62, 101};
		System.out.println("Max number : "+ Max(arr));
		
		System.out.println("Max number via range: "+ maxRange(arr, 2, 4));
	}
	
	static int Max(int[] arr) {
		int max_num = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max_num) {
				max_num = arr[i];
			}	
		}

		return max_num;
	}
	
	static int maxRange(int[] arr, int start, int end) {
		int max_num = arr[start];
		
		for(int i = 1; i < end; i++) {
			if(arr[i] > max_num) {
				max_num = arr[i];
			}	
		}

		return max_num;
	}

}
