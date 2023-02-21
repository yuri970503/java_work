package basic;

import java.util.Scanner;

public class IfExample1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("점수를 입력하세요: ");
		int point = sc.nextInt();
		System.out.println("내 점수:" + point + "점");
		System.out.println("-------------------------");
		
		if( point >= 70) {
		//블록 참일때만 들어올 수 있음
			System.out.println("70점 이상입니다.");
			System.out.println("합격입니다.");
          } else { // 단독으로 못함 조건문 못씀
        	  System.out.println("70점 미만입니다.");
        	  System.out.println("불합격하셨습니다.ㅠㅠ");
          }
		
		 System.out.println("시험 치르느라 수고하셨습니다.");
		
		//논리형 true falsel 중복코드 x 
       	  
		
		
		
		sc.close();
    }

}











