package etc.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapQuiz {

	public static void main(String[] args) {
		

		 /*
        1. engKor이라는 이름으로 Map을 생성해 주세요.
         이 Map은 key로 영단어, value로 한글 뜻을 삽입할 겁니다.
         
        2. 사용자에게 영단어를 입력받아서, 이미 Map에 존재하는 단어라면
         다시 입력받으세요. (이미 존재한다는 메세지 출력)
         영단어 입력창에 '그만' 이라고 입력하면 입력을 종료해 주세요.
         
        3. 영단어 입력 후에는 한글 뜻을 입력받아서 Map에 삽입해 주세요.
        
        4. 입력이 종료되면, 반복문을 이용해서 
        영단어 : 뜻
        영단어 : 뜻
        영단어 : 뜻.... 형태로 입력받은 영단어와 뜻을 모두 출력해 주세요.
        */
       
		
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, String> engKor = new HashMap<>();
		
		
		while(true)
		{
		System.out.println("* 영단어 입력 *");
		String en = sc.next();
		if ( en.equals("그만") )  //앞에 먼저 이것을 써준다 종료해야하기때문에 
		  {
			     System.out.println("입력을 종료합니다.");
			     break;
		  }
		else if (engKor.containsKey(en))    //그만이 아님 영단어 들어옴
	 	  {
			System.out.println("이미 저장된 영단어 입니다.");
			
			continue; // 이건 무효야
		  }
			
		else//(굳이 else는 인써도 됨) 
			
			
			//중복 거른다음 이제 받아도 되겠군 한글뜻을!!
		{
			System.out.println("영단어 뜻을 입력해 주세요");
			String enn = sc.next();
			engKor.put(en,enn);
			
		}
			
		}
		System.out.println("영단어 등록 완료");
		System.out.println(engKor);
		
		System.out.println("\n오늘 등록한 단어");
		Set<String> eng = engKor.keySet();
		for(String e : eng)
		{	System.out.println(e + " : " + engKor.get(e));
	
	     }	
		
		sc.close();
		
		
		
		
	}
		
		
		
}		
		
		
		
		
		
		
		
		
		
		
		

	













