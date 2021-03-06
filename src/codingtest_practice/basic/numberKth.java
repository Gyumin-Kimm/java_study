package codingtest_practice.basic;

import java.util.Arrays;

public class numberKth {
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++) {
        	int[] temp_array = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
        	Arrays.sort(temp_array);
        	answer[i] = temp_array[commands[i][2]-1];
        }
        
        return answer;
    }
}
