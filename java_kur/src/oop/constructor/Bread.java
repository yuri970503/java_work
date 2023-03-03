package oop.constructor;

public class Bread {
String name;
String ingredient;
int price;
	


// 생성자를 생성할때 기본으로 깔아놓고 생성해놓고 하는게 좋다
//내가 만든데로 생성자가 만들어지는게 아니여서...? 
// Bread(){} 내용값도 없는


	Bread()
	{ 
		
		name = "피자빵";
		price = 500;
		ingredient = "밀가루";
	}
	
	
	Bread(String cName, int cPrice, String cIngreient  )
	{
		name = cName;
		price = cPrice;
		ingredient = cIngreient;
	} //새로운 값을 원래의값으로 대입해준다.
	
	
	
	void show()
	{
		System.out.println("맛있는 빵만들기");
		System.out.println("빵이름:" + name);
		System.out.println("가격: " + price );
		System.out.println("주 재료:" + ingredient);
	}
	
}
	
	
	
		
	
























