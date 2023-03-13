package etc.collection.list;

import java.util.ArrayList; //입력해줘야함 스케너랑 비슷

import java.util.Collections;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		/*
		 ArrayList
		 배열과 다르게 크기가 자동으로 조절되는 자료구조 클래스.  얘는객체임  메서드로 기능사용
		 
		 배열과 유사한 현태이기 때문에 순차적으로 데이터에 접근하기가 좋다.
		 
		 인덱스를 활용하며 객제의 중복 저장을 허용한다.
		 */
		
		
		List<String> nick = new ArrayList<>();//인터페이스 타입의 변수의 객체 생성 일반적임 import java.util.List;
		        //제내릭 타입을 지정 필수는 아님 그치만 안하면 obj타입으로 저장 그럼 꺼내쓸때 형변환 해줘야될 수도 있음
		        //원래는 무슨 타입이든 다 받을 수 있다 그럼 항상 형변환해야함 그래서 이 리스트에 있는 타입지정
		        //무슨 타입의 모음이다 라는 걸 선언 그럼 그 타입 외에 다른 타입은 다 쳐냄 
		
		String str= "야옹이";
		
		//add(객체): 리스트에 객체를 추가하는 메서드
		nick.add("멍멍이");   
		nick.add(str);
		nick.add(new String ("개구리"));
		nick.add("짹짹이");
		nick.add("야옹이");
		System.out.println(nick ); // 중복가능

		
		//add(인덱스, 객체) : 특정 인덱스에 객체를 삽입하는 메서드
		nick.add(3,"어흥이");   //오버로딩임 리스트 인덱스에 추가. 뒤에것은 알아서 뒤로 물러남
		System.out.println(nick);
		
		
		//get(인덱스) :리스트 내부의 객체를 참조하는 메서드
//		String name = nick[3]; (X)
		String name = nick.get(3);
		System.out.println("3번 인덱스의 값 :" +name);
		
		
		//size(): 리스트의 크기를 반환
		System.out.println("nick의 크기: " + nick.size());
		
		//set(인덱스, 수정할 객체): 리스트 내부의 객체를 수정 
		nick.set(2, "삐약이");
		System.out.println(nick);
		
		//remove(인덱스), remove(객체)
		nick.remove(5);
		System.out.println(nick); //알아서 크기가 줄어듬
		nick.remove(str);
		System.out.println(nick);
		
		
		
		
		//리스크 반복문 처리
		for(int i = 0; i<nick.size();i++)
		{
			System.out.println(nick.get(i));
		}
		
		System.out.println("-----------------------------");
		
		//향상 for문 (forEach)
		for (String n : nick)
		{
			System.out.println(n);
		}
		
		
		
		
		//contains(객체): 리스트 내의 객체의 존재 유무를 파악하는 메서드
		System.out.println(nick.contains("메뚜기"));
		
		//clear(); 리스트 내부 요소 전체 삭제
		nick.clear();
		System.out.println(nick);
		
		
		//isEmpty(): 리스트가 비어있는지의 여부 확인
		System.out.println(nick.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 컬랙션 객체들은 Collection의 기능을 사용할 수 있습니다. 
		 Collection는 컬랙션 객제들의 부가 기능들을 지원합니다.
		 
		 */
		
		//리스트 점수저장
		List<Integer> score = new ArrayList<>(); //스케너처럼 입력
        // 객체들의 모음이라서 기본타입은 들어가지 못함
		// 객체타입으로 지정해야함
		score.add(65); //int 타입으로 줘도 된다 객체로 포장되서 알아서 넘어간다.
		
		
		//한번에 객체 많이 추가하기
		Collections.addAll(score, 78,100,88,79,100,21,56,100);
		//스케너처럼선언 
		System.out.println(score);
		
		
		//컬랙션에서 등장 횟수 구하기
		System.out.println("100점 학생 수 :" + Collections.frequency(nick, score));
		
		//최대값 최소값 구하기
		System.out.println("최대값 "+ Collections.max( score));
		System.out.println("최대값 "+ Collections.min( score));
		
//		//오름차 정렬(작은 값부터 순서대로 커지는 정렬)
//		Collections.sort(score);
//		System.out.println(score);
//		
//		//내림차 정렬 (큰 값부터 순서대로 작아지는 정렬)
//		Collections.reverse(score);
//		System.out.println(score);
//		
		Collections.sort(score, Collections.reverseOrder()); //값을 하나 더 주면 한번에 내림차 정렬 가능
		System.out.println(score);
		
		//두 요소의 위치를 교체 : swap(리스트 i j)
		Collections.swap(score, 3, 7);
		System.out.println(score);   //위치 변경
		
		//리스트 내의 요소를 무작위로 섞기
		Collections.shuffle(score);
		System.out.println(score); //내림차정렬로 되어있었는데 무작위로 섞였다
		
		
		//원하는 값으로 컬랙션 초기화
		Collections.fill(score, 100);
		System.out.println(score); //전체 값을 100으로 체움 
		
		
		
	}

}
