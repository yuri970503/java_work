package basic;

public class CastingExample3 {

	public static void main(String[] args) {
		
		
		char c = 'B';
		int i = 2;  //문자열과는 다르다. 서로 다른 데이터 타입의 연산은 더 큰 타입으로 맟춰준다. 
		
		// 서로 타입이 다른 기본 데이터의 연산 시에는 데이터 타입이 큰 쪽에 
		//작은 쪽이 맞춰져서 자동으로 형 변환이 진행된 뒤에 연산이 진행됩니다.
		
		
		int intResult = c + i;
		char charResult  = (char) (c + i);
        System.out.println(intResult);
        System.out.println(charResult);
        
        int k = 10;   // int / int 는 int 이다. 그래서 답은 2.0인 것이다.
        double d =  k / 4.0; //k 앞에 double로 써주거나 뒤에 4를 소수점을 붙여준다
                             // 그럼 2.5가 나온다. 둘 중 하나를 double로 바꿔라
                            // 내릴때만 쓰는게 아니다. 타입을 끌어 올릴 수 도 있다.
        System.out.println(d);
        
        
        //int보다 작은 크기의 데이터 연산은 자동으로 값이
        //int로 변환되어 처리됩니다. (데이터 손실의 방지)
        byte b1 = 100; // byte는 170을 표현할 수 없는데  int 로 변환되서 나온다.
        byte b2 = 70;
        System.out.println(b1 + b2);
        
         /* 연산자
          단항연산자 1개 
          이항연산자 2개
          삼항연산자 3개
          */
        
        
        
	}

}
