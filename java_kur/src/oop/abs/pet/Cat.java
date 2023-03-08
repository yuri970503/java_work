package oop.abs.pet;

public class Cat extends Pet {

	
	public Cat(String name, String kind , int age) {
		super(name, kind , age);
	}//자식쪽에서 부모객체의 생성자를 못가져오고 있어서 빨간줄이 그어졌다.
	
	
	@Override
	public void feed() {
		System.out.println("고양이는 생선을 냠냠 먹어요");
	}

	@Override
	public void takeNap() {
		System.out.println("고양이는 켓타워에서 자요");

	}

}
