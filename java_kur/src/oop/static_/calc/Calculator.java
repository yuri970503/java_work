package oop.static_.calc;

public class Calculator {

	
	/*
	 계산기마다 색깔이 각각 다를 수 있기 때문에 color 같은 변수는
	 데이터를 공유시키지 말고 객체별로 따로 관리해야 합니다.
	 
	 반면에 pi 같은 원주율값은 계산기마다 값이 동일해야 하기 때문에
	 stathic을 붙여서 데이터를 공유하게 하는 것이 유리합니다.,
	 */
	
	 String color; //static 쓰면 않좋다 전부다 빨개질것이다 하나의 색깔로 통일 하려면 그건 괜찮다 다른 색깔을 원한다면 아니다
	 static double pi  = 3.141592; //변동이 없기 때문에 static 써도 됀찮다. 변화하지 않기 때문에
	
	//변화하는건 쓰면 않좋은것 같고 (동일하지 않으면) 
	//변화가 없으면 굳이 안해도 된다. (동일하면)
	
	
	
	/*
	 메서드 내부애서 non-static 데이터를 참조하고 있는 메서드는
	 해당 변수의 정확한 위치 (객체의 주소값)을 알려줘야 하기 때문에
	 정적 메서드로 선언하기가 부적합합니다.
	 */
	public void paint(String color)
	{
		System.out.println("계산기에 "+ "색을 칠합니다");
		this.color = color;
	}
	//객체 생성을 해서 해결하는건 해결방안이 아니다 그냥 안붙이는게 낫다
//	this 가 일단 있다 객체를 각각 관리하겠다는 뜻이 여서 굳이 안붙여도 된다.
	
	
	
	
	/*
	 메서드 내부에서 인스턴스 변수를 사용하지 않고 범용성 있게 사용하는
	 메서드는 static 키워드를 붙여서 정적 메서드로 선언하는 것이
	 좋습니다.
	 */
	public static double areaCircle(int r)
	{return r * r * pi;
	
	}
}
