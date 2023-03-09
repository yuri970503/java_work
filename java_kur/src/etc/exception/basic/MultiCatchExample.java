package etc.exception.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchExample {

	public static void main(String[] args) {
		// 에러찾기
		Scanner sc = new Scanner (System.in);
		int[] arr = new int[5];
		
		try
		{
			System.out.println("정수 : ");
			int n = sc.nextInt();// input  머시기
			
			int result = 100 / n;// 산술예외
			
			System.out.println(arr[result]);// 인덱스???모르겠다

			String s = null;// null Pointer E머시기 Pointer변수가 있다 객체의 주소를 참조하고 있는 변수 
			           //Pointer가 null이라는것 null보고 못찾아감 null은 아무것도 없기 때문에 참조 못함 갈곳을 잃어버림 
			s.equals("메롱");
			//null.equals는 없다  문법상으론 문제가 없다 노란줄 그어져있음  run에러이다 
			
			
			/*
			 다중 catch문 은 실제로 에러가 발생하면
			 위에서부터 순서대로 catch 문을 검색하면서 내려오기 때문에
			 무보타입의 예외를 자식 타입의 예외보다 위에 작성하시면 안됩니다.
			 
			 catch문의 옆에 괄호에 예외 타입을 여러개 작성하고 싶은 경우는
			 기호를 사용하여 타입을 나열해 주시면, 하나의  catch 블록으로
			 여러타입의 예외를 처리할 수 있습니다.
			 (7)버전
			 */
			
			
		} catch(InputMismatchException e){
			System.out.println("정수를 입력");
		}catch(ArithmeticException e){
			System.out.println("0을 입력하지마세요");
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("인덱스 범위");
		}catch(NullPointerException e)
		{
			System.out.println("null참조 노노");
		}catch (Exception e) {//Exception은 마지막에 써라 얘가 부모여서 위에쓰면 
			//얘에ㅔ서 다 잡아버린다 애러원인을 써줄 수 도있다 e.getMessage를 이용 			
			System.out.println("알 수 없는 에러가 확인됨!");
			System.out.println("에러 원인: " + e.getMessage());
		}
		
		System.out.println("프로그램 정상 종료");
		//이렇게 작성만 해놓으면 하나밖에 안나온다 자세히 알려면 여러개 써주면 됩니다.
	} 

}//자바 17버전 하나의 catch문에서 여러개의 에러처리가능한 문법 나옴 하나의 catch문에 | 이기호를 사용하면 
// 쓸 수 있다 연관이 있는 애들끼리 묶어놓아라 그냥 막 하면 Exception으로 해라 
//  예시) catch(InputMismatchException | ArithmeticException e)











