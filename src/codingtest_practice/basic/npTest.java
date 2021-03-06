package codingtest_practice.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class npTest {
//	public static int solution(String[] A) {
//	public static int solution(int[] A) {
	public static int solution(int A, int B, int C, int D) {
		
		int answer = 0;
		int tmp = 0;
		List<Integer> list = List.of(A, B, C, D);
		List<Integer> e_list = new ArrayList<Integer>();
		for(int i : list) {
			if(i < 3 && !e_list.contains(i)) {
				e_list.add(i);
				tmp += 1;
			}
		}
		System.out.println("tmp:"+ tmp);
		
		Set<Integer> set = new TreeSet<>();
		for(int i : list) {
			set.add(i);
		}
		
		int tmp1 = set.size() > 3? 3:set.size();
		answer = tmp * tmp1;
		e_list.clear();
		
		System.out.println("answer:"+ answer);
		tmp = 0;
		
		for(int i : list) {
			if(i < 7 && !e_list.contains(i)) {
				e_list.add(i);
				tmp += 1;
			}
		}
		
		tmp -= 2;
		if(tmp <= 0 ) tmp = 1;
		
		answer = answer * tmp;
		
		System.out.println(answer);

		return answer;
		
		
		
//		//0, 1, 1, 1, 0, 1, 1, 1, 0, 1
//		int n = A.length;
//        int i = n - 1;
//        int result = -1;
//        int k = 0, maximal = 0;
//        while (i > 0) {
//        	System.out.println(
//        			"A[i]:"+A[i] + " n:"+n+" i:"+i+" result:"+result+" k:"+k+" maximal:" + maximal);
//            if (A[i] == 1) {
//                k = k + 1;
//                if (k >= maximal) {
//                    maximal = k;
//                    result = i;
//                }
//            }
//            else
//                k = 0;
//            i = i - 1;
////            System.out.println(
////        			"A[i]:"+A[i] + " n:"+n+" i:"+i+" result:"+result+" k:"+k+" maximal:" + maximal);
//            System.out.println("--------------------");
//        }
//        if (A[i] == 1 && k + 1 > maximal)
//            result = 0;
//        return result;
		
        
//		/*
//		 * 0 N-1
//		 */
//		HashMap<String, Integer> hm = new HashMap<String, Integer>();
//		for(String s : A) {
//			hm.put(s, hm.getOrDefault(s, 0)+1);
//		}
//		System.out.println(hm);
//		
//		int max = 0;
//		for(String key : hm.keySet()) {
//			if(hm.get(key) > max) {
//				max = hm.get(key);
//			}
//		}
//		
//		return max;
    }
}
