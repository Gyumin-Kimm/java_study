package codingtest_practice.heap;

import java.util.PriorityQueue;

public class diskController {
	public int solution(int[][] jobs) {
		int answer = 0;
		int job = jobs.length;
		int time = 0;
		int execute = 0;
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

		while (job != 0) {
			for (int i = 0; i < jobs.length; i++) {
				if (time == jobs[i][0]) {
					queue.add(jobs[i][1]);
				}
			}
			if (execute <= 0 && !queue.isEmpty()) {
				job = job - 1;
				execute = queue.poll();
				answer = answer + execute;
			}
			time = time + 1;
			execute = execute - 1;
			answer = answer + queue.size();
			
			System.out.println("job="+job+",execute="+execute+",time="+time+",queue(peek)="+queue.peek());
		}
		answer = answer / jobs.length;
		return answer;
	}
}

