package arrays;

import java.util.Arrays;

public class revarr {
	public static void main(String[] args) {
		int[] arr= {1,5,3,7,11,9,15};
		rear(arr);
		
		
	}

	private static void rear(int [] arr) {
		int maxind= arr.length -1;
		int hlf= arr.length/2;
		for(int i=0;i<hlf;i++) {
			int temp=arr[i];
			arr[i]=arr[maxind-i];
			arr[maxind-i]=temp;
			
			
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
