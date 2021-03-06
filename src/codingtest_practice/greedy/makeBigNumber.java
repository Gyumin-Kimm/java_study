package codingtest_practice.greedy;

public class makeBigNumber {
	public String solution(String number, int k) {
		String s = "";

		for (int i = 0, n = number.length(); i < n; i++) {
			char c = number.charAt(i);
			while (s.length() > 0 && s.charAt(s.length() - 1) < c && k > 0) {
				s = s.substring(0, s.length() - 1);
				k -= 1;
			}

			if (k == 0) {
				s += number.substring(i);
				break;
			}

			s += c;
		}

		if (k > 0) {
			s = s.substring(0, s.length() - k);
		}

		return s;
	}
}
