package codingtest_practice.basic;

import java.time.LocalDate;

public class dayoftheweek {
	public String solution(int a, int b) {
//        String answer = "";
//        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
//        int sum_day = 0;
//        
//        for(int i=1; i<a; i++) {
//        	switch(i) {
//        	case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//        		sum_day += 31;
//        		break;
//        	case 4: case 6: case 9: case 11:
//        		sum_day += 30;
//        		break;
//        	case 2:
//        		sum_day += 29;
//        		break;
//        		default:
//        			System.out.println("Month Error!");
//        	}
//        }
//        
//        sum_day = sum_day + b - 1;
//        
//        answer = day[sum_day % 7];
//        
//        return answer;
        
        LocalDate date = LocalDate.of(2016, a, b);
        return date.getDayOfWeek().toString().substring(0, 3);
    }
}
