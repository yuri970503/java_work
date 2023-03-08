package oop.poly.player;

/*
 자식 크래스, 하위 클래스 (Child, Sub class)
 
 부모 클래스로부터 멤버변수 (필드)와 메서드를 물려받는 클래스를
 자식클래스라고 합니다.
 
 상속을 적용시키려면 자식 클래스 선언부의 클래스 이름 뒤에
 키워드 extends를 쓰고, 물려받을 보모 클래스의 이름을적 으시면 됩니다.
 */


public class Warrior extends Player {
             private static String name;
	// 자식에게 물려주다  부모가     
	int rage; // 부모가 물려주는것 외에 다른건 자식이 추가 
	
	
	/*
	  메서드 오버라이딩(재정의)
	  부모가 물려주는 메서드는 모든 자식등레게 다 맞게 설계되기 힘들기 때문에 
	  부족한 점이 있거나 아예 맞지 않는 경우에는 자식 클래스 쪽애서 
	  내용을 추가하거나 수정할 수 있습니다. 이를 오버라이딩 이라고 합니다.
	  
	  만약 자식 클래스애서 부모가 물려준 메서드를 새롭게 재 정의 한다면
	  자식이 수정한 메서드가 우선적으로 호출됩니다.
	  
	  오버라이딩의 규칙이 있습니다. (3가지 모두 일치해야 오버라이딩 인정)
	  1 부모가 물려주는 메서드와 이름이 똑같을 것
	  2 부모가 물려주는 메서드와 리턴 타입이 똑같을 것
	  3 부모가 물려주는 메서드와 매개변수의 선언 방식이 똑같을 것
	  
	  
	  틀을 바꾸지 말아라 내부만 바꾸는 것 = 오버라이딩
	  
	  
	 
	 */
	
	
	Warrior(String name)
	{
		//모든 생성자에는 super()가 내장되어 있습니다.
		//자식 객채가 생성 될 때는 부모의 생성이 되어야
		//부모의 속성과 기능이 실존하게 되고 물려 줄 수가 있기 때문입니다.
		super(name);
		
		
		
		
		this.rage = 60;
	}
	/*
	  전사의 고유 기능인 rush 메서드를 작성합니다
	  
	   rush의 대상은 모든 직업들 입니다.
	   
	   만약  rush의 대상이 전사라면 10의 피해를 받고 
	   마법사라면 20의 피해를 받고 사냥꾼이라면 15의 피해를 받습니다.
	   
	   서로 다른 데미지를 instanceof를 사용하여 구부해서 적용해 주세요
	   
	   남은 체력도 출력해 주세요
	   
	   main에서 객체를 생성한 후 호출하셔서 잘 적용됐는지 확인해 주세요
	 */
	
	  
	
	
	
	
	
	
	public void rush(Player p )
	{
		System.out.printf("%s님이 %s님에게 돌진을 시전했습니다!\n"
				, Warrior.name, p.name);
		
		if(p instanceof Warrior) {
			p.hp -= 10;
			System.out.printf("%s(전사)님이 10의 피해를 입었습니다.\n"
					, p.name);
		} else if(p instanceof Mage) {
			p.hp -= 20;
			System.out.printf("%s(마법사)님이 20의 피해를 입었습니다.\n"
					, p.name);
		} else if(p instanceof Hunter) {
			p.hp -= 15;
			System.out.printf("%s(사냥꾼)님이 15의 피해를 입었습니다.\n"
					, p.name);
		}
		
		System.out.printf("%s님의 남은 체력: %d\n", p.name, p.hp);
		System.out.println("--------------------------------");
		
	}
	
	
	
	
     
	
	
	//리턴타입 동일 메서드이름 동일
	void characterInfo()// 매개변수 동일
	{ //부모클래스 주소값을 띄게 해줌 -super "밑에 한줄만 추가하겠다"
		super.characterInfo();
		System.out.println("# 분노 " + rage);
	}
	
	// 메서드 오버라이딩 자동완성기능!!
	//Alt + Shift + s 
}
