package oop.inter.good;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner (System.in);
		
		//다형성 적용을 위해 인터페이스 타입의 변수를 하나 선언.
		IUserService sv;
		
		System.out.println("진행하실 번호를 입력하세요");
		System.out.println("1 가입 2 로그인 3 수정 4 삭제");
		System.out.println("> ");
		int menu = sc.nextInt();
		
		if(menu == 1) {
			sv = new Join(); 
			sv.execute();//인터페이스 메서드  인터패이스 변수 만 있으면
		} else if(menu == 2) {
		 sv= new Login();
		 sv.execute();
		} else if(menu == 3) {
			sv = new Update();
			sv.execute();
		}else if (menu == 4)
		{
			sv = new Delete();
			sv.execute();
		}
		
		sc.close();
		

		
		//변수이름 걱정할 필요 없음 인터페이스의 메서드는 하나로 묶여있기 때문 
		//그래서 변수하나만 생성해서 객체 생성해서 메서드 이름 하나로 다 가능
		//인터페이스 만들고 각자 클레스 작성 모여서 메인작성 4개 합치기 동일한 이름
		// 동일한 이름으로 묶어놓음  아무렇게나 작성함 횡설수설함 어떻게 되겠지
	}

}
