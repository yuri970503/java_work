package oop.abs.pet;

public class Dog extends Pet {

	
	public Dog(String name, String kind , int age) {
		super(name, kind , age);
	}//자식쪽에서 부모객체의 생성자를 못가져오고 있어서 빨간줄이 그어졌다.
	
	
	
	@Override
	public void feed() {
		// TODO Auto-generated method stub
System.out.println("강아지는 사요를 와구와구 먹어요");
	}

	@Override
	public void takeNap() {
		// TODO Auto-generated method stub
System.out.println("강아지는 마당에서 낮잠을 자요");
	}

}
