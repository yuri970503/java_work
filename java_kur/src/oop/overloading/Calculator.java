package oop.overloading;

public class Calculator {

	
	/*
	 오버오딩 (중복): 하나의 클래스 내부애서 같은 이름을 가진 메서드나 생성자를 여러개 중복해서 선언할 수 있게 해주는 문법
	 
	 오버로딩 적용 조건:
	 1 매개 변수의 데이터 타입이 다를것
	 2 매개변수의 전달 순서가 다를 것
	 3 매개 변수의 개수가 다를 것
	  
	  셋 중 하나만 만족을 해도 인정이 된다
	  
	  
	 */

	
	
	void inputData() {}
	
	void inputData(int a) {}
	
	void inputData(int a, int b) {}

//	void inputData(int b, int a){}// 순서 바꿔도 타입이 같으면 안된다
	
	void inputData(String s) {}
	
	void inputData(int a, double d) {}
	
	void inputData(double a, int d) {} //타입이 달라서 가능

//	void inputData(int number) {}//타입도 같고 정수 매개값 1개를 받는 매서드가 이미 있다 (x)
	
//	int inputData(int number) 
//	{
//		return 0;
//	}//호출할때는 리턴타입으로 호출하지 않는다. 반환유형 리턴타입은 오버로딩에 영향을 미치지 못합니다.
	
	
	void calcRectArea() 
	{ 
		
	}
	
	void calcRectArea(int a) 
	{ 
		System.out.println("정사각형의 넓이 " + a*a);
	}
	
	void calcRectArea(int a, int b) 
	{ 
		System.out.println("직사각형의 넓이 " + a*b);
	}
	
	void calcRectArea(int a , int b, int c) 
	{ 
		System.out.println("사다리꼴의 넒이 " +(a+b) * c /2);
	}
	
	
	
}
