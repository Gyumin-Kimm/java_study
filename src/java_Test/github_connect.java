package java_Test;

import java.util.Scanner;

public class github_connect {

	public static void main(String[] args) {
		github_connect gc = new github_connect();
		gc.print_dia();
		gc.ifelseswitch_func();
	}

	public void print_dia() {
		Scanner sc = new Scanner(System.in);

		System.out.print("홀수 숫자 입력 : ");
		int line = sc.nextInt();
		int space = line / 2 + 1;
		int star = 1;

		for (int i = 0; i < line; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}

			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}

			System.out.println();

			if (i < line / 2) {
				space -= 1;
				star += 2;
			} else {
				space += 1;
				star -= 2;
			}
		}
	}

	public void ifelseswitch_func() {
		char op = '/';
		int num1 = 10;
		int num2 = 5;

		// switch
		switch (op) {
		case '+':
			System.out.println(num1 + num2);
			break;
		case '-':
			System.out.println(num1 - num2);
			break;
		case '*':
			System.out.println(num1 * num2);
			break;
		case '/':
			if (num2 == 0) {
				System.out.println("cannot divide zero");
			} else {
				System.out.println(num1 / num2);
			}
			break;
		default:
			break;
		}

//		//if-else
		if (op == '+') {
			System.out.println(num1 + num2);
		} else if (op == '-') {
			System.out.println(num1 - num2);
		} else if (op == '*') {
			System.out.println(num1 * num2);
		} else if (op == '/') {
			if (num2 == 0) {
				System.out.println("cannot divide zero");
			} else {
				System.out.println(num1 / num2);
			}
		}
	}

}
