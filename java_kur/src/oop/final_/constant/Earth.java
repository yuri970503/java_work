package oop.final_.constant;

public class Earth {

	/*
	  상수 (canstant)
	  
	  상수는 고정된 불변의 값입니다. 따라서 어디에서 접근을 하더라도 
	  같은 값이 나와야 하며 값의 변경 또한 불가능해야 합니다.
	  
	  따라서 자바에서는 상수를 선언할 때 static final 을 동시에 사용합니다.
	 */
	
	
	static final double RADIUS = 6400;  //누구나 공유하고 변경될 일이 없는 값 -> 상수로 표현
	//상수는 변수가 다 대문자이다  
	// static final 의 순서는 상관이 없다 바꿔도 에러는 없다

	
	static final double SURFACE_AREA; //변수이름을 언더바를 쓸경우는 이경우 밖에 없다 상수때
	
	static
	{
		SURFACE_AREA = RADIUS *RADIUS * Math.PI * 4;
	}
	
}
