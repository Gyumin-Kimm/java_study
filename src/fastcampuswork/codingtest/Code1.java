package fastcampuswork.codingtest;

public class Code1 {
    private static boolean solve(String a, String b) {
    	int len = a.length();
    	char[] data = new char[len];
    	
    	// char 배열로 변경
    	for(int i=0; i<len; i++) {
    		data[i] = a.charAt(i);
    	}

    	
        for(int i=0; i<len; i++) {
        	// 문자열이 같으면
        	if(String.valueOf(data).equals(b)) {
                return true;
        	}
        	else {
        		// 우측 shift
        		char tmp = data[len-1];
        		for(int j = len-1; j>=1; j--) {
        			data[j] = data[j-1];
        		}
        		data[0] = tmp;
        	}
        	
        	System.out.println(String.valueOf(data));
        }
        
        return false;
    }

    public static void main(String[] args) {

        System.out.println(solve("abc", "bca") == true);
        System.out.println(solve("abcd", "abcd" ) == true );
        System.out.println(solve("abcde", "abced" ) == false );

    }
}