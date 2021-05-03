package codingtest_practice.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* 카카오 커머스 신입사원 코테 2번 */
public class robotMake {
	public int solution(int[][] needs, int r) {
		int answer = 0;
		Map<Integer, Integer> tm = new TreeMap<>();

		for (int i = 0; i < needs.length; i++) {
			for (int j = 0; j < needs[i].length; j++) {
				if (needs[i][j] == 1) {
					tm.put(j, tm.getOrDefault(j, 0) + 1);
				}
			}
		}

		System.out.println(tm);
		List<Integer> robot = new ArrayList<>();
		for (int key : tm.keySet()) {
			if (robot.size() >= r) {
				break;
			}
			robot.add(key);
		}

		List<Integer> parts = new ArrayList<>();
		boolean flag = false;
		for (int i = 0; i < needs.length; i++) {
			for (int j = 0; j < needs[i].length; j++) {
				if (needs[i][j] == 1) {
					parts.add(j);
				}
			}

			System.out.println("robot : " + robot);
			System.out.println("parts : " + parts);

			for (int j = 0; j < parts.size(); j++) {
				if(!robot.contains(parts.get(j))) {
					flag = false;
					break;
				}
				else {
					flag = true;
				}
			}

			if(flag)
				answer++;

			parts.clear();
			flag = false;
		}

		return answer;
	}
}
