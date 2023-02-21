package basic;

public class TexualExample {

	public static void main(String[] args) {
		
		char c1 = 'A'; // 쌍따옴표는 안된다. (단일문자) 차 캐릭터
		System.out.println(c1);
		
		char c2 = 44032;
		System.out.println(c2); // 아스키 코드로인해 값이 A가 나왔다.
        //2byte                 // 정수 65가 나온게 아니다.
		                       // 유니코드 - 전국의 언어를 표현하는게 가능하다.
		                       //많이 쓰이지 않는다. 단일문자이기 때문 
		
		
		/*
		 # 문자열을 저장할 수 있는 데이터 타입 String (단일문자가 일렬로 나열되어있는것)
		 - 저장하고 싶은 문자열을 겹따옴표("")에 담아 대입합니다.
		 - String은 기본 데이터 타입은 아니지만 자주 쓰이기 때문에 
		 기본 데이터 타입처럼 사용합니다 (사실은 객체 타입)
		 */
	     
		String s1 = "my dream";
		String s2 = "is a programmer";
		System.out.println(s1);
		System.out.println(s2);  
		
		// 연결 더하기 다른건 안됨 
        // 자바에서는 문자열의 덧셈 연산을 지원합니다.
		//연산 결과로는 문자열을 연결해서 결합한 결과가 도출됩니다.
		System.out.println(s1 + s2);
		
		//문자열과 다른 데이터 타입 간의 연산
		//결과는 무조건 문자열의 덧셈 연산과 같습니다.
		// 정수형 실수형 등 다른 타입간의 덧셈도 문자형으로 출력된다. 애러 아님 
		
		System.out.println("---------------------------");
		
		System.out.println(100 + 100);
		System.out.println("100"+"100");
		System.out.println("100" + 100);
		System.out.println(3.14 + "hi");
		
		int month = 10;
		int day = 13;
		
		// 내 생일은 10월 13일 입니다.
		  System.out.println("내 생일은 " + month + "월"  + day + "일 입니다.");
		
	}

}
