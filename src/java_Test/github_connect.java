package java_Test;

import java.util.Scanner;

public class github_connect {

	public static void main(String[] args) {
		int day = 0;
		int month;
		
		Scanner scanner = new Scanner(System.in);
		
		month = scanner.nextInt();
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
			
		case 2:
			day = 28;
			break;
		default:
			System.out.println("input month Error");
			day = 0;
			break;
		}
		
		System.out.println(day);

	}

}
