package java_Test;

public class TMON_test {
	
	public static String convertN(int num, int n) {
		
		StringBuilder sb = new StringBuilder();
		
		if(num == 0) {
			System.out.println(0);
			return "0";
		}
		
		while(num != 0) {
			long remain = num % n;
			
			if(remain > 9) {
				sb.insert(0, (char)(remain + 55));
			} else {
				sb.insert(0, remain);
			}
			
			num /= n;
		}
		
		return sb.toString();
	}
	
	public static int countBits(int number){
		int answer = 0;
		
		while(number != 0) {
			int remain = number % 2;
			
			if( remain == 1) {
				answer++;
			}
			
			number /= 2;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(convertN(800, 16));
		System.out.println(countBits(2));
	}

}
