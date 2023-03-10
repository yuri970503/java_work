package etc.api.lang.obj;

public class MainClass {

	public static void main(String[] args) {
		Person park = new Person("박영희", 25);
		Person hong = new Person("홍길동", 24);
		
		//객체 타입의 변수를 출력하거나 값을 얻을 때는
		//뒤에 자동으로 toString()이 붙어서 진행됩니다.
		System.out.println(park.toString());
		System.out.println(hong);
		
//		System.out.println(park.equals(hong));  //문자열 비교
		
		
		if (hong.equals(park))
		{
			System.out.println("이름같음");
		}
		else
		{
			System.out.println("이름다름");
		}
//		park.personInfo();  선언할 필요가 없다 toString 오버라이딩이 되었어서 
//		hong.personInfo();
        
		
		Person kim = new Person("김복제인간",100);
		
		try {
			Person clonePerson = (Person) kim.clone();
			System.out.println("복사 객체"+ clonePerson);
			System.out.println("kim"+kim.hashCode());
			System.out.println("복사된 객체 주소"+clonePerson.hashCode());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//finalize는  
		hong = null;
		park = null;
		System.gc(); //가비지 컬랙터를 호출 (부른다고 바로 안 올수도 있습니다.)
		
	}
//    System = stactic? 으로 구성되어있음
}
