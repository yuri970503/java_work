package basic.loop;

import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {

		//       int i = 1;
		//       int total = 0;
		//       while(i <= 10) {
		//    	   total += 1;
		//    	   i++;
		//       }

		int total = 0;
		for (int i = 1; i <= 10; i++) {
			total += i;
		}


		//1 ~ 200까지 정수 중 6의 배수 이면서 12의 배수는 아닌 수를 
		//가로로 출력해 보세요 
		int t = 0;
		for(int r = 1; r <= 200; r++) {
			if (r % 6 == 0 && r % 12 != 0  ) {
			}System.out.println( r + " ");
		}

			//1~60000까지의 정수 중 177의 배수의 개수를 구해보세요.

			int c= 0;
			for(int i = 1; i <= 60000; i++ ) {
				if(i % 177 == 0) {
					c++;
				}
			} System.out.println( c + " ");



			//입력받은 정수까지의 팩토리얼 값을 구하세요
			// 5! -> 5  x 4 x 3 x 2 x 1
			Scanner sc = new Scanner(System.in);
			System.out.println("정수를 입력하세요: ");
			int f = sc.nextInt();

			int tal = 1;
			for (int v = 1; v <= f; v++) {
				tal *= v;
			}System.out.println("입력받은 수 :" + f);
			System.out.println(f +"의 팩토리얼 값: " + tal);

			sc.close();
		
	}

}



