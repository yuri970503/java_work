package basic;

import java.util.Scanner;

public class IfQuiz05 {

	public static void main(String[] args) {
		
		/*
		 #국어, 영어, 수학점수를 각각 입력받아서
		 평균을 구해 보세요(평균은 소수점 첫째 자리까지 출력)
		 평균이 90점이 넘는다면, 다시 한 번 조건을 검사해서
		 95 100 A+
		 94 90 A
		 80 B 70 C 60 D 니머지는 F
		 
		 ex
		 평균 점수 :
		 당신의 학점은  입니다.
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수를 입력하세요:");
		int k1 = sc.nextInt();
		
		System.out.println("영어점수를 입력하세요:");
		int e1 = sc.nextInt();
		
		System.out.println("수학점수를 입력하세요");
		int m1 = sc.nextInt();
		
		double age = ((k1 + e1 + m1) / 3.0);
		String grade;
		
		if(age >= 90) {
			if(age >= 95) {
				grade = "A+";
			}else{
				grade = "A0";
			}
			
		}else if(age >= 80) {
			grade = "B"; 
		}else if(age >= 70) {
			grade = "C";
		}else if(age >= 60) {
			grade = "D";
		}else {
			grade = "F";
		}
		
		System.out.printf("평균 점수: %.1f\n", age);
		System.out.printf("당신의 학점은" + grade + "입니다.");
		
		
		
		

	}

}
