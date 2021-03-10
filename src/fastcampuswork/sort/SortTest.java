package fastcampuswork.sort;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {
		System.out.println("정렬방식을 선택하세요.");
		System.out.println("B : BubbleSort");
		System.out.println("H : HeapSort");
		System.out.println("Q : QuickSort");
		
		char c = (char) System.in.read();
		
		Sort sort = null;
		
		switch(c) {
		case 'B':
			sort = new BubbleSort();
			break;
		case 'H':
			sort = new HeapSort();
			break;
		case 'Q':
			sort = new QuickSort();
			break;
		default:
			System.out.println("input error");
			break;
		}
		
		int[] arr = {1,2,3,4,5,9,8,7,6,0};
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();
	}

}
