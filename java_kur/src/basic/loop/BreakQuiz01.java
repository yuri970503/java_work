package basic.loop;

import java.util.Scanner;

public class BreakQuiz01 {

	public static void main(String[] args) {
		
		/*
		  2가지의 정수를 1~100사이의난수를 발생
		  문제 출제 후 정답입력받기
		  0을 입력하변 반복문을 탈출
		  
		  종료이후 정답오답횟수 출력
		 */
		
          Scanner sc = new Scanner (System.in);
          int cCount = 0;//정답횟수
          int iCount = 0;// 오답횟수
          
		
          System.out.println("***간단한 퀴즈***");
          System.out.println("종료하시려면 0을 입력해 주세요.");
          
          
          while(true) {
  			
  			int rn1 = (int) ((Math.random()*100) + 1);
  			int rn2 = (int) ((Math.random()*100) + 1);
  			int num = (int) (Math.random()*2);
  			
  			int correct;
  			if(num == 0) {
  				System.out.printf("%d + %d = ???\n", rn1, rn2);
  				correct = rn1 + rn2;
  			} else {
  				System.out.printf("%d - %d = ???\n", rn1, rn2);
  				correct = rn1 - rn2;
  			}
  			
  			System.out.print("> ");
  			int answer = sc.nextInt();
  			
  			if(answer == correct) {
  				System.out.println("정답입니다!");
  				cCount++;
  			} else if(answer == 0) {
  				System.out.println("종료합니다.");
  				break;
  			} else {
  				System.out.println("틀렸습니다~");
  				iCount++;
  			}
  			
  		}
  		
  		System.out.println("------------------------");
  		System.out.println("정답 횟수: " + cCount + "회");
  		System.out.println("오답 횟수: " + iCount + "회");
  		
  		sc.close();
  		  
          
          
	}

}






















