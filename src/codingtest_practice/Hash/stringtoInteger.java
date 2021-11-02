package codingtest_practice.Hash;

import java.util.HashMap;

public class stringtoInteger {

	public int solution(String s) {
		String res = "";
		String key = "";
		HashMap<String, String> hm = new HashMap<>();

		hm.put("zero", "0");
		hm.put("one", "1");
		hm.put("two", "2");
		hm.put("three", "3");
		hm.put("four", "4");
		hm.put("five", "5");
		hm.put("six", "6");
		hm.put("seven", "7");
		hm.put("eight", "8");
		hm.put("nine", "9");

		for (int i = 0; i < s.length(); i++) {
			if (hm.get(key) != null) {
				res += hm.get(key);
				key = "";
			}
			
			if ('0' <= s.charAt(i) && '9' >= s.charAt(i)) {
				res += s.charAt(i);
			} else {
				key += s.charAt(i);
			}
		}
		
		if( key.length() > 0 ) {
			res += hm.get(key);
		}

		return Integer.parseInt(res);
	}
}
