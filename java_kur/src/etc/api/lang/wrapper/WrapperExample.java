package etc.api.lang.wrapper;
//객체로 포장하는 클래스
public class WrapperExample {

	//자바의 기본타입 -> 각각 객체로 포장 할 수 있는 클래스들이 있다. 객체타입밖에 없었다 기본타입은 나중에 생김
	// 객체타입으로 포장해야함 왜?


	public static void main(String[] args) {

		int a = 100;
		boolean b = false;
		char c = 'A';
		double d = 3.14;
		
		
		//boxing: 기본 데이터 타입을 객체타입으로 변환하는 과정(권장 X)

		Integer v1 = new Integer(100);

		Boolean v2 = new Boolean(b);
		Character v3 = new Character(c);
		Double v4 = new Double(d);
		
		//autoboxing:기본 타입을 자동으로 객체형으로 변환
		Integer x1 = a;
		Boolean x2 = b;
		Character x3 = c;
		Double x4 = d;
		
		//autounboxing : 객체 포장을 기본형으로 해제 가능
		int i = x1;
		double d2 = x4;
		
		
		//autoBoxing 이후에 wrapper 클래스는 문자열을 기본형으로
		//변환하는 데 많이 사용됩니다.
		
		// 해당타입으로 변환할 수 없는 문자열을 시도했을 경우
		//NumberFormatException 예외가 발생합니다.
		String s2 = "3.14";
		Integer.parseInt(s2);
		
		
	}

}
