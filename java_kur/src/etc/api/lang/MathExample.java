package etc.api.lang;

public class MathExample {

	public static void main(String[] args) {
		
		        //올림
				int i = (int) Math.ceil(1.1);
				System.out.println(i);
				
				//내림
				double d = Math.floor(1.5);
				System.out.println(d);
				
				//반올림           소수점 첫째자리에서 반올림함 근데 다른자리에서 반올림하고 싶으면
				                // 만약 2번째라면 100* 라운드로 보내준다음 다시 100/야 한다
				double d2 = Math.round(3.141592*1000)* 0.001;
				System.out.println(d2);
		
				//제곱
				double d3 = Math.pow(3.0, 4.0);
				System.out.println(d3);
				
				//최대값
				int max = Math.max(2, 10);
				System.out.println(max);
				
				//최소값
				int min = Math.min(24, 33);
				System.out.println(min);
	}
	
}
