package basic.method;

/*
  반환값, 반환 유형 (return value, return type)
  
  1 반환값이란 메서드의 실행 결과값을 의미합니다.
  
  2 매개변수는 여러 개 존재할 수 있지만, 반환값은 오직 한 개만 
  존재해야 합니다.
  
  3 전달되는 값의 타입을 반환 유형이라고 하며, 메서드를 선언할 때
  메서드 이름 앞에 반드시 반환 유형을 명시해야 합니다.
  
  4 return이라는 키워드를 사용하며 return 뒤에 전달할 겂을 
  지정합니다.(변수,상수)
  
  5 반환값이 있는 메서드는 호출문 자체가 하나의 값으로 처리될 수 있기 때문에 
  반환값을 다른 변수에 대입할 수도 있고 , 다른 메서드의 매개값으로 처리 가능합니다.
  
 
 6 모든 메서드가 반환값이 있는 것은 아닙니다. 매서드 실행 후에 
 반환할 값이 딱히 없다면 return을 생략해도 됩니다.
 
 7 이 때는 반환유형을 메서드를 선언할 때 바워두지 마시고 
 void라는 키워드를 작성해 주셔야 합니다.
 
 8 모든 메서드는 return을 만나면 강제로 메서드가 종료됩니다.
 따라서 조건 없이 return문 아래에 코드를 작성할 수 없습니다.
 void메서드에서는 return 키워드를 탈출 기능으로 사용할 수 있습니다.
 */
public class MethodExample3 {

	static int calcArrayTotal(int[] be)//리턴 타입은 나중에 작성해도 된다.
	{   int total = 0;
		for (int i = 0; i <be.length; i++)
			total += be [i];
		
	return total;
	}
	/* 모범답안
	 static double[] calcArrayTotal(int[] nums) {
		int total = 0;
		for(int n : nums) {
			total += n;
		}
		double avg = (double)total / nums.length;
		return new double[] {total, avg};
	 */
	 
	 static void multi(int n1, int n2)
	 {
		 int result = n1 * n2;
		 System.out.printf("\n%d x %d = %d",n1,n2,result);
     }
	
	 static void divide(int n1, int n2)
	 {  if (n2 ==0 ) 
	 {
		 System.out.println("\n0으로 나누시면 안돼요!");
		 //break; continue; 쓸 수가 없다.
		 return; //호출부로 값을 돌려주는것
		         // 멈춰주는것 종료해주는것
	 }
			int result = n1 / n2;
			System.out.printf("%d / %d = %d\n", n1, n2, result);
	 }
	 
	 
	 
	static int add(int n1,int n2)
	{
		return n1 + n2; //2개의 매개변수의 합도 가능
	}   //리턴문 아래에다가는 아무것도 쓸 수가 없다.
	    //리턴문은 메서드에서만 사용가능
	
	static int[] operateTotal(int n1,int n2)//4개의 리턴
	{
		return new int[] {add(n1,n2),n1-n2,n1*n2,n1/n2 };//
	}                    //add메서드 내부에서 메서드를 전달하는것도 가능하다. 꼭 메인에서만 하는건 아니다.
	public static void main(String[] args) {
		           // void 메서드는 메인은 리턴이 필요가 없다 
		
		
		
		
		
		
		
		int r1 = add(3,8);//int r1 = 11; 똑같다 
		int r2 = add(10,15);//int r2 = 25;
		int r3 = add (add (4,6),add(7,8)); //이런식으로도 가능하다.
		System.out.println(r3);
		
		int[] totalResult = operateTotal(30, 6);
		System.out.println("30 + 6 = " + totalResult[0]); //배열이니 인덱스로 접근 
		System.out.println("30 - 6 = " + totalResult[1]);
		System.out.println("30 * 6 = " + totalResult[2]);
		System.out.println("30 / 6 = " + totalResult[3]);
		//리턴은 한번만 여러개를 하려면 배열로 받아서 쓴다.

		/*
		 1 메서드 이름은 calcArrayTotal 로 정의하겠습니다.
		 2 이 메서드는 정수 배열을 하나 전달받아서해당 배열 내부에 있는'모든 정수의 합계 (int)와 평균(double)을 배열애 담아서 
		 리턴하는 메서드입니다.
		 3 2번에 정의한 조건대러 메서드를 선언하시고, 실제로 main에서 호출해서 합계와 평균 (소수점 둘째 자리까지 )을 출력해 주세요
		 {57,89,78,91,93,47}
		 */
		
		
		
		int[] be = {57,89,78,91,93,47};
		
		/*
		 int[] numbers = {57, 89, 78, 91, 93, 47};
		double[] result = calcArrayTotal(numbers);
		System.out.printf("합계: %d, 평균: %.2f\n"
				, (int)result[0], result[1]);
		 */ //더블을 인트로 내려라 내려도 괜찮다.
//		
//		int sum = calcArrayTotal(be);
//		System.out.println(sum);
//		System.out.printf( "평균 %.2f", (double)sum / be.length);
//		// 배열안에 담아서 호출하는것 배열안에 넣는것을 안했다.
//		
		System.out.println("_____________________________________________");
		
		/*
		 반환값이 없는 void 타입의 메서드는 값이 돌아오지 않기 때문에 실행 
		 결과를 변수에 저장할 수 없고, 다른 메서드의 매개값으로도
		 사용이 불가능합니다.
		 반드시 단독 호출하여 사용해야 합니다
		 void 메서드는 단순히 동작을 지시하는 열할을 수행합니다.
		 */
		//int r4 = multi (10,7);//void를 int로 변환할 수 없다
		//System.out.println(multi(10,7));// 결과값이 나오지 않는다
		//단독 호출해야한다.
		multi(10, 7);
		multi(add(3,4), add(4,7));
//		add(multi(4,4), multi(5,6)); (x)
		
		divide(20, 0);
	}

}
