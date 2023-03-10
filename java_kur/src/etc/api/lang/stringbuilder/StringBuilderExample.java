package etc.api.lang.stringbuilder;

public class StringBuilderExample {

	public static void main(String[] args) {
		//String 객체는 속도가 느리다 낭비 심함 
		//문자를 바꿀때마다 객체생성 그래서 낭비가 심하다고 한거다.

		/*
		 String 클래스의 단점

		  아주 많이 쓰이고 좋은 기능들을 많이 가지고 있지만
		  메모리를 과소비하는 단점이 있습니다.

		  String객제는 처음 초기화된 데이터에 변화를 주어야 하는 상황에서
		  기존 객체를 활용하지 않고 새롱ㄴ 객체를 계속해서 생성합니다.

		  StringBuilder, StringBuffer(자바 5버전부터 사용 가능)

		  String 클래스 단점으로 인한 메모리 과부하 밎 속도가 느려지는 현상을 
		  개선하기 위해서 String Builder가 새롭게 추가되었습니다.

		  StringBuilder는 기존 객체를 계속 재활용하면서 실제 갹체 내부의 값을
		  변경하게 됩니다.

		  StringBuilder, StringBuffer는 메서드가 동일합니다.
		  StringBuilder  단일 스레드
		   StringBuffer  다중 스레드에서 문자열을 공유해야 할 때.
		 */

		String str = "Hello";
		System.out.println("str주소값" +str.hashCode());

		str= "hello wold";
		System.out.println("str주소값" +str.hashCode());

		str = "hello~";

		System.out.println("str주소값" +str.hashCode());



		System.out.println("-----------------------------------------------");

		StringBuilder sb = new StringBuilder("hello");
		System.out.println(sb);
		System.out.println("sb주소"+sb.hashCode());
		
		//문자열을 맨 끝에 추가하는 메서두 append문자열
		sb.append(" world");
		System.out.println(sb);
		
		
		//문자열을 특정 인덱스에 삽입하는 메서드 insert(인덱스, 삽입할 문자열)
		sb.insert(6,"my ");
		System.out.println(sb);


		//특정 인덱스 범위의 문자열을 교체하는 메서드: replace(begin, end, 문자열)
		//끝범위는 미만으로 인식됨
		sb.replace(6, 8, "your");
		System.out.println(sb);
		

		//문자열 내의 특정 단어를 삭제하는 메서드 delete(begin, end)
		sb.delete(6, 11);
		System.out.println(sb);
		
		//문자열을 역순으로 배치
		sb.reverse();
		System.out.println(sb);
		
		System.out.println("sb주소값" + sb.hashCode());



	}

}
