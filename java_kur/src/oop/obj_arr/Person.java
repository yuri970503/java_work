package oop.obj_arr;

public class Person {

	
	
	private String name;
	private int age;
	private String gender;
	
	public Person() {
		     
		//생성자 자동완성  ctrl + sp
	}
	


	public Person(String name, int age, String gender) {
		super();
		this.name = name;     //자동완성 Alt + shkft + s  fields
		this.age = age;
		this.gender = gender;
	}


	
	
	
	
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}


	//set get 자동완성 Alt + shkft + s    getter setter
	
	
	
	
	public void personInfo()
    {
		System.out.printf("이름: %s \n나이 %d \n성별 %s" ,this.name,this.age , this.gender);
	}



	
	
	
	
	
 	

	
	
	
	
}
