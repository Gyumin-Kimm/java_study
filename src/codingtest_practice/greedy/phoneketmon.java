package codingtest_practice.greedy;

import java.util.HashMap;

public class phoneketmon {

	public static void main(String[] args) {
		phoneketmon pm = new phoneketmon();
		
		System.out.println(pm.solution(new int[] {3,1,2,3}));
		System.out.println(pm.solution(new int[] {3,3,3,2,2,4}));
		System.out.println(pm.solution(new int[] {3,3,3,2,2,2}));

	}
	public int solution(int[] nums) {
        int answer = nums.length / 2;
        
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int a : nums) {
        	hm.put(a, hm.getOrDefault(a, 0) + 1);
        }
        
        return answer > hm.keySet().size() ? hm.keySet().size() : answer;
    }
}
