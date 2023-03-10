package etc.api.lang.system;

public class SystemTime {

	public static void main(String[] args) {

		
		/*
		 System 클래스가 제공하는 currentTimeMillis();는
		 1970년 1월 1일 자정을 기준으로 현재까지 소요된 시간을
		 밀리초 (1/1000)로 변환한 long타입의 정수를 반환합니다. 
		 */
		
		
		long start = System.currentTimeMillis();
		
		int total = 0;
		for (long i = 1; i<=100000000L; i++)
		{	total += i;
		
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("실행소요시간" +(end-start)* 0.001 +"초");
		
		// 어떤 프로그램의 특정 시간을 측정할때 필요함  객체 생성 필요없음
		
		
		System.exit(0);// 프로그램 종료 강제로
		System.out.println(System.getProperties());
		System.out.println(System.getenv());
		
	}

}
