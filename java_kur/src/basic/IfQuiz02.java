package basic; 

import java.util.Scanner;

public class IfQuiz02 {

	public static void main(String[] args) {
		
		/*
		 - 정수를 입력받아서, 두 정수 중 어느 수가 큰 지
		 혹은 같은지를 판별하시면 됩니다.
		 ex)
		 입력받은 수: 4,7-> 7이 큰 수 입니다. 
		 입력받은 수: 10, 3 -> 10이 큰 수 입니다.
		 입력받은 수: 5, 5 -> 같은 수 입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int number = sc.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요");
		int num2 = sc.nextInt(); 
		
		
		if (number > num2) {
			System.out.println(number + "이(가) 큰 수입니다.");
		} else if(num2 > number) {
			System.out.println(num2 + "이(가) 큰 수 입니다.");
		} else {
			System.out.println("같은 수 입니다.");
		}
		
		/*
		 if (num1 > num2){
		     System.out.println(num1 + "이(가) 큰 수입니다.");
		 }else if (num1 < num2){
		      System.out.println(num2 + "이(가) 큰 수입니다.");
		 }else {
		      System.out.println("같은 수 입니다.");
		 }
		 	
		 */
			
			
			
			
		
		
		
		
		
		
		
	}

}
