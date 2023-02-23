package basic.loop;

public class WhileExample2 {

	public static void main(String[] args) {
		
		//48 ~ 150사이의 정수 중 8의 배수로만 가로로 출력해 보세요.
		//(48부터 숫자를 하나씩 올려가면서 8의 배수 판별을 반복하면 되갰죠?)
		
		int num = 48;
		while (num <= 150) {
			if (num % 8 == 0) {
				System.out.print(num + " ");
			}
			
			num++;
		}
		
		System.out.println();
		
		//1 100까지의 정수  4의 배수 이면서 
		//8의배수는 아닌 수를 가로로 출력해 보세요
		
		int j = 1;
		while(j <= 100) {
			if(j % 4 == 0) {
				if(j % 8!=0) {
					System.out.print(j +" ");
				}
				
			}
			j++;
		}
		System.out.println(" ");
		//1 ~ 30000까지의 정수 중 258의 배수의 개수를 출력

		int one = 1;
		int z = 0;
		while(one <= 30000) {
		    if(one % 258 == 0){
		    	z++;
		    }				
			one++;
		}System.out.println("258의 배수의 개수: "+z);
		/*
		 모범답안
		 int j = 1;
		 int count = 0; -배수의 개수를 기억해 줄 변수
		 while (j <= 30000){
		    if(j % 258 == 0){
		     count++;
		    }j++;
		 }  System.out.println("258의 배수의 개수: "+count);
		 */
		
		
		
		//1000의 약수의 개수를 구하세요.
		//1부터 1000까지 하나씩 올려가면서 1000이랑 나눠보세요 
		//그랬을 때 나누어 떨어지는 애가 약수입니다.
		
		int s = 1;
		int r = 0;
		while(s <= 1000){
			if(1000 % s == 0 ){
				r++;
			}
				
			s++;
		}	System.out.println("1000의 약수의 개수: "+ r);
		
		/*
		 모범답안
		 int k = 1;
		 int cnt = 0;
		 while (k <= 1000){
		     if (1000 % k == 0)
		         cnt++;
		 } k++;
		 */
		
		
		
		
		
		
		
		
	  }   
//	  int n = 48;
//	  while (n<=150) {
//		  System.out.println(n + " ");
//		  n += 8;
//	  }
	
}
	
	
	
	
	
	
	
	
	



