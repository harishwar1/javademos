package arrays;

import java.util.Scanner;

public class minval {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr= new int[5];
		getint(arr);
		findmin(arr);
	}

	private static void getint(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("enter numbers");
		for(int i=0;i<arr.length;i++) {
			arr[i]= scanner.nextInt();
		}
		
		
	}

	private static void findmin(int[] arr) {
		// TODO Auto-generated method stub
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println(min);
		
	}

}
