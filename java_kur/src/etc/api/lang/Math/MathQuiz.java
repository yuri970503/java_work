package etc.api.lang.Math;

public class MathQuiz {

	static int page(int num)
	{ return (int) Math.ceil(num/10.0);
		
	}
	
	
	public static void main(String[] args) {
		
		
	/*
	 1 10이 전달되면 1이 반환
	 11 20 전달되면 2가 반환
	 21 30 전달되면 3이 반환
	 이러한 로직을 수행하는 static 메서드 page를 선언 	
	 */
		
		System.out.println(page(68)); // 예시) 블로그 게시판같은 페이지 
		
		
		
	}

}
