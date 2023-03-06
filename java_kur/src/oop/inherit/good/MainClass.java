package oop.inherit.good;

public class MainClass {

	public static void main(String[] args) {
		
		Warrior w1 = new Warrior();
		w1.level = 1;
		w1.atk = 3;
		w1.hp = 50;
		w1.name = "전사1";
		w1.rage = 60;
		w1.characterInfo();
		
		System.out.println("-----------------------------------");
		
		Mage w2 = new Mage();
		w2.level =1;
		w2.atk =3;
		w2.hp = 50;
		w2.name = "마법사1";
		w2.mana = 60;
		w2.characterInfo();
		
		System.out.println("-----------------------------------");
		
		Hunter w3 = new Hunter();
		w3.level = 1;
		w3.atk = 3;
		w3.hp = 50;
		w3.name = "사냥꾼1";
		w3.pet = "멍멍이";
		w3.characterInfo();
		
		
		
	}

}
