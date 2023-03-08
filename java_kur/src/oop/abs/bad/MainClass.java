package oop.abs.bad;

public class MainClass {

	public static void main(String[] args) {
		
		
		HeadStore store = new SeoulStore();
		
		store.orderApple();
		store.orderBanana();
		store.orderGrape();
		
		//추상화 오버라이딩 무조건 해라
		

	}

}
