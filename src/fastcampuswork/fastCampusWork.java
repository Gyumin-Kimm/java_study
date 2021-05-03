package fastcampuswork;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.URLEncoder;
import java.util.Scanner;

public class fastCampusWork {

	public static void main(String[] args) {
		try {
			String url = URLEncoder.encode("http://www.fastcampus.co.kr/", "UTF-8");
			System.out.println(url);
		}catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		BufferedReader b1 = new BufferedReader(new InputStreamReader(System.in));
		InputStreamReader b2 = new InputStreamReader(System.in);
		BufferedInputStream b4 = new BufferedInputStream(System.in);
		InputStream a1;
		FileInputStream a2;
		ByteArrayInputStream a3;
		FilterInputStream a4;
		Writer c1;
		FileWriter c2;
		OutputStreamWriter c3;
		BufferedWriter c4;
//		fastCampusWork fcw = new fastCampusWork();
//		Book book = Book.getInstance();
//		
//		System.out.println(book);
		
//		Student Lee = new Student(1001, "Lee");
//		Lee.addBook("태백산맥1", "조정래");
//		Lee.addBook("태백산맥2", "조정래");
//		Student Kim = new Student(1002, "Kim");
//		Kim.addBook("토지1", "박경리");
//		Kim.addBook("토지2", "박경리");
//		Kim.addBook("토지3", "박경리");
//		Student Cho = new Student(1003, "Cho");
//		Cho.addBook("해리포터1", "조앤 롤링");
//		Cho.addBook("해리포터2", "조앤 롤링");
//		Cho.addBook("해리포터3", "조앤 롤링");
//		Cho.addBook("해리포터4", "조앤 롤링");
//		Cho.addBook("해리포터5", "조앤 롤링");
//		Cho.addBook("해리포터6", "조앤 롤링");
//		
//		Lee.showStudentInfo();
//		Kim.showStudentInfo();
//		Cho.showStudentInfo();
		
//		fcw.printArrayChar();
		
//		CardCompany company = CardCompany.getInstance();
//		
//		Card myCard = company.createCard();
//		Card yourCard = company.createCard();
//		
//		System.out.println(myCard.getCardNumber());
//		System.out.println(yourCard.getCardNumber());
		
//		MyDate md = new MyDate(30, 12, 2020);
//		System.out.println(md.isValid());
		
//		Student sd = new Student(33003, "Kim", "Inchoen");
//		sd.showStudentInfo();
		
//		printMaxMinValue();
//		print_dia();
//		ifelseswitch_func();
	}

	public void printArrayChar() {
		char[] chArr = new char[26];
		for (int i = 0, c = 'A'; i < chArr.length; i++, c++) {
			chArr[i] = (char) c;
		}

		System.out.println(chArr);
	}

	public void printMaxMinValue() {
		System.out.println("int max value : " + Integer.MAX_VALUE);
		System.out.println("int min value : " + Integer.MIN_VALUE);
		System.out.println("long max value : " + Long.MAX_VALUE);
		System.out.println("long min value : " + Long.MIN_VALUE);
	}

	public void print_dia() {
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
