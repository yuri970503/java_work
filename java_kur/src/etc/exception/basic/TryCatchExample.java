package etc.exception.basic;

import java.util.Scanner;

public class TryCatchExample {

	public static void main(String[] args) {
		
		/*
		 에외처리
		 개발자가 코드를 통해 처리할 수 있는 에러를 다루는 것
		 
		 예외처리는 시스템 스스로 복구하는 것이 아니고 
		 오류 발생 가능성이 있는 부분에 대한 처리를 미리 준비하는 것입니다.
		 
		 시스템의 비정상적 종료를 막고 코드의 흐름이 계속 될 수 있도록 사전에
		 준비하는 행위를 말합니다.
		 */
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		try
		{ //예외 발생 가능성이 있는 코드를 작성합니다.   값을 문자로 작성해도  이렇게하면 정상적으로 실행되긴한다
			// 애러발생 즉시 스탑                   그치만 0을 입력한게 아니다 그러면 catch문을 하나더 만들어주면 된다.
			                                   //더 쓸 수 있다
		
		System.out.println("정수 1: ");
		int i = sc.nextInt();
		System.out.println("정수 2: ");
		int j = sc.nextInt();
		
		System.out.println("나눗셈 시작");
		
			
		
			System.out.printf("%d /%d = d\n%" ,i,j,i/j); 
		
		      // 에외 타입 여러종류의 객체들의 부모 모든 자식들이 들어올 수 있음 들어올 수 있다 
			//객체 생성 받을 수 있다 그럼 실행이 된다.
			//예외 타입들이 있다 Exception 모든 예외처리의 부모 거의 다 받아줄 수 있다
		}catch(Exception e)//무슨뜻? 에러나면 객체 생성후 자기를 받아줄 catch문 찾음 그러다가 없으면 강제종료 
		//클래스 이름 에러났을때 나옴
		{ //실제 예외가 발생했을 경우에 실행할 코드를 작성합니다. 괄호를 열고 무언가를 적음 저건뭘까?????
		 //타입을 직접써도 된다 하지만 모르면 다형성을 반영한 Exception문을 써도 된다.
			System.out.println("0으로 나누지 마세요");
		}
		sc.close();
		
		
		System.out.println("나누기 종료");
		
		//0으로 나누기 못함  18번째 나눗셈에서 에러발생
		
		

		
		//멀티 catch 작성!!
	}

}
