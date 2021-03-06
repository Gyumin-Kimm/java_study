package codingtest_practice.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class moreSpicy {
	public int solution(int[] scoville, int K) {
        int answer = 0;
        // 낮은숫자 순
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
//        높은숫자 순
//        PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for(int i =0;i<scoville.length;i++) {
        	q.add(scoville[i]);
        }

        while(q.size()>1 && q.peek()<K) {
        	q.add(q.poll() + q.poll()*2);
        	answer++;
        }
        
        if(q.size()<=1 && q.peek()<K) {
        	answer = -1;
        }
        
        return answer;
    }
}
