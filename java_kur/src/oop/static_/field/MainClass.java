package oop.static_.field;

public class MainClass {

	public static void main(String[] args) {
		     //객체변수 
		Count c1 = new Count();
		c1.a += 5;
		c1.b += 5;
		
		System.out.println("인스턴스 변수 c1.a:" + c1.a);
		System.out.println("정적  변수 c1.b:" + c1.b);
		
		
		System.out.println("----------------------------");

		
		Count c2 = new Count();
		
		c2.a+= 7;
		c2.b+= 7;
		
		System.out.println("인스턴스 변수 c1.a:" + c2.a);
		System.out.println("정적  변수 c1.b:" + c2.b); //위에것이랑 더한값이 나온것 같다 
		
		
		Count c3 = new Count();
		
		c3.a += 8;
		c3.b += 8;
		
		System.out.println("인스턴스 변수 c1.a:" + c3.a);
		System.out.println("정적  변수 c1.b:" + c3.b);
		System.out.println("정적  변수 c1.b:" + c1.b);
		System.out.println("정적  변수 c1.b:" + c2.b);
		
		/*
		 static 이 붙은 데이터는 그 static 데이터가 선언된
		 클래스 이름으로 바로 참조할 수 있습니다.
		 
		 일반 멤버변수와 혼동할 가능성이 기 때문에
		 주소값으로 접근하지 않습니ek.
		 
		 */
		
		
		Count.b++;
		Count.b++;
		System.out.println("정적 변수 Count.b: "+ Count.b);
		
		
	}

}
