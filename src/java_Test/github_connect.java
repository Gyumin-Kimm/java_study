package java_Test;

import java.util.Scanner;

public class github_connect {

	public static void main(String[] args) {

		char op = '/';
		int num1 = 10;
		int num2 = 5;
		
		//switch
		switch(op) {
		case '+':
			System.out.println(num1+num2);
			break;
		case '-':
			System.out.println(num1-num2);
			break;
		case '*':
			System.out.println(num1*num2);
			break;
		case '/':
			if(num2 == 0) {
				System.out.println("cannot divide zero");
			}
			else {
				System.out.println(num1/num2);
			}
			break;
		default:
			break;
		}
		
//		//if-else
		if(op == '+') {
			System.out.println(num1+num2);
		}
		else if(op == '-') {
			System.out.println(num1-num2);
		}
		else if(op == '*') {
			System.out.println(num1*num2);
		}
		else if(op == '/') {
			if(num2 == 0) {
				System.out.println("cannot divide zero");
			}
			else {
				System.out.println(num1/num2);
			}
		}
	}

}
