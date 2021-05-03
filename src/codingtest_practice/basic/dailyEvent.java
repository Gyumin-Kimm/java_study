package codingtest_practice.basic;

import java.util.ArrayList;
import java.util.TreeSet;

public class dailyEvent {
	public int solution(int[] estimates, int k) {
		int answer = 0;
//		ArrayList<Integer> arrayList = new ArrayList<>();
		TreeSet<Integer> treeSet = new TreeSet<>();
		
		for(int i=0; i<estimates.length-k; i++) {
			
			if( estimates[i] <= estimates[i+k] ) {
				if( i == estimates.length-k-1 ) {
//					arrayList.add(sum(estimates, i+1, k));
					treeSet.add(sum(estimates, i+1, k));
				}
			}
			else {
//				arrayList.add(sum(estimates, i, k));
				treeSet.add(sum(estimates, i, k));
			}
		}
		
		if( estimates.length == k ) {
			answer = sum(estimates, 0, k);
		}
		else {
//			arrayList.sort(null);
//			answer = arrayList.get(arrayList.size()-1);
			answer = treeSet.last();
		}
		
		return answer;
	}

	public int sum(int[] arr, int s, int k) {
		int tmp = 0;

		for (int i = s; i < s+k; i++) {
			tmp += arr[i];
		}

		return tmp;
	}
}

//[5, 1, 9, 8, 10, 5]
//ary:[5, 1, 9] sum:15
//ary:[1, 9, 8] sum:18
//ary:[9, 8, 10] sum:27
//ary:[8, 10, 5] sum:23
//27
//----------------
//[10, 1, 10, 1, 1, 4, 3, 10]
//ary:[10, 1, 10, 1, 1, 4] sum:27
//ary:[1, 10, 1, 1, 4, 3] sum:20
//ary:[10, 1, 1, 4, 3, 10] sum:29
//29