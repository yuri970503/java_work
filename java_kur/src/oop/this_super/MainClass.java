package oop.this_super;

public class MainClass {

	public static void main(String[] args) {
		
		
		Player p1 = new Player();
		p1.name = "전사1";
		
		p1.characterInfo();

	System.out.println("--------------------------------------------------");
		
		Player p2 = new Player("전사2");
		
		p2.characterInfo();
		//이름값이 맴버면수애 포함되지 않았다.
		//this라는 키워드로 자기자신 객체를 지목하여 변화시킬 수 있다 
		System.out.println("-------------------------------------------");
		
		Player p3 = new Player("전사3",200);
		p3.characterInfo();

		
		System.out.println("-------------------------------------------");
	
	    p3.attack(p2);
	    System.out.println("-----------------------");
	    p1.attack(p2);
	    System.out.println("-----------------------");
	    p2.attack(p1);
	    
	    
	    
	    System.out.println("-----------------------------------------------");
	    
	    Warrior w1 = new Warrior("전사짱짱맨");
	    
	    w1.characterInfo();
	
	    
	    System.out.println("-----------------------");
	    
	    Mage m1 = new Mage("법사짱짱맨");
	    m1.characterInfo();
	    
	    Hunter h1 = new Hunter("냥꾼짱짱맨");
	    h1.characterInfo();
	}

}
