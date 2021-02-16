package java_Test;

import java.util.Scanner;

public class github_connect {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int val = scanner.nextInt();
		char grade;

		if (val > 100) {
			System.out.println("input error");
			return;
		}

		if (val >= 90) {
			grade = 'A';
		} else if (val >= 80) {
			grade = 'B';
		} else if (val >= 70) {
			grade = 'C';
		} else if (val >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.println("score : " + val + " grade : " + grade);

	}

}
