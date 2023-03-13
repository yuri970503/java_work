package etc.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
	
		
		/*
		 Map
		 Key / Value 가 한 세트를 이루는 자료구조
		 Key값을 통해 Value를 참조하는 방식
		 Key는 중복 저장을 허용하지 않는다.
		 */
		
		//Map은 Key와  Value 쌍을 이루기 때문에 멀티 제너릭을 설정
		Map<String, String> map = new HashMap<>();   //두개가 한쌍 타입을 다르게 할 수 있다
		
		
		
		
		//Map에 데이터를 추가하는 메서드 :put(Key / Value)
		map.put("멍멍이", "홍길동"); //한쌍으로 수를 센다 그래서 6개 가아니라 3개이다
		map.put("야옹이", "김철수");
		map.put("짹짹이", "박영호");
		System.out.println(map);
		
		
		
		
		
		//map은 key의 중복 저장을 혀용하지 않습니다.
//		만약 중복 key를 사용하여 put을 호출하면 Value만 수정됩니다.
		map.put("멍멍이", "김뽀삐");
		map.put("어흥이", "홍길동");    //key는 중복이 안된다.
		
		
		
		
		
		//Map 내부에 key의 존재 유무를 확인하는 메서드 : Containskey(key)
		System.out.println(map.containsKey("어흥이"));
		System.out.println(map.containsKey("메롱이"));
		
		
		
		
		
		
		//map 내부의 값을 참조하는 법 get(key)
		String name = "멍멍이"; //키가 없으면(없는키를 주면 )  
		                      //null이 온다. null은 피해야한다.
		 if(map.containsKey(name))
		 {
			 System.out.printf("%s의 별명을 가진 학생은 %s 입니다.\n ",name, map.get(name));
			 //(있는지 없는지 확인을 해야함) 
		 }
		 else 
		 {
			 System.out.println("그런 별명을 가진 학생은 없어요");
		 }
		
		 
		
		 
		 
		 
		
		//map의 크기를 확인하는 메서드 size()
		 System.out.println("맵 크기 " + map.size());
		 
		 
		 
		 
		 
		 
		//Map에서 key들만 추출하는 메서드 keyset()
		 //모든 key들을 set에 담아서 변환합니다.
		Set<String> keys = map.keySet(); //키만 받아서 반복문 돌리기
		for (String k : keys)
		{
			System.out.println(k + ":"+ map.get(k));
		}
		

		
		
		
		
		//Map의 객체를 삭제: remove(key)
		//key를 주시면  Value도 함께 제거됩니다.
		map.remove("야옹이");
		System.out.println(map);
		
		map.clear();
		System.out.println(map);
		
		
		
		//연관된 2가지 함께 저장할때 사용 사용할때가 있을거임 그때 한번 더 보길
		
		
	}

}











