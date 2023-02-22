package basic.begin;

public class Identifier {

	public static void main(String[] args) {
		
		//꼭 지켜야 할 규칙 (안 지킬 시 에러가 발생할 수 있습니다.)
		// 1. 식별자의 이름은 중복을 허용하지 않습니다. (클래스나 함수도 같음)
		//그리고 대/소문자를 철저하게 구분합니다.
		
		int age = 35;
//		int age = 40; (x)
		int Age = 40;
		System.out.println(age);
		System.out.println(Age);
		
		//2. 식별자 이름은 숫자로 지정하거나 숫자로 시작하시면 안됩니다.
//		int 700 = 365; (x)
//		int 7number = 7;(x)	
		int number7111 = 7; // 뒤에 가운데에 숫자를 넣는건 가능
		int num7ber = 7;
		
		//3. 식별자 이름에 공백을 포함할 수 없습니다.
//		int my birth day = 19932013;
		int mybirthday = 19932013;
		int myBirthDay = 19932013; // 연결첫글자를 대문자로 바꾸어 준다 (camel case)
		
		//4. 식별자 이름에 쓸 수 있는 특수문자는 밑줄(_), 달러기호(&)
		//뿐입니다. 하지만 사용을 권장하지는 않습니다.
		//저 특수문자들은 사용하기로 약속한 곳이 지정되어 있습니다.
		
		 String $hello = "안녕"; //가능은 함 가능하면 쓰지말아라
		 System.out.println($hello);
		
		
		//5. 키워드 (예약어)는 식별자 이름으로 사용이 불가능합니다.
		//키워드는 이미 어떠한 기능을 내포하고 있는 지정 문자입니다.
		
//		String class = "클래스";(x)
	    String Class = "클래스"; // (권장하지 않습니다.)
	    String className = "클래스"; // 뒤에다가 단어를 붙여라
	    
	    //6. 한글이나 한자 같은 식별자 이름도 지정이 가능합니다.
	    //하지만 사용을 권장하지는 않습니다.
	    int  숫자 = 10;
	    System.out.println(숫자); //가독성 x 영어와 숫자로 구성된 식별자를 사용권장함
	    
	    
	    //기본 자료형
	    
	    //정수
	    //byte          short       *int  long 
	    // 1(사용됨)     2(거의않씀)  (대표)4   8
	    
	    //실수
	    // float 7  *double 15  정밀한 값을 위해
	    //   4         8
	    
	    //논리 (참과 거짓)
	    //boolean 1bit  (true false)
	    
	    //문자
	    //char 2  유나코드 문자 (단일문자)
	   
	    
	    //String-> 기본타입은 아님 그치만 기본타입처럼 자주 쓰임 
	    
	    
	    
	    
	}

}
