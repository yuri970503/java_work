package chap1;

import java.util.Scanner;

public class Solution01 {

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			System.out.print("정수 " + (i+1) + ": ");
			arr[i] = sc.nextInt();
		}

		//		System.out.println(Arrays.toString(arr));

		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}

		System.out.println("최대값: " + max);











	}

}
