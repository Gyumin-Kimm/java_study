package codingtest_practice.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class cpTest {
	public boolean solution(int[] arr) {
		boolean answer = true;
		Stack<Integer> s = new Stack<>();

		for (int pos = 0, val = 1; pos < arr.length; val++) {
			
			if (!s.isEmpty()) {
				
				if (s.peek() > arr[pos]) {
					answer = false;
					break;
				} else if (s.peek() == arr[pos]) {
					while(s.size()>0) {
						if(s.peek() == arr[pos]) {
							s.pop();
							pos++;
						}else {
							break;
						}
					}
				}
			}
			

			if(val==arr.length+1 && s.size() ==0) {
				answer = true;
				break;
			}
			

			s.add(val);
			


			System.out.println("pos=" + pos + ",val=" + val+",stack="+Arrays.toString(s.toArray()));
		}

		return answer;
	}
	
	public int solution2(int k, int[] score) {
		int answer = 0;
		List<Long> list = new ArrayList<>();
		
		for(int i =0; i<score.length-1;i++) {
			list.add((long) (score[i]-score[i+1]));
		}
//		System.out.println(Arrays.toString(list.toArray()));
		
		HashMap<Long, Integer> hm = new HashMap<>();
		for(Long a : list) {
			hm.put(a, hm.getOrDefault(a, 0) + 1);
		}
//		System.out.println(hm);

		List<Long> target_arr = new ArrayList<>();
		for(Long a : hm.keySet()) {
			if(hm.get(a) >= k) {
				target_arr.add(a);
			}
		}
//		System.out.println(Arrays.toString(target_arr.toArray()));
		
		boolean flag = false;
		List<Integer> del_arr = new ArrayList<Integer>();
		
		for(int i =0; i<list.size();i++) {
			for(int j=0;j<target_arr.size();j++) {
				Long a1 = list.get(i);
				Long a2 = target_arr.get(j);
				flag = a1.equals(a2);
				if(flag) {
					del_arr.add(i);
				}
			}
		}
//		System.out.println(Arrays.toString(del_arr.toArray()));
		
		for(int i =0; i<del_arr.size();i++) {
			if(i== 0 ) {
				answer += 2;
			}
			else if(i != 0 && del_arr.get(i)-del_arr.get(i-1) > 1) {
				answer += 2;
			}
			else {
				answer += 1;
			}
		}
		
		return answer;
	}
}
