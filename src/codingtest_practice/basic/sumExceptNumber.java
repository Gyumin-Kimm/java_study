package codingtest_practice.basic;

import java.util.Arrays;

public class sumExceptNumber {
	public int solution(int[] numbers) {
        int answer = -1;
        
        int[] full_numbers = {1,2,3,4,5,6,7,8,9};
        answer = Arrays.stream(full_numbers).sum() - Arrays.stream(numbers).sum();
        
        return answer;
    }
}
