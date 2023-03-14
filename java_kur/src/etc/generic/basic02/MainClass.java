package etc.generic.basic02;

public class MainClass {

	public static void main(String[] args) {
		
		Basic<Integer, String> b = new Basic<>(1, "홍길동");
		String name = b.get(1);
		b.put(10, "김메롱");
		System.out.println(name);
		System.out.println(b);
		
		
		//제네릭   =    타입안정성 좋아짐   
		
		

	}

}
