package oop.basic;

//객체 설계용 클래스 (라이브러리 클래스)는 메인 메서드를 작성하지 않습니다.
public class Pen {

    //객체의 속성을 필드 (멤버변수)라고 부릅니다.
	String color;
	int price;
	
	void write()
	{
		System.out.println(color + "색 글을 씁니다.");
		
	}
	
	
	void priceInfo()
	{
		System.out.println(color + "색 펜의 가격은" + price + "원 입니다.");
		
		//설게만 한것이다 아직 만들지 않았다. 틀만 만든것이다. 
		// 메인이 없어서 실행이 안된다 메인이 필요가 없다.
	}
	
}
























