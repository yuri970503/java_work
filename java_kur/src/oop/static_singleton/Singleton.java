package oop.static_singleton;

public class Singleton {

	/*
	 싱글톤 디자인 패턴 : 클래스의 객체를 단 1개로 제한하기 위한 코드 디자인 패턴
	  
	 1 외부에서 이 클래스의 객체를 생성하지 못하게 생성자를 단 1개만 
	  선언하고 private 접근제한을 붙임
	 */

	private Singleton() {
		System.out.println("객체가 생성됨");
	}
	
	//2 생성자를 호줄할 수 있는 영역은 같은 클래스 내부 뿐이므로 
	//자신의 클래스 내부에서 스스로의 객체를 단 1개만 생성함
	private static Singleton s = new Singleton(); //안보이니까 보이게끔 객체도 메서드와같이 static을 붙여야 된다 
 // static을 쓰되 이 객체는 숨겨주자 객체에 직접 접근할 수 없다     	// 접근할 수 있는 주소를 만든거 객체는 하나다
	
	
	//3. 외부에서 이 클래스의 객체를 요구할 시. 2번에서 미리 만들어 놓은 
	//단하나의 객체의 주소값을 공개된 메서드를 통해 리턴합니다.
	
	public static Singleton getInstance() //메서드는 static을 붙여야 된다 안보이니까 보이게끔...!
	{
		return s; // static 
	}
	//////////////////////////////////////////////////////////////////////
	
	
	public void method1()
	{
		System.out.println("여러군데에서 쓰이는 메서드");
		
	}
          
	
	public void method2() 
	{
		System.out.println("꼭 사용해야 하는 귀한 메서드");
	}
	
	
	
	
	
}
