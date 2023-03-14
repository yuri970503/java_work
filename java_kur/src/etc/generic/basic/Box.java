package etc.generic.basic;

public class Box<T> { //제네릭 클래스로 선언
//          만들때 타입을 너가 만들어줘라 
	private T t;
	
	
	//제네릭 지정 타입  객체를 생성하는곳에서 얘기해줘라
	//너가 타입을 정해라 <> 여기에다가

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	
	
	
}
