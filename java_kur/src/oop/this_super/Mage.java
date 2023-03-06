package oop.this_super;

public class Mage extends Player {
	
	int mana;
	
	
	Mage(String name)
	{
		super(name);//부모를 불러주는것
		this.mana = 100;//부모가 해줄 수 없는 영역
	}
	

	@Override
	void characterInfo() {
		
		super.characterInfo();
		System.out.println("# 정신력 "+ mana);
	}
	
	

}
