package etc.api.util.arrays;

import java.util.Arrays;

public class ArraysExample {

	public static void main(String[] args) {
		

		//배열의 복사
		char[] arr = {'J','A','V','A'}; //배열선언
		char[] arr2 = Arrays.copyOf(arr, arr.length);
		char[] arr3 = Arrays.copyOfRange(arr, 1, 3);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		
		
		//배열의 탐색: binarySearch(배열, 검색할 값)
		//반드시 정렬이 선행되어야 합니다.
		int[] numbers = {1,3,5,7,9,11,13};
		System.out.println("5의 위치 : " + Arrays.binarySearch(numbers, 5));
		// 배열의 길이 구함 2로 나눔 찾고자하는 위치를 오른쪽 왼쪽 비교 한쪽을 버리고 비교하면서 구한다
		//사이는 -로 표현한다 1,3사이는 -다 그래서 10은 -6이된다. 정렬되어있어서 가능한것이다 
		//이것을 사용하기위해서는 정렬이 되어있어야 한다.
		// 이런 배열에만 써야하는건 아니다. 다른것도 있다.....
		
		//배열의 정렬
		int[] nums = {42,11,35,88,34,100};
		Arrays.sort(nums); //정렬
		System.out.println(Arrays.toString(nums));
		
		//배열 내부요소가 동일한지의 여부를 확인
		System.out.println(Arrays.equals(arr, arr2));
		
		
		
		
		
		
		
		
	}

}



















