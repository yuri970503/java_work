package basic.method;

import java.util.Arrays;


public class MethodQuiz02 {
	
static String[] foods = {"떡볶이", "치킨", "파스타"};
	
	//배열의 맨 마지막 위치에 데이터를 추가하는 함수
    // 기존 배열보다 크기가 한 큰 배열 선언해서 값 고대로 내리기
    //매개값으로 온 값을 마지막에 채우기
	static void push(String newFood) // push는 값을 추가하면 끝이다 리턴타입은 void이다.
	{
		
		String[] newFoods = new String[foods.length+1];
		for (int i = 0; i < foods.length; i++) //범위가 작은 배열의 기준을 맞춰야한다.
		{
			newFoods [i] = foods[i];
		}
	 	       newFoods[foods.length] = newFood; 
	 	       //newFoods[newFoods.length -1 newFood;]
				
		foods= newFoods;
				
				
	}
	
	//배열 내부 데이터 단순 출력 함수
	static void printFood() 
	{
		System.out.println(Arrays.toString(foods));
	}
	
	//배열 내의 특정 음식의 위치를 찾아주는 함수
	//반복문 이용해서 돌리면 됩니다.
	static int indexOf(String targetName) 
	{
		for(int i = 0; i < foods.length; i++ )
		{
			if (targetName.equals(foods[i]))
			{
				return i;
			}
		}
		return -1;
	}
	
	//특정 음식의 배열 포함 여부 (참/거짓)
	//indexOf의 리턴값으로 판단하여 리턴
	static boolean include(String targetName) 
	{//이건 아에 잘 모르겠다.
	
		return indexOf(targetName) != -1;//존재하지 않는 음식이 전달이 되면 -1 존재하는 음식은 -1외의 다른 값
	    // 값을 불러온다 인덱스 오브의 값
	}
	
	
	//특정 음식 제거 함수 
	//앞에서 진행한 배열의 삭제 로직
	static void remone (String targetName) 
	{String [] newFoods = new String [foods.length-1];
	
		for(int i = 1; i < foods.length-1; i++)
		{
			newFoods[0] =  foods[0];
			for (int j = 0; j < newFoods.length; j++) 
			{
				newFoods[j] = foods[j];
		
			} foods = newFoods;
		
		}  
		
	}

//	int idx = indexOf(targetName);
//	if(idx == -1) {
//		System.out.println("존재하지 않는 음식명입니다.");
//	} else {
//		for(int i=idx; i<foods.length-1; i++) {
//			foods[i] = foods[i+1];
//		}
//		String[] temp = new String[foods.length-1];
//		for(int j=0; j<temp.length; j++) {
//			temp[j] = foods[j];
//		}
//		foods = temp; temp = null;
//	}

	
	
	
	
	
	//특정 음식 수정 매서드  //탐색 안함
	static void modify(int targetIdx, String newFood)
	{
		foods[targetIdx] = newFood;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		

		printFood();
		push("라면");
		push("김치찌개");
		printFood();
		
		//파스타 김치찌개 짜장면 인덱스
	    System.out.println("파스타의 인덱스 " + indexOf("파스타"));
	    System.out.println("김치찌개의 인덱스 " + indexOf("김치찌개"));
	    System.out.println("짜장면의 인덱스 " + indexOf("짜장면"));
//		remove("김치찌개");
//		remove("망고"); //존재하지 않는 음식명 입니다. 출력
		
		//라면의 존재 여부
		System.out.println(include("라면"));
		// 양념치킨의 존재 여부
		System.out.println(include("양념치킨"));
		//2번 인덱스 데이터를 닭갈비로 수정
			modify(2, "닭갈비");
			printFood();
		
		
	}

}
