package java_Test;

import java.util.Scanner;

public class github_connect {

	public static void main(String[] args) {
		boolean isLoop = true;
		Scanner scanner = new Scanner(System.in);
		
		while(isLoop) {
			System.out.print("input the value : ");

			String val = scanner.nextLine();
			System.out.println(val);
			
			System.out.print("input the value2 : ");
			String val2 = scanner.nextLine();
			System.out.println(val2);
			
			if(val.equals("q")) {
				isLoop = false;
			}
		}
		
		
	}

}
