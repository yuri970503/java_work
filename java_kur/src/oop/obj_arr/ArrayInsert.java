package oop.obj_arr;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArrayInsert {

	public static void main(String[] args) {
		
		
		/*
        - 스캐너를 이용하여 Person객체를 생성하는 데 필요한
         정보를 입력받으시면 되겠습니다.
         입력받은 정보를 토대로 Person객체를 생성한 후
         여러 개의 Person 객체를 배열에다 담아 둘 생각입니다.

        - 배열의 크기는 3개로 하겠습니다. 반복문을 이용하여
         입력을 반복해서 받아주시면 됩니다.

        - 입력이 끝나면 배열 안에 있는 모든 주소값을 순회하여
         각 객체의 personInfo()를 호출해 보세요. 
        */
		
		
		Person[] peoples = new Person[3];
		
		Scanner sc = new Scanner(System.in);
		
		Person peo = new Person();
		
		for(int i = 0; i < peoples.length; i++)
		{
			System.out.println("\n이름을 입력해주세요");
		    peo.setName(sc.next()); 
		    
		    System.out.println("나이를 입력해주세요");
		    peo.setAge(sc.nextInt()); 
		    
		    System.out.println("성별을 입력해주세요");
		    peo.setGender(sc.next());
		    
		    peoples[i] = new Person(peo.getName(),peo.getAge(),peo.getGender());
		    
		   
		    
		}
		System.out.println("-----------------------------------");
		for(Person peo1 : peoples)
		{         //선언한 위의 peo와 for문의 peo와 헷갈린다. 이름만 바꿔주면됨
			peo1.personInfo();
		}
		
		sc.close();
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		Person[] people = new Person[3];
//		
//		for(int i=0; i<people.length; i++) {
//			System.out.print("이름: ");
//			String name = sc.next();
//			System.out.print("나이: ");
//			int age = sc.nextInt();
//			System.out.print("성별: ");
//			String gender = sc.next();
//			
////			Person p = new Person(name, age, gender);
////			people[i] = p;
//			people[i] = new Person(name, age, gender);
//			
//		} //입력받는 반복문 끝.
//		
//		System.out.println("--------------------------");
		

	}

}
