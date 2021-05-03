package fastcampuswork.codingtest;

public class Code2 {

    private static boolean checkPassword(String s) {
    	int len = s.length();
    	int digit_cnt = 0;
    	int upper_cnt = 0;
    	
    	// 길이 체크
    	if(len< 5) {
    		return false;
    	}
    	
//    	'a' == 97
//    	'z' == 122
//    	'A' == 65
//    	'Z' == 90
//    	'1' == 49
//    	'0' == 48
//    	'9' == 57
    	
    	for(int i=0; i<len; i++) {
    		if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' ) {
    			upper_cnt++;
    		}
    		
    		if(s.charAt(i) >= '0' && s.charAt(i) <= '9' ) {
    			digit_cnt++;
    		}
    	}
    	
    	if(upper_cnt > 0 && digit_cnt > 0)
    		return true;
        return false;
    }

    public static void main(String[] args) {
		System.out.println(checkPassword("8eqq") == false);
		System.out.println(checkPassword("password1") == false);
		System.out.println(checkPassword("Password1") == true);
    }

}
