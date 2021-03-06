package codingtest_practice.basic;

public class reverseThree {
	public int solution(int n) {
        int answer = 0;

    	String third = Integer.toString(n, 3);
    	StringBuffer sb = new StringBuffer(third);
    	String reversed = sb.reverse().toString();
    	answer = Integer.valueOf(reversed, 3);
    	
//        String s = "";
//        while(n >= 3) {
//        	int y = Math.floorMod(n, 3);
//        	n = Math.floorDiv(n, 3);
//        	
//        	s += Integer.toString(y);
//        }
//        
//        s += n;
//    	answer = Integer.valueOf(s, 3);
        
        return answer;
    }
}
