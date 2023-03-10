package etc.api.lang.stringbuilder;

public class StrText {

	public static void main(String[] args) {
	
		
		long start = System.currentTimeMillis();
		
//		//String test
//		String str = "a";
//		for (int i = 1; i <=500000; i++)
//		{
//			str += "a";
//		}
		
		StringBuilder sb = new StringBuilder("a");
		for(int i=1; i<=5000000; i++) {
			sb.append("a");
		}// 문자열 삭제 변겅 등등등 사용 좋음 용량 많을때 사용하기 좋음
		
		
		
		long end = System.currentTimeMillis();
		
		System.out.println("실행결과 "+ (end-start)*0.001+"초");

	}

}
