package codingtest_practice.stackqueue;

import java.util.Stack;

public class pickDoll {
	/*	
 	board = {{0, 0, 0, 0, 0}, 
			 {0, 0, 1, 0, 3},
			 {0, 2, 5, 0, 1}, 
			 {4, 2, 4, 4, 2}, 
			 {3, 5, 1, 3, 1}};
	moves = {1, 5, 3, 5, 1, 2, 1, 4};
	4 (3 (1 1) 3) 2 4
	*/
	public int solution(int[][] board, int[] moves) {
        int answer = 0;
//        List<Integer> nums = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int pos = 0;
        
        for(int move:moves) {
        	for(int j=0;j<board.length;j++) {
        		pos = board[j][move-1];
        		if(pos == 0) {
        			continue;
        		}
        		
            	if (!stack.isEmpty()) {
            		if(stack.peek() == pos) {
            			stack.pop();
                		board[j][move-1] = 0;
            			answer += 2;
            			break;
            		}
            	}
        	
        		stack.push(pos);
        		board[j][move-1] = 0;
        		break;        		
        	}

//        	System.out.println(stack);
        }
        
        return answer;
    }
}
