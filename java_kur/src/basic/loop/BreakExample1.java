package basic.loop;

public class BreakExample1 {

	public static void main(String[] args) {
		
		
		/*
		 내부 반복문에 포함된 break로 바깥쪽 반복문까지 한번에 
		 종료시키고 싶다면 바깥쪽 반복문에 label을 붙입니다.
		 그리고, break 선언 시 label 함께 선언합니다. 
		 */
		for(int i = 1; i<=10 ; i++) 
		{System.out.print(i + " ");
			if (i > 7) 
			
				break;
			
		
		}System.out.println("\n 반복문 종료!");

		
		System.out.println("---------------------------");
		outer:for (int i = 0; i <=2; i++)
		     {for (int j = 0; j <= 1; j++)
		           {if (i == j) 
		               {  break outer;
		        	   
		               }System.out.println(i + "-" + j);
		           }
		  			
		     }
	}

}
