package oop.inter.good;

public class Login implements IUserService {

	@Override
	public void execute() {
		System.out.println("사용자의 아이디 비밀번호");
	}

}
