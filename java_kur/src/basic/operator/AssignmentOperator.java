package basic.operator;

public class AssignmentOperator {

	public static void main(String[] args) {
	
		/*
		 #대입 연산자(=)
		 #복합 대입 연산자(+=, -=, *=, /=, %=) % 나눈 나머지가 값이 된다
		 -변수의 값을 대입할 때 사용하는 연산자 입니다.
		 복합대입 연산자는 대입 연산자에 산술 연산자가 결합되어있는 형태입니다.
		 */
		
//		 int b =+ 3; // b = =3;
//		 System.out.println(b);
		
		int a = 5;
		int b = 5;
		
		a += 3; // a = a + 3 (기존값에 누적해서 연산하고 싶을때)
		System.out.println(a);
		
		System.out.println("-------------------------");
		
		a -= 4; // 4
		System.out.println(a);
		
		a *= 6; // 24 
		System.out.println(a);
		
		a /= 5; // 4
		System.out.println(a);
		
		a %= 3; //1
		System.out.println(a);

	}

}
