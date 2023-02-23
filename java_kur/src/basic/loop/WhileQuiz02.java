package basic.loop;

import java.util.Scanner;

public class WhileQuiz02 {

	public static void main(String[] args) {

		//입력받은 수의 약수의 총합을 구하세요.
		//입력받은 값 : 12 -> 1 2 3 4 6 12 -> 28
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("숫자를 입력해 주세요 : ");
		int num = sc.nextInt();
		
		int i = 1; // bigin
		int sum = 0;//누적합을 담아줄 변수
		while(i <= num ) {
			if (num % i == 0) {
				sum += i;
		   }
			i++;
		}System.out.println("입력받은 값: " +num );
		System.out.println(num + "의 약수의 총합: " + sum );
		     

		 sc.close();
	}

}
