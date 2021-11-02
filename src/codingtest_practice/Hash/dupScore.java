package codingtest_practice.Hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class dupScore {
	public String[] solution(String[] logs) {
        String[] answer = {};
        
        Map<Map<String, String>, Integer> hm = new HashMap<>();
        List<String> id_list = new ArrayList<>();
        
        for(String a : logs) {
        	String id = a.split(" ")[0];
        	String q = a.split(" ")[1];
        	int score = Integer.valueOf(a.split(" ")[2]);
        	
        	id_list.add(id);

        	if(hm.get(getMap(id,q)) == null) {
        		hm.put(getMap(id, q), score);
        	}
        	else {
        		if(hm.get(getMap(id,q)) < score) {
        			hm.put(getMap(id, q), score);
        		}
        	}
        	
        }
        
        System.out.println(hm);
        
        return answer;
    }

	private Map<String, String> getMap(String string, String string2) {
		Map<String, String> m = new HashMap<>();
		m.put(string, string2);
		return m;
	}
}
