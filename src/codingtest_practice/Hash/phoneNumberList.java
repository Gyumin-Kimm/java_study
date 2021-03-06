package codingtest_practice.Hash;

import java.util.Arrays;
import java.util.Comparator;

public class phoneNumberList {
	public boolean solution(String[] phone_book) {
		boolean answer = true;
		int len = 0;

		Arrays.sort(phone_book);
		
//		System.out.println(Arrays.toString(phone_book));

		for (int i = 0; i < phone_book.length-1; i++) {
			for (int j = i + 1; j < phone_book.length; j++) {
				len = phone_book[i].length() < phone_book[j].length() ? phone_book[i].length() : phone_book[j].length();
				if(phone_book[i].substring(0,len).compareTo(phone_book[j].substring(0,len)) == 0){ 
					System.out.println("i="+phone_book[i]+",j="+phone_book[j]);
					answer = false;
					break;
				}
			if(!answer) break;
			}
		}

		return answer;
	}
}
