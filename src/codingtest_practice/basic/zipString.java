package codingtest_practice.basic;

public class zipString {

	public static void main(String[] args) {
		String zs1 = "aabbaccc";// 7
		String zs2 = "ababcdcdababcdcd";// 9
		String zs3 = "abcabcdede";// 8
		String zs4 = "abcabcabcabcdededededede";// 14
		String zs5 = "xababcdcdababcdcd";// 17

		zipString zs = new zipString();
		System.out.println(zs.solution(zs1));
		System.out.println(zs.solution(zs2));
		System.out.println(zs.solution(zs3));
		System.out.println(zs.solution(zs4));
		System.out.println(zs.solution(zs5));
	}

	public int solution(String s) {
		int answer = Integer.MAX_VALUE;

        //5번 테스트케이스 실패
        //실패했을때 : i < s.length()
        //성공 : i<=s.length()
        for(int i=1; i<=s.length(); i++){
            String str = encoding(s, i, answer);
            if(str != null)
                answer = Math.min(answer, str.length());
        }

        return answer;
    }

    String encoding(String s, int slice, int max){ 
        StringBuilder sb = new StringBuilder();
        String prev = "";
        int cnt = 0;
        int idx = 0; 

        while(idx+slice <= s.length()){
            String cur = s.substring(idx, idx+slice);

            if(prev.compareTo(cur) != 0){
                if(prev.compareTo("") != 0){
                    if(cnt != 1)    sb.append(cnt);
                    sb.append(prev);
                }

                prev = cur;
                cnt = 1;
            }else{
                cnt++;
            }
            idx += slice;

            //길이가 최대길이보다 길다면 더 볼 필요는 없다
            if(sb.length() >= max)
                return null;
        }
        //마지막에 남은 문자열 붙이기
        if(idx <= s.length()){
            if(cnt != 1)
                sb.append(cnt+prev+s.substring(idx));
            else
                sb.append(prev+s.substring(idx));
        }

        return sb.toString();
	}
}
