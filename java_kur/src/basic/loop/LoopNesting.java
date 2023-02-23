package basic.loop;

public class LoopNesting {

	public static void main(String[] args) {
		/*
		 반복문 중첩
		 
		  외부 반복문 내부에 내부 반복문이 존재하는 형태를
		  반복문 중첩이라고 한다.
		  반복문 자체를 반복시켜야 할 경우 중첩을 사용합니다.
		  
		  내부 반복문이 종료가 되여도, 외부 반복문이 끝나지 않는다면
		  내부 반복문으 외부 반복문의 제어 변수의 크기 및 범위까지 
		  게속해서 반복 실행되게 됩니다. 예) 시계 분침이 60번 반복하면 시침이 한번 움직이는 원리와 같다. 
		 */
		
		for (int dan =2; dan <= 9; dan++) {
			System.out.println("구구단 "+dan +"단");
			System.out.println("---------------------");
			for(int hang = 1; hang<=9; hang++) {
				System.out.printf("%d x %d = %d\n",dan,hang,dan*hang);
			}
			
			System.out.println("---------------------------------");
		}
	}

}
