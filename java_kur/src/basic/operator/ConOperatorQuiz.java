
package basic.operator;

public class ConOperatorQuiz {

	public static void main(String[] args) {
		
		
		/*
		 42 ~ 396이상의 난수를 발생시킨 수
		 발생한 난수가 짝수인지 여부를 
		 3항 연산식으로 출력해보세요
		 
		   ex)
		   발생한 난수: xx
		   3항 연산의 결과: 홀수, 짝수
		 */

		
		int rn = (int) (Math.random()*355+42);
		System.out.println("발생한 난수 : " + rn);
		
		String res = (rn % 2 == 0 ? "짝수입니다" : "홀수입니다");
	    System.out.println("3항 연산의 결과: "+res);
		
		
		/*
		 한줄로 작성가능
		 System.out.println("3항 연산의 걸과: "
		 + (rn % 2 == 0 ?"짝수입니다":"홀수입니다"));
		 
		 */
		
		
		
		
	}

}
