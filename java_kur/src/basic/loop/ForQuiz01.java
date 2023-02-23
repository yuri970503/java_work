package basic.loop;

public class ForQuiz01 {

	public static void main(String[] args) {
		//2~19까지의 난수를 생성하셔서 구구단을 출력해 보세요.
		//19행까지 출력하세요.

		int nan = (int)((Math.random()*18) + 2);
		
		
		System.out.println("***구구단 " + nan +"단****");
		System.out.println("-------------------------");
		
		for(int total = 1; total <= 19; total++) {
			System.out.printf("%d x %d = %d\n",nan,total, nan*total);
		} 
			
		
	}

}
