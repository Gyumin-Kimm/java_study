package codingtest_practice.greedy;

import java.util.stream.IntStream;

public class lottoBestWorst {
	public int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];
		int count = 0;
		int zcnt = 0;

		for (int i : lottos) {
			if (i == 0) {
				zcnt++;
			} else {
				if (IntStream.of(win_nums).anyMatch(x -> x == i)) {
					count++;
				}
			}
		}

		int[] rank = { 6, 6, 5, 4, 3, 2, 1 };

		System.out.println(count + "," + zcnt);
		answer[0] = rank[count + zcnt];
		answer[1] = rank[count];

		return answer;
	}
}
