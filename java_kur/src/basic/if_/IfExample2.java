package basic.if_;

import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		if(age >= 20) {
			System.out.println("성인입니다.");		
		} else if(age >= 17){
			System.out.println("고등학생입니다.");
		} else if (age >= 14) {
			System.out.println("중학생입니다.");
		} else if (age >= 8) {
			System.out.println("초등학생입니다.");		
		} else {
			System.out.println("미취학 아동입니다.");
		} //else if 숫자제한은 없다. 순차적으로해야한다. 조건설정을 잘 해야한다.
		
		sc.close();
				
				
		

	}

}
