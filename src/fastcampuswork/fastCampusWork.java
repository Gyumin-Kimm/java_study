package fastcampuswork;

import java.util.Scanner;

public class fastCampusWork {

	public static void main(String[] args) {
		CardCompany company = CardCompany.getInstance();
		
		Card myCard = company.createCard();
		Card yourCard = company.createCard();
		
		System.out.println(myCard.getCardNumber());
		System.out.println(yourCard.getCardNumber());
		
//		MyDate md = new MyDate(30, 12, 2020);
//		System.out.println(md.isValid());
		
//		Student sd = new Student(33003, "Kim", "Inchoen");
//		sd.showStudentInfo();
		
//		printMaxMinValue();
//		print_dia();
//		ifelseswitch_func();
	}
	
	public static void printMaxMinValue() {
		System.out.println("int max value : " + Integer.MAX_VALUE);
		System.out.println("int min value : " + Integer.MIN_VALUE);
		System.out.println("long max value : " + Long.MAX_VALUE);
		System.out.println("long min value : " + Long.MIN_VALUE);
	}

	public static void print_dia() {
		Scanner sc = new Scanner(System.in);

		System.out.print("홀수 숫자 입력 : ");
		int line = sc.nextInt();
		int space = line / 2 + 1;
		int star = 1;
		
		sc.close();

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

	public static void ifelseswitch_func() {
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
