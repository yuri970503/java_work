package oop.test;

//작성중인 패키지와 다른곳에 위치한 클래스를 사용하려면 import선언이 필요합니다.
//import opp.fruit.Apple
//import oop.fruit.Banana;  
//import oop.fruit.Melon;
import oop.fruit.*; //fruit 패키지의 모든 클래스를 import 하겠다!

public class Test {

	public static void main(String[] args) {
		
		//다른 패키지 내의 같은 이름을 가진 클래스 객체를 생성할 때는
		//반드시 패키지 경로를 직접 표시해 주셔야 합니다.
		
		Apple a = new Apple();
		oop.juice.Apple a2 = new oop.juice.Apple();
		Banana b = new Banana();
		Melon m = new Melon();

		
//		java.util.Scanner sc = new java.util.Scanner(System.in); 거의 없음 이런것도 있다라는걸 보여준것
//		패키지는 소문자로 만들어라
//		string 문자열 참조형 기본타입 빼고는 거의다 참조 타입이다.
	}

}
