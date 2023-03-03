package oop.constructor;

public class BreadMain {

	public static void main(String[] args) {
		
		
		
		/*
		 객체를 생성하지 않았을 때의 예시를 보고
		 빵 객체를 생성할 수 있는 클래스(설계도)를 작성해 보세요
		 클래스 이름은 Bread로 통일하겠습니다.
		 
		 BreadMain에서 똑같이 피자빵, 초코케이크의 정보를
		  호출해 보세요. (생성자는 여러분들 맘대로~)
		 */
		
		Bread basic = new Bread();
		basic.show();		
		
		System.out.println("---------------------------");
		
		Bread chcoB = new Bread("초코케이크", 1500, "초콜렛");
		chcoB.show();
		
		
		
		
		

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
