package oop.final_field;

public class MainClass {

	public static void main(String[] args) {
		
		Person kim = new Person("김철수");//객체 생성
    
		
		
		
//		kim.nation = "미국";
				//할당을 막아버린다.
//		kim.name = "김마이클"; //객체 생성하자마자 정해진 것
		kim.age = 30;
		
		Person park = new Person ("박영희"); //객체 생성
//		park.nation = "영국";
//		park.name = "박영국";
		
		
		
	}

}
