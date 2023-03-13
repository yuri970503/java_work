package etc.collection.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		
		
		/*
		 Set 
		 집합을 구현해 놓은 인터페이스
		 
		 요소로 같은 값이 들어오는 것을 허용하지 않는다.
		 
		 Hash 
		 어떤값을 넣었을 때 예측하지 못할 값이 생성되어야하는 알고리즘
		 
		 예측할 수 없는 값을 이요하기 때문에 정렬이 불가능.
		 
		 생성된 값으로 원해 값을 찾는 것도 불가능에 가깝다.
		 
		 다시 원해 값으로 돌아갈 수 없는 단방향성 알고리즘
		 
		 속도가 빠르고 보안성이 뛰어난 알고리즘. 객체의 주소값을 할당하거나
		 암호화 알고리즘에서 많이 사용됩니다.
		 */
		
		//리스트는 책을 책꼿이에다가 차레대로 넣어놓은것 중복값 허용함 그래서 따로 코드 써야함
		//set은 정리된 책들을 포대자루에다가 넣는것 중복 값 막아줄 수 있다

		
		Set<String> set = new HashSet<>();
		
		//객체를 저장: add(객체)
		set.add("JAVA");
		set.add("JSP");
		set.add("spring");
		set.add("Oracle");
		Collections.addAll(set, "MYSPL","JAVA");
		
		System.out.println(set);
		
		//중복된 값 출력 안됨  인덱스가 없어서 구별이 안되서 순서도 지가 알아서 놓음 
		//메서드가 적다  대용량을 담아놓기에는 좋다 속도가 빨라서 단순히 담아 놓기엔 좋음
		
		
		//set의 크기 확인하기 : size()
		System.out.println("크기 : " + set.size());//중복제거 때문에 6이 아니라 5임
		
		
		/*
		  set은 인덱스가 없기 때문에 메서드를 이용해서 얻는게 아니라
		  반복자 (Iterator)를 통해서 요소를 하나씩 꺼내 보셔야 합니다.
		  
		  반복자 객체는 set 인터페이스가 제공하는 inerator () 를 호출하여 
		  얻어옵니다.
		 */
		
		
		Iterator<String> iter = set.iterator(); //객체 생성
		
		/*
		 Iterator 객체의 메서드 next()를 통해
		 내부요소를 하나씩 꺼내올 수 있습니다.
		 next()를 요소의 개수보다 많이 호출하게 되면
		 NoSuchElement 예외가 발생합니다.
		 
		 hasNext() ->반복자가 가지고 있는 객체를 더 가지고 올 수 있는지의 
		 여부를 확인하는 메서드를 통해 next()를 호출하셔야 합니다.
//		 */
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
		
		//반복문 
		while(iter.hasNext()) // 더이상 꺼낼 것이 없다 하면 멈춤 이렇게 하면 if문 쓸 필요없음 여기다가 써줌
		{       //fales가오면 멈춤 
			System.out.println(iter.next());
		}
		
		
		System.out.println("---------------------------------------");
		
		
		for(String s :set)  
			//향상 for문 반복자 객체를 얻어서 hasNext()를 발생시켜서 반복하다가 더이상 없으면 반복문 멈춤 
			//위에 일을 향상for문이 대신 해줌 얘가 하는일을 보여준거임  
			//set은 향상for문 이용하면 간단함 
			//리스트는 인덱스있음 얘는 없음 
			//그래서 순서도 없다 램덤임 계속 강조중
		{
			System.out.println(s);
		}
					
		
		
//		set에서 객체를 삭제: remove(객체)
		set.remove("JSP");
		System.out.println(set);
		
		set.clear();
		System.out.println(set);
		
		
		
		
		
		
		
		
		
		
	}

}












