package oop.constructor;

public class Person {

	
	String name;
	int age;
	int hei;
	
	Person()
	{
		 
		
	} 
	
	Person(String iname,int iage,int ihei)
	{
		name = iname;
		age = iage;
		hei = ihei;
	}
	
	void info()
	{
		System.out.println("***정보***");
		System.out.println("이름: " + name);
		System.out.println("나이: "+ age);
		System.out.println("키: "+ hei);
	}
	
	
	
	
	
}
