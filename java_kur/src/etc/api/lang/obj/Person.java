package etc.api.lang.obj;

public class Person { //extends object 자동으로 되어있음 

	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
//	toString
	@Override //얘를 오버라이딩 해서 메서드를 굳이 출력안해도 된다. 변수만 입력해서 출력하면된다.
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

//    equals
	@Override
		public boolean equals(Object obj) {
		if(obj instanceof Person)
		{
		Person p =(Person) obj; //형변환 타입을 내려서 다형성 상속 (자식의 타입으로 내려서)  
		  if (this.name.equals(p.name))
		  {
		return true;	
		  }
		}	
		return false;              //그치만 object 는 모든자식들의 부모여서... 확인해보고 내려야 한다 Person만 전달된다는 보장이 없다
			                    // Person 타입을 가질 수 있는지를 확인해 보고 내려야 한다 instanecof키워드를 사용해주면 된다.
		}

	@Override
		protected void finalize() throws Throwable {
			//생성된 객체가 사라지는 시점에서 자동 호출 (gc가 호출될때)
		System.out.println(this.name + "이 소멸되었습니다.");
			super.finalize();//사라질 준비...
		}
	
	//객체 복사 메서드
	//cloneable 인터페이스를 구현해서 사용하셔야 합니다  주소값 복사
		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}
	

	public void personInfo()
	{
		System.out.println("이름"+name);
		System.out.println("나이"+age);
	}
	
}
