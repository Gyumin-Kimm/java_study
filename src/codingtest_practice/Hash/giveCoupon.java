package codingtest_practice.Hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class giveCoupon {
	public int solution(String[] id_list, int k) {
        int answer = 0;
        
        HashMap<String, Integer> hm = new HashMap<>();
        
        for(String a : id_list) {
        	String[] names = a.split(" ");
        	HashSet<String> hs = new HashSet<>(Arrays.asList(names));
        	String[] s_names = hs.toArray(new String[0]);
        	for(String b : s_names) {
        		hm.put(b, hm.getOrDefault(b, 0) + 1);
        		if(hm.get(b) <= k) {
        			answer++;
        		}
        	}
        }
        
        return answer;
    }
}
