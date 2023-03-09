package etc.exception.throws_;

public class ThrowsExample {
	static String[] greetings = {"안녕","헬로","니하오"};
	
	
	/*
	  throws
	  
	  예외처리를 메서드의 호출부로 떠넘기는 방식입니다.
	  
	  throws는 생성자에서도 선언이 가능하며 메서드나 생성자를 호출 시 
	  에외처리를 강요하고 싶을 떄 사용합니다.
	  
	  또한 원하는 영역으로 에외를 모아서 한번에 처리하는 것도 가능합니다...
	 */
	
	
	
	
	static void greet(int idx) throws Exception {
		System.out.println(greetings[idx]);
	}

	
	
	
	
	public static void main(String[] args){//자바가상머신 에게 던짐 프로그램 종료 예외처리 안한다는 뜻 안된다 메인에게 붙으면 안된다

		try {
			
			greet(3); //예외를 메서드의 호출문으로 집어던지는것 예외처리를 하지 않으면 부를 수 없다. 메인에 던짐
		} catch (Exception e) {
			e.printStackTrace();
		// printStackTrace()메서드는 예외 발생 원인을 역추적하여
			//예외가 어디에서 발생했는지 그 이뉴는 무엇인지를 
			//메세지를 통해 개발자에게 전달하므로 자주 사용하는 메서드입니다.
	}
		System.out.println("프로그램 종료"); 
}
           // 프로그램의 시작과 끝은 메인이다 예외를 계속 던지면 결국 메인으로 돌아온다
	       // 메서드마다 예외를 처리하면 많이 해야하니 메인에서 불러서 한곳으로 모아서 처리하겠다 
	//최소한의 예외처리를 하기 위해서 예외가능성을 모아서 최소한의 에외처리 
}









