package codingtest_practice.Hash;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class guessTest {
	public int[] solution(int[] answers) {
		int[] answer = {};
		int[] tester1 = { 1, 2, 3, 4, 5 };
		int[] tester2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] tester3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int t1 = 0, t2 = 0, t3 = 0, tmp = 0, cnt=0;

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < answers.length; i++) {
			map.put(i, answers[i]);
		}

		for (int i = 0; i < map.size(); i++) {
			int ans = map.get(i);
			if (ans == tester1[i % tester1.length]) {
				t1++;
			}
			if (ans == tester2[i % tester2.length]) {
				t2++;
			}
			if (ans == tester3[i % tester3.length]) {
				t3++;
			}

//			System.out.println(
//					" answer:" + ans + " answerT:" + tester1[i % tester1.length] + "," + tester2[i % tester2.length]
//							+ "," + tester3[i % tester3.length] + "," + " count:" + t1 + "," + t2 + "," + t3);
		}

		List<Integer> list = List.of(t1, t2, t3);

		for (int i : list) {
			if (tmp < i) {
				tmp = i;
			}
		}
		
		for (int i :list) {
			if(i == tmp) {
				cnt++;
			}
		}
		
//		System.out.println("cnt:" + cnt + " tmp:" + tmp);
		
		answer = new int[cnt];
		int k = 0;
		for(int i=0;i<list.size();i++) {
//			System.out.println("listget:" + list.get(i));
			if( list.get(i) == tmp) {
				answer[k++] = i+1;
			}
		}

		return answer;
	}
}
