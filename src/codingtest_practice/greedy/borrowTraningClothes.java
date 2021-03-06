package codingtest_practice.greedy;

import java.util.HashSet;

public class borrowTraningClothes {
//	{2,3, 4};
//	{1,3,5};
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
//        2
		answer = n;

		HashSet<Integer> rr = new HashSet<Integer>();
		for (int i : reserve) {
			rr.add(i);
		}
		for (int i = 0; i < lost.length; i++) {
			if (rr.contains(lost[i])) {
				rr.remove(lost[i]);
			}
		}

		HashSet<Integer> rl = new HashSet<Integer>();
		for (int i : lost) {
			rl.add(i);
		}

		for (int i = 0; i < reserve.length; i++) {
			if (rl.contains(reserve[i])) {
				rl.remove(reserve[i]);
			}

		}
		
		for(int i : rr) {
			if(rl.contains(i-1)) {
				rl.remove(i-1);
			}
			else if(rl.contains(i+1)) {
				rl.remove(i+1);
			}
		}
		
		answer = n - rl.size();

//        1
//        int[] cnt = new int[n+2];
//        Arrays.fill(cnt, 1);
//        
//        for(int i : lost) {
//        	cnt[i] -= 1;
//        }
//        
//        for(int i : reserve) {
//        	cnt[i] += 1;
//        }
//        
//        for(int i=1;i<cnt.length-1;i++) {
//        	if(cnt[i] < 2) {
//        		continue;
//        	}
//
//    		if(cnt[i-1] == 0) {
//    			cnt[i-1] += 1;
//    			cnt[i] -= 1;
//    		}
//    		else if(cnt[i+1] == 0) {
//    			cnt[i+1] += 1;
//    			cnt[i] -= 1;
//    		}
//        }
//        
//        for(int i=1;i<cnt.length-1;i++) {
//        	if (cnt[i] > 0) answer += 1;
//        }

		return answer;
	}
}
