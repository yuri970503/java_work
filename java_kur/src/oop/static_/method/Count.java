package oop.static_.method;

public class Count {

	public int a; // 인스턴스 변수
	public static int b;//정적변수 객체가 필요 없다.
	
/*
   	인스턴스 메서드 : 객체를 생성하여 주소값을 통해 접근한 후 호출하는 메서드
   	인스턴스 메서드 안에서는 정적 변수와
   	인스턴스 변수 모두를 참조할 수 있습니다.
 */
	public int method1()
	{
		return this.a + Count.b;
	}        //자기자신객체
	
	
	
	/*
	  static 블록 (메서드 정적 초기화자) 내부에서는
	  static이 붙은 변수나 메서드만 사용할 수 있습니다.
	  This는 사용할 수 없습니다. - 나타낼 주소값이 없기 때문 - 객체 생성이 없이도 호출되기 때문
	  
	  static 블록 내부에서 non-static멤버를 사용하려면
	  Static 객체를 생성해서 주소값을 통해 참조해야 합니다.
	 */
	
	
	
	
	public static int method2() //객체랑 무관하다 하나도 생성하지 않아도 선언된 클래스의 이름으로 호출할 수 있다.
	{  Count ccc = new Count ();
		return ccc.a + Count.b;
	}     //객체가 없어서  this를 못쓴다.  메서드안에 다른 객체생성을 해야한다
	     // 객체랑은 연관이 없다 전체 영역에서 쓸 수 있다.
}



        //모든 객체가 다 공유해도 괜칞은가를 자신이 생각해서 판단해야한다.