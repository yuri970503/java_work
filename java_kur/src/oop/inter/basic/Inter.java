package oop.inter.basic;
//인터페이스: 객체의 규격(기능)을 표준화해서 명세하는 역할.
//클래스의 틀 같은 존제



public interface Inter extends ParentInter{

	//클래스랑 개념이 다르다.
	//인터페이스에서 변수를 선언하면 상수(static final)로 지정됩니다.
	int NUM= 5;
	
//	
//	Inter()
//	{
////생성자 가질 수 없다 = 객체를 생성할 수 없음		
//	}
//	인터페시스는 생성자를 가질 수 없습니다.(객체화 될 수 없는개념)
	
	
	//인터페이스에서 메서드를 선언하면 추상메서드로 지정됩니다.
    void method1();
    
    public static void staticMethod() {
		System.out.println("가능합니다~");
	}

	
    
	
}
