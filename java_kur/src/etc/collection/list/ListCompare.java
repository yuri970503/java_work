package etc.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCompare {

	public static void main(String[] args) {
		
		
		
		/*
		 ArrayList는 탐색 후 객체를 참조하는 경우에 유리하고
		 LinkedList는 잦은 삼입/삭제 등으로 리스트의 크기가 변할때 유리.
		 사이즈가 크지 않다면 크기차이는 없습니다.
		 */
		
		
		
		
		List<Integer> array = new ArrayList<>();
		List<Integer> linked = new LinkedList<>();
		
		for(int i = 0; i <1000000; i++)
		{
			array.add(i);
			linked.add(i);
			
		}

		
		long start, end; //시작시간, 끝시간
		
		
		//배열 리스트에서 데이터 제거
		start = System.currentTimeMillis();
		for (int i = 0; i <array.size(); i++)
//			array.remove(0); // 374
		    array.get(i); //2
		
		end = System.currentTimeMillis();
		
		System.out.printf("배열 리스트의 소요시간 %dms\n",end,-start); 
		
		
		
		
		
		
		
		
		
		//연결 리스트에서 데이터 제거
		start = System.currentTimeMillis();
		for(int i= 0; i<linked.size(); i++)
//			linked.remove(0); //3
		    linked.get(i);
		
		
		end = System.currentTimeMillis();
		
		System.out.printf("연결 리스트의 소요시간 %dms\n",end, -start);
		
		
		
	}

}
