package etc.api.random.copy;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		Random r = new Random();
		
		//실수 난수 : 0.0 <=1.0
		double d = r.nextDouble();
		System.out.println(d);
		
		//정수 난수 : nextInt();
		int i = r.nextInt();
		System.out.println(i);
		
		// 0 5 정수 난수 생성 (끝값 미만)

		int j = r.nextInt(6);
		System.out.println(j);
		
		//10 100 까지 난수 생성
		int k = r.nextInt(91) + 10; //곱하기 않해도되서 편함
		System.out.println(k); 
		
		
		boolean flag = r.nextBoolean();
		System.out.println(flag);
	}  //문제 풀기

}
