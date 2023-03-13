package etc.collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String>  list = new LinkedList<>();
		
		
		
		
		//추가
		list.add("홍길동");
		list.add("김철수");
		list.add("박영희");
		
		
		list.addFirst("맨 앞");
		list.addLast("맨 뒤");
		System.out.println(list);
		
		System.out.println(list.get(3));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		
		list.remove(0);
		System.out.println(list);
		
		
		
		//LIFO -> last in first out -> stack  밑에서부터 쌓인다 꺼낼때는 가장 마지막에 들어오게 가장 먼저 나간다.
		//push ,pop, peek
		list.push("김뽀삐");//앞에서부터 추가
		System.out.println(list);
		
		//삭제하면서 데이터를 읽기
		System.out.println(list.pop());//가장 첫번째 값이 튀어나옴 그리고 실제 리스트에선 제거가됨
		System.out.println(list);
		
        //삭제하지 않으면서 읽기
		System.out.println(list.peek());
		System.out.println(list);
		
//		FIFO -> first in first out -> Queue 첫번째에 들어왔던애가 먼저 나가는 자료구조.
//		offer, poll , peek
		list.offer("a"); // 마지막에 추가
		list.offer("b");
		list.offer("c");
		System.out.println(list);
		
		
		System.out.println(list.poll());
		System.out.println(list);
		
		System.out.println(list.peek());
		System.out.println(list);
		
		
		
	}

}
