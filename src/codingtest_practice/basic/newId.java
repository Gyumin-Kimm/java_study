package codingtest_practice.basic;

public class newId {
	public String solution(String new_id) {
		String answer = "";

		// 1. 소문자치환
		answer = new_id.toLowerCase();

		// 2. 특정문자 제외 제거
		answer = answer.replaceAll("[^a-z0-9-_.]", "");

		// 3. .. > .
		answer = answer.replaceAll("[.]{2,}", ".");

		// 4. 첫문자, 끝문자가 .이면 제거
		answer = answer.replaceAll("^[.]|[.]$", "");

		// 5. 빈문자열이면 a 대입
		if (answer.length() == 0) {
			answer = "a";
		}

		// 6. 16자리 이상인경우 15자리만 남기고 제거
		if (answer.length() > 15) {
			answer = answer.substring(0, 15);
			answer = answer.replaceAll("[.]$", "");
		}
		
		while (answer.length() < 3) {
			answer = answer + answer.charAt(answer.length()-1);
		}

		return answer;
	}
}
