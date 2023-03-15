package chap1;

import java.util.Scanner;

public class Solution03 {

	public static void main(String[] args) {
		
		
		int [] scores = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<scores.length; i++) {
			System.out.print("점수를 입력하세요: ");
			scores[i] = sc.nextInt();
		}
		
		System.out.println("점수\t\t순위");
		System.out.println("---------------------");
		
		for(int s : scores) {
			int rank = 1;
			for(int i=0; i<scores.length; i++) {
				if(s < scores[i]) {
					rank++;
				}
			}
			System.out.printf("%d\t\t%d\n", s, rank);
		}
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
