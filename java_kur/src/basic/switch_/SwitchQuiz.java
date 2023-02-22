package basic.switch_;

import java.util.Scanner;

public class SwitchQuiz {

	public static void main(String[] args) {
		/*
		 정수를 하나 입력 받고 연산자를 하나 입력 받으세요.
		 다시 정수를 입력받아서 사용자가 선택한 연산자를 기준으로
		 연산 결과를 출력해 주시면 됩니다. 
		 연산자가 잘못 입력되었다면 연산자를 똑바로 입력하라고 
		 결과를 말씀해 주세요.
		 */
        
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력해주세요: ");
		int num1 = sc.nextInt();
		
		System.out.print("연산기호를 입력해 주세요[+,-,/,*] :  ");
	    String d = sc.next();
	    
	    System.out.print("두번째 숫자를 입력해 주세요: ");
	    int num2 =sc.nextInt();
		
		switch (d) {
		
		case "+":
			System.out.printf("두수의 값은 %d 입니다.",num1 + num2);
			break;
		case "-":	
			System.out.printf("두수의 값은 %d 입니다.",num1 -  num2);
			break;
		case "/":
			System.out.printf("두수의 값은 %d 입니다.",num1 / num2);
			break;
		case "*":
			System.out.printf("두수의 값은 %d 입니다.",num1 * num2);
			break;
		default:
			System.out.println("잘못 입력되었습니다.");
			
			
			
			
			/*
			  기본 
			  System.out.print("정수1:");
			  int num1 = sc.nextInt();
			  
			  System.out.print("연산을 선택하세요: ");
			  String operator = sc.next();
			  
			  System.out.print("정수2: ");
			  int num2 = sc.nextInt();
	
			  
			  switch(operator)
			  
			  case"+":
			       int result = num1 + num2; 
			      System.out.println("두 수의 덧셈 결과: " + result);
			      break;
			  case"-":
			      System.out.println("두수의 뺄셈 결과: + result");
			       break;
			  case"*":
			      System.out.printf("%d * %d = %d\n",num1,num2,num1 * num2);
			       break;
			  case"/":
			      System.out.printf("%d / %d = %d\n",num1,num2,num1 / num2);
			        break;
			  default:
			System.out.println("사칙연산 기호를 정확하게 입력하세요.");
			System.out.println("[+,-,*,/]");
			  
			  
			  
			  
			 */
		}
		
		
	}

}
