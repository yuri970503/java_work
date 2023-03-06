package oop.encap.good;

public class MainClass {

	public static void main(String[] args) {
		
		
		

		MyBirth my = new MyBirth();
		
//		my.year = 1992;
		my.setYear(1992);
		my.setMonth(10);
		my.setDay(13);
		
		System.out.printf("내 생일은 %d년 %d월 %d일 입니다.\n", my.getYear("abc123"),my.getMontn(),my.getDay());
		
		
		
		
		
		
		//제대로 된 값을 넣을 수가 없다... private을 써서 그렇다
		//같은 클래스 안에서만 사용가능하기 때문이다 
		// 메서드를 통해 값을 넣을 수 있게 하는 방법이 이ㅆ다

	}

}









