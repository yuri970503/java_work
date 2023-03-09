package etc.exception.basic;

public class FinallyExample {

	public static void main(String[] args) {
		String[] pets = {"강아지","고양이","짹짹이"};
		
		for (int i = 0; i<4; i++)//인덱스 길이가 다르게 했다
		{try {
			System.out.println(pets[i] + "키우고 싶다");
		} catch (Exception e) {
			System.out.println("애완동물의 정보가없습니다.");
		}finally {
		//부과적인 예외가 발생하든말든 실행하고 싶은 문장 을 작성한다
		//객체를 반납하거나 메모리에서 해재할 때 누로 사용  써도 되고 안해도 된다..  
			System.out.println("아무튼 실행되는 문장");
			System.out.println("-------------------------------------------------------");
		}
			
		}
	}
//예외를 떠 넘기는 문법?
}
