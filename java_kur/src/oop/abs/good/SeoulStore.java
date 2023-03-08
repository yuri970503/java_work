package oop.abs.good;

public class SeoulStore extends HeadStore {

	@Override
	public void orderApple() {
		System.out.println("사과쥬스의 가격은 3000원");
		
	}

	@Override
	public void orderGrape() {
		System.out.println("바나나 쥬스의 가격은 3500원");
		
	}

	@Override
	public void orderBanana() {
		System.out.println("포도쥬스 가격 2500원");
	}

}
