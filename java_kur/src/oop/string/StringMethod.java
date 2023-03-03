package oop.string;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		
		String str = "Hello java";//문자의길이는 10 공백도 포함 단일문자여서 그렇다.
		String str3 = "Hello java";
		System.out.println(str ==str3);
		//둘이 주소값이 같아서 true가 나온다.
		//문자열이 같아서 나오는게 아니다. 주소를 비교해서 나온거다
		
		

		//charAt(index): 문자열 인덱스에 따른 단일 문자 반환.
		char c = str.charAt(4);// 단일문자로 준다.
		System.out.println("4번 인덱스: " +c);
		
		//substring(begin, end)
		//: 문자열을 범위 지정하여 추출 복사본을 잘라서 얻을 수 있다.
		String ss1 = str.substring(1,5);// 1번 이상 5반 미만
		System.out.println("ss1: " + ss1);
		
		String ss2 = str.substring(6 ); //6번부터 끝까지
		System.out.println("ss2: " + ss2);
		
		//length(): 문자열의 총 길이 반환
		int len = str.length();
		System.out.println("len: " +len);
		
		//indexOf (str): 해당 문자가 있는 인덱스를 반환
		//해당 문자가 존재하지 않으면 -1을 리턴 
		int idx1 = str.indexOf("1");
		System.out.println("idx1: " +idx1);//앞에서부터 탐색  복수가 있으면 먼저 써있는 값부터 준다
		
		int idx2 = str.lastIndexOf("l");
		System.out.println("idx2: "+ idx2);//뒤에서부터 탐색 검색할때 사용 
			
		//여러 문자를 전달하면 시작 인덱스를 알려줍니다.
		int idx3 = str.indexOf("java");
		System.out.println("idx3: " + idx3);
		
		
		//일괄 대/소문자 변경
		String str2 = "HeLLo WoRLd";
		String lower = str2.toLowerCase();//일괄 소문자 변경
		System.out.println("lower: "+lower);
		String upper = str2.toUpperCase();//일광 대문자 변경
		
		//trim(): 문자열의 앞 뒤 공백을 제거
		String name = "                   홍길동                 ";
		System.out.println(name.trim() + "님 안녕하세요 ~!");//앞뒤로 쓸대없는 공백 제거 
		
		//replace(old, new)
		//: 기존 문자열 내부의 old값을 모두 찾아서 new문자열로 일괄 변경
		String java = "자바는 재밌습니다. 자바 커피는 맛있습니다.";
		System.out.println(java.replace("자바", "Java"));
		System.out.println(java.replace("습니", ""));//빈문자열 공백 아님 그럼 문자가 없어진다 습니가 없어진다.
		
		//split: 문자열을 구분자로 구분하여 분할
		//분할된 문자들은 String 배열에 담아서 리턴.
		String phone = "010-1234-5678";
		String[] numbers = phone.split("-");// - 기준으로 분할
		System.out.println(Arrays.toString(numbers));
		
		String pet = "멍멍이, 야옹이, 짹짹이";
		String[] pets = pet.split(",");
		System.out.println(Arrays.toString(pets));
		
		
		
		
		System.out.println("--------------------------------------------------------");
		
		//문자열의 정수 / 실수 변환
		String s1 = "100";
		String s2= "3.14";
		
		int i = Integer.parseInt(s1);//문자열 - 정수
		double d = Double.parseDouble(s2);//문자열 - 실수
		System.out.println(i + d);
		//문자열을 정수와 ㅅ실수로 바꾸어주는것
		
		//va;ieOf: 기본 타입을 문자열로 변경
		System.out.println(3+4);
		System.out.println(String.valueOf(3)+ String.valueOf(4));
		
		
		
  }

}


















