package fastcampuswork.codingtest;

import java.util.Arrays;

public class Code3 {

    private static int check(int[] ints) {
    	int cnt = 0;
    	int len = ints.length;
    	
    	Arrays.sort(ints);
    	int[] numbers = new int[ints[len-1]];
    	
    	for(int i=0; i<len; i++) {
    		numbers[ints[i]-1] = 1;
    	}
    	
    	for(int i=0;i<numbers.length;i++) {
    		if ( numbers[i] == 0)
    			cnt++;
    	}
    	
        return cnt;

    }

    public static void main(String[] args) {

        System.out.println(check(new int[]{1, 5, 3, 2}) == 1);  //[4]
        System.out.println(check(new int[]{1, 7}) == 5);  //[2,3,4,5,6]
        System.out.println(check(new int[]{1, 2}) == 0);  //[]
    }
}