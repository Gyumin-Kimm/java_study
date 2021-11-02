package codingtest_practice.Hash;

import java.util.HashMap;
import java.util.Map;

public class putNumberMatrix {
	public int[] solution(int n, int jump) {
		int[] answer = {};
		Map<Map<Integer, Integer>, Integer> hm = new HashMap<>();
		int[][] mx = new int[n][n];
		int x = 0;
		int y = 0;
		mx[0][0] = 1;

		for (int i = 2; i < n * n + 1; i++) {
			for (int j = 0; j < jump; j++) {
				
			}
		}

		return answer;
	}

	private Map<Integer, Integer> getMap(int a, int b) {
		Map<Integer, Integer> m = new HashMap<>();
		m.put(a, b);
		return m;
	}
}
