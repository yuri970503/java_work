package basic.casting;

public class CastingExample2 {

	public static void main(String[] args) {
		
		/*
		 - 크기가 큰 데이터 타입의 값을 작은 데이터 타입으로 변환 하려면 
		 반드시 형 변환 연산자: (type)를 사용하여 명시적으로 
		 형 변환을 진행해 주셔야 합니다.  (DownCasting -> 자동으로 안됨)
		 
		 -명시적으로 형 변환을 해야 하는 이유는, DownCasting의 경우
		 저장 공간이 줄어들어 데이터 손실의 가능성이 항항 존재하기 때문입니다.
		 (overflow, underflow)
		 */
		
	    int i = 72;
		char c = (char) i; // 앞에 괄호 안에 타입이름을 쓴다
        System.out.println("72의 문자값 " + c);		

        double d =  4.98765;  
        int j = (int) d;  // 값의 손실의 위험이 있음으로 보고 직접 내려라. 자동으로 안해준다.
        System.out.println(j);
        
        int k = 1000;
        byte b = (byte) k;
        System.out.println(b); // -24 이진수의 값 자바가상머신이 안해준다. 본인이 직접해라
		
	}

}
