package oop.poly.car;

public class MainClass {

	public static void main(String[] args) {
	
		//객체 생성 10개
		Sonata s1 = new Sonata();
		Sonata s2 = new Sonata();
		Sonata s3 = new Sonata();

		Porsche p1 = new Porsche();
		Porsche p2 = new Porsche();
		Porsche p3 = new Porsche();
		
		Tesla t1 = new Tesla();
		Tesla t2 = new Tesla();
		Tesla t3 = new Tesla();
		Tesla t4 = new Tesla();
		
		
		
      // 같은 타입만 들어올 수 있다 Sonata 타입만 들어올 수 있음
//		Sonata[] sonatas = {s1,s2,s3};
//		for(Sonata s : sonatas)
//		{
//			s.run();
//		}
//		
//		
//	    Tesla[] taslas = {t1,t2,t3,t4};
//	    for (Tesla t : taslas)
//	    {
//	    	t.run();
//	    }
	//Car타입의 배열 선언 Car를 상속 받는 자식들도 들어올 수 있다.
	//다형성이 발현이 되니까 타입이 다른 자식들도 들어올 수 있다.

		
		
		//다형성을 적용해서 이종모음 배열을 선언할 수 있다.
		Car[] cars = {s1,s2,s3,p1,p2,p3,t1,t2,t3,t4}; //이종모음 배열? 상속관계가 깔려 있어야 한다.
		 for(Car c:cars) 
		 {
			 c.run();
		 }
		 
		System.out.println("---------------------------------------------------");
		
		System.out.println("*** 타이어 교체 작업 ***");
        t1.frontLeft = new HTire();
        t1.frontRight= new HTire();
        t1.rearLeft = new HTire();
        t1.rearRight = new HTire();
		
		System.out.println("-------------------------------------");
		Driver kim = new Driver();
		kim.drive(p1);
		kim.drive(s2);
		kim.drive(t3);
		
		System.out.println("--------------------------------------------------");
		Car c = kim.buyCar("테슬라");
		//형변환 부모타입의 객체를 자식타입에 넣는다 밑에랑 반대상황 
	// Car c = new Tesla
	//문제가없음 자동 형변환
	c.run();
	Tesla t5 = (Tesla) c;
	t5.enterMembership();
		
		
		CarShop shop = new CarShop();
		shop.carPrice(s1); //메서드
		shop.carPrice(new Tesla());
		shop.carPrice(kim.buyCar("포르쉐"));
		shop.carPrice(s3);
		
		
		
	}
	
	//매게변수의 다형성....
	
	
	


}











