package fastcampuswork.codingtest;

import java.util.ArrayList;
import java.util.List;

public class Code4 {

	public static int solution(int[] A){
		int answer = 0;
		
		List<Integer> list = new ArrayList<>();
		for(int i : A) {
			if(list.contains(i))
				continue;
			list.add(i);
		}
		
		List<Integer> checklist = new ArrayList<>();
		for(Integer i : list) {
			if(checklist.contains(-i)) {
				if( answer < Math.abs(i)) {
					answer = Math.abs(i);
				}
				
				checklist.remove(checklist.indexOf(-i));
			}
			else {
				checklist.add(i);
			}
		}

		return answer;
	}
	
	public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 2, -2, 5, -3})); // 3
        System.out.println(solution(new int[]{1, 1, 2, -1, 2, -1})); // 1
        System.out.println(solution(new int[]{1, 2, 3, -4})); // 0
    }

}
