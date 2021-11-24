package codingtest_practice.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FailRate {

	public static void main(String[] args) {
		FailRate fr = new FailRate();

		System.out.println(Arrays.toString(fr.solution(5, new int[] { 2, 1, 2, 6, 2, 4, 3, 3 })));
		System.out.println(Arrays.toString(fr.solution(4, new int[] { 4, 4, 4, 4, 4 })));
//		System.out.println(Arrays.toString(fr.solution(5, new int[] { 2,1,2,4,2,4,3,3 })));
	}

	public int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		int total = stages.length;

		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < total; i++) {
			hm.put(stages[i], hm.getOrDefault(stages[i], 0) + 1);
		}
		System.out.println(hm);

		double[] rates = new double[N];
		int failer = 0;
		for (int i = 0; i < N; i++) {
			failer = hm.getOrDefault(i + 1, 0);
			if(total == 0) {
				rates[i] = 0;
			}
			else {
				rates[i] = (double)failer / total;	
			}
			total -= failer;
			System.out.println(Arrays.toString(rates));
		}

		for (int i = 0; i < answer.length; i++) {
			answer[i] = 1;
			for (int j = 0; j < answer.length; j++) {
				if (i == j)
					continue;
				if (rates[i] < rates[j]) {
					answer[i]++;
				} else if (rates[i] == rates[j] && i > j) {
					answer[i]++;
				}

//				System.out.println(Arrays.toString(answer));
			}
		}

		int[] answer2 = new int[N];
		for (int i = 0; i < answer2.length; i++) {
			answer2[answer[i] - 1] = i + 1;
//			System.out.println(Arrays.toString(answer2));
		}

		return answer2;
	}
}
