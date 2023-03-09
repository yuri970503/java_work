package oop.inter.good;

public class Join implements IUserService {

	
	//아까 bad에서는 메서드 이름도 작접 지었다
	//ㅇㅣ젠 오버라이딩으로 해야한다
//	인터페이스에서 메서드의 이름을 정해준데로 모두 이름이 같다.
	//인터페이스 틀에 4개를 묶어 놓앗다.
	
	@Override
	public void execute() {
		 System.out.println("회원가입 로직 실행");
		 System.out.println("  입력값 가져오고 깂을 집어놓고");

	}

}
