package basic.method;
/*
  매개 변수 (parameter, argument)
  1 매개변수는 매서드를 호출할 때 메서드 실행에 필요한 값들을
  메서드 내부로 전달하는 매개체 역할을 합니다.
  
  
  2 메서드 호출부에서 어떤 매개값을 전달하느냐에 따라
  메서드의 실행 결과는 달라질 수 있습니다.
  
  3 매개값을 몇개 받아서 사용할지는 메서드를 선언할 때 선언부에서 
  ()안에 미리 개수와 타입을 지정합니다.
  
  4 매개변수의 이름을 지을 때는 호출자가 선언부로 돌아와서 
  매개값을 확인하지 않게, 어떠한 값을 담는 변수인지
  그 뜻을 알기 쉽게 지어주면 서로에게 좋습니다.
  
  5 매개변수를 하나도 선언하지 않을 수도 있습니다. 이때는 메서드의 선언부에 
  () 내부를 비워둡니다. 그리고 호출할 때도 ()
  
  
 */



public class MethodExample2 {
	
	//x부터 Y까지의 누적합계를 구하는 메서드
	static int calcRangetltal(int x, int y) //start,end
	{
		int total = 0;
		
		
		for (int i = x; i <=y; i++)
		{
			total += i;
		}
		return total;
	}

	//매개변수가 필요없는 경우
	static String selectRandomFood()//매개변수는 괄호가 있어야 한다 없으면 변수이다
	{
		double rn = Math.random();
		if(rn > 0.66)
		{
			return "치킨";
			
		}
	   else if (rn > 0.33)
	    {                             // 조건문 리턴은 이중에 하나만 된다.
		  return "족발";
	    }
	   else
	   {
		   return"삼겹살";
	   }
	}
	
	// 정수 n개를 전달하면 그 정수들의 총 합을 리턴하는 메서드
	static int calcNumberTotal(int[] nums) //배열
	{
		int total = 0;
		/*for(int i = 0; i <nums.length; i++)
		{
			total += nums[i];
		}
		return total;*/
		for (int n : nums)
		{
			total += n;
			
		}
		return total;
	}
	//가변인수(가변 피라미터)를 사용한 매개변수 작성.
	// 콤마로 나열되어 들어오는 여러개의 값을 배열로 묶어서 내부로 전달합니다.
	static int calcNumberTotal2(int...nums) 
	{
		int total = 0;
		for(int i : nums)
		{
			total += i;
		}
		return total;
	}
	
	public static void main(String[] args) {
		int result = calcRangetltal(3, 7);//매개변수 개수는 255개까지 가능 근데 너무 많아지면 알아보기 힘듬 4개 넘어가면 힘듬 
                                          //전달하는 순서도 중요함 그래서 매개변수가 많으면 순서도 알아보기 힘듬
		System.out.println(result);       // 변수를 어디로 전달하는지 뜻을 이름을 잘 정해서 지어야 한다
	                                      //명확한 뜻을 정해서 이름을 지어주면 편하게 알아볼 수 있다.
	                                      //정확한 개수 타입으로 줘야한다.
		System.out.println("오늘 점심 뭐먹지???:" + selectRandomFood());
	
	
	
		int[] arr = {10,30,50,70,90,110};//내부에 몇개가 있는지는 상관없다

		calcNumberTotal(arr);//리턴값이 돌아온다
		int sum = calcNumberTotal(arr);//벼수이름
		System.out.println("누적합: " + sum);
		
		sum = calcNumberTotal(new int[] {1,2,3,4,5,6,7});//괄호안에서 즉석에서 배열선언가능 
		System.out.println("누적합: " + sum);
		
		
		//가변 피라미터
		sum = calcNumberTotal2(1,2,3,4,5,6,7);// 배열을 안해도 여러값이 출력가능
		System.out.println("누적합: ");
	}                                     

}
