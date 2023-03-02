package oop.basic;

public class PenMain {

	public static void main(String[] args) {
		/*
		 설계도에 작성한 속성과 기능을 사용하려면
		 반드시 실체(객체)를 생성하셔야 합니다.
		 클래스만 제작된 채로는 아무 기능도 수향할 수 없습니다. 
		 */

		// 객체 생성 문법 : 클래스타입 변수명 = new 클래스이름();
		  Pen redpen = new Pen();
		  Pen blakpen = new Pen();
		  Pen bluepen = new Pen();
		  //객체가 어디에 있는지 알아야 한다.
	    // 팬  변수   클레스타입 변수명 
       
       //참조 연산자(.)를 통해 객체로 점근한 뒤
       //속성을 지정하고 기능을 사용할 수 있습니다.
       
       redpen.color = "빨강";
       redpen.price = 500;
       bluepen.color = "파랑";
       bluepen.price = 600;
       blakpen.color = "검정";
       blakpen.price = 700;
       //객체를 참조 불러들여서 입력
       //타입의 맞는값만 넣을 수 있다.
       
       redpen.write();
       bluepen.write();
       blakpen.write();
       redpen.priceInfo();
       bluepen.priceInfo();
       blakpen.priceInfo();
	}

}
