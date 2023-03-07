package oop.obj_arr;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
//		Person kim = new Person("김길동",32,"남자");
//		Person lee = new Person("이영희 ",25,"여자");
//		Person park = new Person("박철수",50,"남자");
//		
//		kim.personInfo();
//		lee.personInfo();
//		park.personInfo();
//		
		//배열안에다가 넣어준다 -> 반복문을 돌린다.
//		int[] arr= new int[5]; //값이 준비되어있지 않을때 쓰는 배열 선언
//		
//		Person[] people = new Person[3]; //객체 타입 배열
//		people[0] = new Person ("김철수 ",32,"남자");//인덱스를 이용해서 값을 넣어준다
		
		
		
//		int[] arr = {1,2,3,4,5};
        Person[] people = {
        	 new Person("김길동",32,"남자"),      //객체의 주소를 보고 찾아갈 수 있게 세팅이 되어있다. 배열도 객체이다.
        	  new Person("이영희 ",25,"여자"),   //기본타입의 배열이 아니다 클래스 타입의 배열 값이 크다 
        	  new Person("박철수",50,"남자")
        	};
		
//        System.out.println(Arrays.toString(people));
        
//        people[0].personInfo(); // people 잊덱스의 안에는 주소가 있다 . 으로 객체에 접근해서 메소드 호출
//        people[1].personInfo();
//        people[2].personInfo();

        
        
        //반복문 돌리기
        
//        
//        for(int i = 0; i <people.length; i++)
//        {
//        	people[i].personInfo();
//        }  //i번쩨의 객체애 접근해서 호출될것이다. .을 사용한다
//        
//        
            // 타입  변수 
          for(Person p : people )
          {
        	  p.personInfo(); //p 변수에 접근해서 호출 .을사용한다
          }
        
        
        
        
        
        
        
        
	}

}













