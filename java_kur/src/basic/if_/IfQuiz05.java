package basic.if_;

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
		
		double avg= ((k1 + e1 + m1) / 3.0);
		String grade;
		
		if(avg>= 90) {
			if(avg>= 95) {
				grade = "A+";
			}else{
				grade = "A0";
			}
			
		}else if(avg >= 80) {
			grade = "B"; 
		}else if(avg >= 70) {
			grade = "C";
		}else if(avg >= 60) {
			grade = "D";
		}else {
			grade = "F";
		}
		
		System.out.printf("평균 점수: %.1f\n", avg);
		System.out.printf("당신의 학점은" + grade + "입니다.");
		
		
		sc.close();
		
		
		
		
		/* 모범답안 비교했을때 다른점
		  
	     double avg =((k1 + e1 + m1) / 3.0);
		  
		 if (avg>=90){
		       if(avg>100){
		         system.out.println("잘못된 점수입니다.")
		       }else if(avg >= 95){
		         system.out.println("당신의 학점은 A+ 입니다.)
		       }else{
		         system.out.println("당신의 학점은 A0 입니다.)
		       } else if(avg >= 80) {
			System.out.println("당신의 학점은 B 입니다.");
			
		} else if(avg >= 70) {
			System.out.println("당신의 학점은 C 입니다.");
			
		} else if(avg >= 60) {
			System.out.println("당신의 학점은 D 입니다.");
			
		} else {
			if(avg < 0) {
				System.out.println("잘못된 점수입니다.");
			} else {
				System.out.println("당신의 학점은 F입니다.");
			}
		 }
		  
		  
		  
		 */

	}

}
