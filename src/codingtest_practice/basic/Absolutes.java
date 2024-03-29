package codingtest_practice.basic;

public class Absolutes {

	public static void main(String[] args) {
		Absolutes as = new Absolutes();

		System.out.println(as.solution(new int[] { 4, 7, 12 }, new boolean[] { true, false, true }));
		System.out.println(as.solution(new int[] { 1, 2, 3 }, new boolean[] { false, false, true }));

	}

	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;

		for (int i = 0; i < signs.length; i++) {
			if( signs[i] == false ) {
				answer += -absolutes[i];
			}
			else {
				answer += absolutes[i];
			}
		}

		return answer;
	}
}
