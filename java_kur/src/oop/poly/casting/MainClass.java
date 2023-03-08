package oop.poly.casting;

public class MainClass {

	public static void main(String[] args) {
		
		
	Parent p = new Parent();//자식이 n2를 가지고 있는지 모른다
	p.n1 = 1;               //메서드도 같음
//	p.n2 = 2;
		
		p.method1();
		p.method2();
//		p.method3();
		
		System.out.println("---------------------------");
		
		Child c = new Child();
		c.n1 = 1; // 부모에게 물려받은 속성
		c.n2 =2; //자식의 고유속성
		
		
		c.method1();
		c.method2();
		c.method3();
		
		System.out.println("_--------------------------------");
		
		//다형성 적용(promotion) 부모의 시선으로 보니까 자식이무엇을 가지고 있는지 못본다 
		//자식의 고유의 특성들을 사용을 못한다 이게 다형성의 단점
		Parent p2 = new Child();
		p2.n1 = 1;
//		p2.n2 = 2;
		
		p2.method1();
		p2.method2();
//		p2.method3();
		
		
		
		/*
		 다형성이 전용되면 자식 클래스의
		 본래의 멤버(필드 메서드를)를 참조하지 못하는 무네가 발생합니다.
		 
		 이를 해결하기 위해 강제 타입 변환을 사용합니다.
		 */
		
		
		//부모가 상위 자식으 ㄴ하위 강제로 끌어내려야함
//		p2의 주소를 c2로 넘김 이제 자신의 시선으로 볼 수 있음 
		Child c2 = (Child) p2; // 주소는 같음 접근방식을 늘린것 부모 타입을 자식 타입으로 강제 변환(Downcasting)
        c2.n2 =2;
        c.method3();
        //자식타입으로 넘겨서 보니 이제 보인다 시선이 달라짐

        System.out.println("p2 주소값" + p2);
        System.out.println("c2 주소값" +c2);
        
        Object o = new Parent();
//        o.n1 = 1;
//        o.method1();
        
        // 다형성을 굳이 남발할 필요가 없다.
        
        //다형성이 한 번도 발생하지 않은 경우에는
        //강제 형 변환을 사용할 수 없습니다.
        
        Parent ppp = new Parent();
//        Child c3 = (Child) ppp; 자식타입의 부모객체는 없다
        //문법상 문제는없지만 에러가 나타난다.
        
	}

}







