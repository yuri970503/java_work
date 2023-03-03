package oop.string;

import java.util.Scanner;

public class StringQuiz01 {

	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		/*
		  스케너 id입력받기
		  id에 공백입력하면 
		  공백을 제거 아이디가 5글지 미만이라면 다시 입력받음
		  5글자 이상 입력되었다면 "id가 입력되었습니다" 출력 후
		  종료
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
	
		while(true)
		{
		System.out.print("id를 입력해 주세요:");
			String id = sc.nextLine();
			id = id.trim();
			id= id.replace(" ", "");//공백을 공백없음으로 바꿔주는것이다.
			
			if(id.length()<5)
			{
				System.out.println("아이디는 5글자 이상입니다.");
				
			}
			else
			{
			System.out.println("등록되었습니다.");
			break;
			}
			
		}
		
		
		
		}
	}















