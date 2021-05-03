package codingtest_practice.basic;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/* 카카오 커머스 신입사원 코테 1번 */
public class giftCard {
	public int solution(int[] gift_cards, int[] wants) {
        int answer = wants.length;
        int len = wants.length;
        Queue<Integer> queue = new LinkedList<>();
        
        Arrays.sort(gift_cards);        
        Arrays.sort(wants);
        for(int i =0;i<len;i++) {
        	queue.add(gift_cards[i]);
        }
        
        System.out.println(queue);
        System.out.println(Arrays.toString(wants));
        
        for(int i =0; i<len ; i++) {
        	System.out.println("i:" + i + " queue:" + queue.peek() + " wants:" + wants[i] + " answer:" + answer);
        	if(queue.peek() > wants[i]) {
        		continue;
        	}
        	else if(queue.peek() < wants[i]) {
        		queue.remove();
        		i--;
        	}
        	
        	if(queue.peek() == wants[i]) {
        		queue.remove();
        		answer--;
        	}
        }
        
        
        return answer;
    }
}
