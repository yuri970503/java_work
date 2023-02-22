package basic.begin;

import java.util.Scanner;

public class CelToFahr {

	public static void main(String[] args) {
		/*
		 사용자에게 섭씨온도를 입력받아서
		 화시온도로 변환하여 출력하는 로직을 작성하세요.
		 변환공식은 저도 몰라요. 여러분들이 찾아서 적용해 주셔야 합니다.
		 화씨 온도는 소수점 첫째 자리까지 표현해 주시기 바랍니다.
		 # ㄹ 한자 
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("섭씨 온도를 입력하세요: ");
		double cel = sc.nextDouble();
		System.out.printf("화씨온도: %.1f℉",cel *1.8+32);
		
		sc.close();
		
		
		 
		/* 모범답안
		 double fahr = cel * 1.8 +32;
		 System.out.printf("입력한 섭씨: %.1f℃\n",cel); 
		 System.out.printf("입력한 화씨: %.1f℉\n", fahr); 
		 
		 double fahr = cel * 9 / 5 + 32;
		            int여서 정수와 정수의 연산은 int이다
		            
		 double fahr = cel * 9.0 / 5 + 32;
         double fahr = (double)cel * 9 / 5 + 32;	               
		 */
		
	}

}
