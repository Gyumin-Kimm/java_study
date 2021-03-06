package codingtest_practice.basic;

public class centerStr {
	public String solution(String s) {
		String answer = "";
		int s_len = s.length();

		if (s_len % 2 == 1) {
			answer = s.substring(s_len / 2, s_len / 2 + 1);
		} else {
			answer = s.substring(s_len / 2 - 1, s_len / 2 + 1);
		}

		return answer;
	}
}
