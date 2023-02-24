package basic.loop;

public class LoopNestingQuiz01 {

	public static void main(String[] args) {
		/*
		 구구단을 가로로 출력

		  구단을 세로로 출력
		 */

		for (int dan =2; dan <= 9; dan++) {
			System.out.printf("%d 단: ",dan);
			for(int hang = 1; hang <= 9; hang++ ) {
				System.out.printf("%d x %d = %d ",dan,hang,dan*hang);
			}System.out.println();
		} 
		System.out.println("\n----------------------------------------");

		for(int hang= 0; hang <= 9; hang++) 
		{//행을 0부터 시작 단수를 적기위해
			for (int dan = 2; dan <= 9; dan++ ) 
			{
				if(hang == 0) 
				{
					System.out.print(dan + "단\t");
				}else {
					System.out.printf("%dx%d=%d\t",dan,hang,dan*hang);
				}
			}   System.out.println();
		}




	}

}
