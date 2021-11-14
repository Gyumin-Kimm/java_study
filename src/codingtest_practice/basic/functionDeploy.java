package codingtest_practice.basic;

import java.util.ArrayList;
import java.util.List;

public class functionDeploy {
	public int[] solution(int[] progresses, int[] speeds) {
		int count = 0;

		List<Integer> ans = new ArrayList<>();
		List<Integer> arr = new ArrayList<>();
		for (int a : progresses) {
			arr.add(a);
		}
		List<Integer> spd = new ArrayList<>();
		for(int a: speeds) {
			spd.add(a);
		}

		while (arr.size() > 0) {
			for (int i = 0; i < arr.size(); i++) {
				arr.set(i, arr.get(i) + spd.get(i));
			}

			while (arr.size() > 0 && arr.get(0) > 99) {
				System.out.println(arr);
				count++;
				arr.remove(0);
				spd.remove(0);
			}

			if (count > 0) {
				ans.add(count);
				count = 0;
			}

		}

		int[] answer = new int[ans.size()];
		for(int i=0;i<ans.size();i++) {
			answer[i] = ans.get(i);
		}
		return answer;
	}
}
