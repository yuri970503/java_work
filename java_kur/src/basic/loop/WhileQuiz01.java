package basic.loop;

import java.util.Scanner;

public class WhileQuiz01 {

	public static void main(String[] args) {
		/*
		 사용자에게 구구단 단수를 입력받아서
		 해당 단수의 구구단을 출력해 보세요.
         
         구구단을 입력하세요: 4
		 4 x 1 = 4
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구구단을 입력하세요");
		int num = sc.nextInt(); 
		System.out.println("***구구단" + num + "단 ***");
		
		int i = 1;
	
		while (i <= 9) {
			System.out.println(num + "x" + i + "=" + num*i);
			//         printf("%d x %d =%d\n", num,i,num*i);      
			i++;}
		sc.close();

	}  

}
