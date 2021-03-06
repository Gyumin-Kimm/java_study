package codingtest_practice.heap;

import java.util.Set;
import java.util.TreeSet;

public class sumListTwoNum {
	public int[] solution(int[] numbers) {
        int[] answer = {};
        // TreeSet 
        Set<Integer> s_nums = new TreeSet<Integer>();
        
        for(int i=0;i<numbers.length-1; i++) {
        	for(int j=i+1;j<numbers.length; j++) {
        		s_nums.add(numbers[i] + numbers[j]);
        	}
        }
        
        answer = s_nums.stream().mapToInt(Integer->Integer).toArray();
        
        // List
//        List<Integer> nums = new ArrayList<>();
//        
//        for(int i=0; i< numbers.length-1; i++) {
//        	for(int j=i+1; j<numbers.length; j++) {
//        		int sum = numbers[i] + numbers[j];
//        		if(nums.contains(sum)) {
//        			continue;
//        		}
//        		else {
//        			nums.add(sum);
//        		}
//        	}
//        }
//        
//        Collections.sort(nums);
//        answer = nums.stream().mapToInt(i->i).toArray();
        
        return answer;
    }
}
