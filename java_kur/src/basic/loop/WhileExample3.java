package basic.loop;

import java.util.Scanner;

public class WhileExample3 {

	public static void main(String[] args) {
		
		/*
		 정수 1개를 입력받아서 해당 정수가 소수(prime number)
		 인지를 판별하시면 됩니다. 
		 *///나누어 떨어지는 수가 1과 자기자신밖에 없는 수 - 소수

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		
		int i = 1;//소수의 판별을 위해 입력받은 num을 지속적으로 나누어 볼 변수.
		int u = 0;//나누어 떨어진 횟수를 기억할 변수.
		while (i <= num) {
			if (num % i == 0) {
				u++;
			} i++;
		}if(u == 2) {
			System.out.println(num +"은(는) 소수입니다.");
		}else {
			System.out.println(num + "은(는) 소수가 아닙니다.");
		} sc.close();
		
		System.out.println("----------------------------");
		
		// 이런문제도 있다.
		
		int j = 2;//1은 모든 수의 약수이기 때문에 배제합니다.
		
		while(num % j != 0) { //항상 부등호로 표현 할 필요가 없다.
			j++;
			
		}
		System.out.println(num == j ? "소수입니다":"소수가 아닙니다.");
		
		
		
		
	}

}
