package arrays;

public class ArraysWithFunction1 {
	public static void printArray(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void incrementArray(int[]input) {
//		System.out.println(input);
//		input=new int[7];       it is a local variable
		for(int i=0;i<input.length;i++) {
			input[i]=input[i]+1;
		}
	}

	public static void main(String[] args) {
		
		int[]arr= {1,2,3,4,5};
//		System.out.println(arr);
		incrementArray(arr);          // first increase the value then print the ARRAY.
		printArray(arr);
		

	}

}
