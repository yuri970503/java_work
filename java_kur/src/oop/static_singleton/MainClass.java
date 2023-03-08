package oop.static_singleton;

public class MainClass {

	public static void main(String[] args) {
	
//		Singleton s1 = new Singleton();
//		s1.method1();
//		s1.method2();
		
//		Singleton s1 = Singleton.s; // static여서 s 를 바로 불러들일 수 있다
//		Singleton.s = null; 숨겨줬기 때문에 이젠 객체에 직접 접근을 못한다 메서드를 불러야 한다.
		
		Singleton s1 =  Singleton.getInstance();
		Singleton s2 =  Singleton.getInstance();
		Singleton s3 =  Singleton.getInstance();
		Singleton s4 =  Singleton.getInstance();
		Singleton s5 =  Singleton.getInstance();
		//주소는 하나이다 변수만 다를 뿐 돌려쓰는것이다.
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		

	}

}
