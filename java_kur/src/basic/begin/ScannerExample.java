package basic.begin;

import java.util.Scanner;

//1. Scanner api 로딩 (재공되는 Scanner 정보를 현재 클래스로 가져오자)
 
public class ScannerExample {

	public static void main(String[] args) {
		
		
		//2. 스캐너 객체를 생성.
		//스케너를 만드는 문법
        Scanner sc = new Scanner(System.in);		

        /* Scanner의 함수들
         3. Scanner의 함수들을 이용하여 데이터를 입력받을 수 있습니다.
         - next(): 공백이 없는 문자열을 입력받습니다. 
         -nextLine():공백을 포함한 문자를 입력받습니다.
         -next + 기본타입이름():해당 타입에 맞는 데이터를 입력받습니다.
         ex)
          nexInt():정수 대이터를 입력받습니다.
          nexDouble(): 실수 데이터를 입력 받습니다.
         */
        
        
        System.out.print("이름을 입력하세요: ");
        String name = sc.next(); 
        System.out.print(name);
        
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();
        
        System.out.print("제 이름은 " +name + "이고, 나이는 "+age + " 세 입니다\n");
        System.out.printf("제 이름은 %s이고, 나이는 %d세 입니다", name, age);
        
        //4. Scanner  객체를 반납
        //객체를 반납 -> Scanner를 메모리에서 해제.
        sc.close(); // 더이상 사용하지 않을때 마지막에 쓰기
        
        
        
	}

}
