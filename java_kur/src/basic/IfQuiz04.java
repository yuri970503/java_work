package basic;

import java.util.Scanner;

public class IfQuiz04 {

	public static void main(String[] args) {
		/*
		 - 정수 3개를 입력 받습니다.
		 - 가장 큰 값, 가장 작은 값, 증간값을 구해서 출력해 보세요.

		 #max, mid, min 이라는 변수를 미리 선언하셔서
		 판별이 될 때 마다 각각의 변수에 값을 넣어줍니다.
		 마지막에 한번에 출력하시면 되겠습니다.
		 */




		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 숫자를 입력해주세요: ");
		int one = sc.nextInt();
		System.out.println("두번째 숫자를 입력해주세요: ");
		int two = sc.nextInt();
		System.out.println("마지막 숫자를 입력해주세요: ");
		int three = sc.nextInt();

		int max, mid, min;


		if(one > two && one > three && two >three ) {

		}else if(one > two && one > three && three > two) {

		}else if(two > one && two > three && three > one ) {

		}else if(two > one && two > three && one > three) {

		}else if(three > one && three > two && one > two) {

		}else {

		}


		/*모범답안 
	     기본세팅 후

	     int max, mid, min;

	     if (num1 > num2 && num1 > mum3){      //num1 = max
	         max = num1;
	         if(num2 > num3){
	            min = num2; min = num3;
	            }else { 
	               mid = num3; 
	               min = num2;
	            }
	     }else if(num2 > num1 && num2 > num3){   //num2= max
	            max = num2;
	            if(num1 > num3){
	               mid = num1; min = num3;
	            }else {
	               mid = num3; min = num1;
	            }
	     }else {                                // num3 = max
	         max = num3;
	         if(num1 > num2){
	              min = num1; min = num2;
	         }else{
	              min = num2; min = num1;
	         }
	     }

	     sytem.out.println("---------------------------------")
	     sytem.out.println("최대값: "+ max)
	     sytem.out.println("중간값: " + mid)
	     sytem.out.println("최소값: " + min)


		 */











	}

}
