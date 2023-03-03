package oop.constructor;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone basic = new Phone();//생성자 호출문
		basic.showSpec();
		
		System.out.println("---------------------------------");
		
		Phone basic2 = new Phone(); 
		basic2.showSpec();
		
		
		Phone galazy23 = new Phone ("갤럭시 23");
		galazy23.showSpec();
		
		Phone iPhone14 = new Phone("아이폰 14", "스페이스 그레이");
		iPhone14.showSpec();
		
	}

}



















