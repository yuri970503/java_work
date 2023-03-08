package oop.abs.good;

public abstract class  HeadStore {

	/*
	  추상 클래스 추상 메서드
	  
	  1추상클래스의 메서드에 abstract를 붙이면 해당 메서드는
	  실체가 없는 추상 메서드가 되며 이 메서드는 상속을 통해 자식 클래스에서
	  무조건 오버라이딩을 하도록 강요됩니다.
	  
	  2 추상메서드는 실체가 존재하지 않는 틀 역할을 하기 때문에
	  메서드의 바디 ({})부분이 없고 세미콜론으로 메서드 선언을 마감합니다.
	  
	  3 일반 클래스에서는 추상 메서드를 선언할 수 없습니다. 추상메서드가 하나라도 존재하는
	  경우에는 반드시 해당 클래스를 추상 클래스로 선언해야합니다
	  
	  4 추상 클래스에 추상 메서드만을 선언할 필요는 없습니다.
	  일반 멤버변수 및 메서드도 얼마든지 선언이 가능합니다.
	 */
	
//	public int i;
	
	public HeadStore() {
		System.out.println("HeadStore의 생성자!!");
	}
	
//	public void orderGrap()
//	{
//		System.out.println("포도쥬스의 가격은 4000원 입니다.");
//	}
//	
	//추상메서드가 존제 하면 추상 클래스에다가 작성해야 한다. 바디가 없고 틀만 껍대기만 존재한다.
	//일반메서드 작성도 가능하다 일반 변수도 가능하다 
	
	public abstract void orderApple();
	public abstract void orderBanana();//만들어지다가 만것이다.,
	public abstract void orderGrape();
	
	
}
