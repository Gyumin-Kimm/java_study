package java_Test;

import java.util.Scanner;

public class github_connect {

	public static void main(String[] args) {
		github_connect gc = new github_connect();
		
		Tester[] tt1 = new Tester[5];
		Tester[] tt2 = new Tester[5];
		Tester[] tt3 = new Tester[5];
		
		for(int i =0;i<tt1.length;i++) {
			tt1[i] = new Tester(i+1, "Name"+i);
		}
		
		
		System.out.println("tt1=============");
		for(int i =0;i<tt1.length;i++) {
			tt1[i].printTester();
		}
		
		System.arraycopy(tt1, 0, tt2, 0, tt1.length);
		
		System.out.println("tt2=============");
		for(int i =0;i<tt2.length;i++) {
			tt2[i].printTester();
		}
		
//		for(int i =0;i<tt3.length;i++) {
//			tt3[i] = new Tester();
//		}
		
		// 객체 생성을 기본적으로 해주는듯.
		System.arraycopy(tt1, 0, tt3, 0, tt1.length);
//		for(int i =0; i< tt1.length; i++) {
//			tt3[i].testerID = tt1[i].getTesterID();
//			tt3[i].testerName = tt1[i].getTesterName();
//		}
		
		System.out.println("tt3=============");
		for(int i =0;i<tt3.length;i++) {
			tt3[i].printTester();
		}
		
		System.out.println("edit tt1==============================");
		tt1[0].testerID = 10;
		tt1[0].testerName = "editName10";
		
		
		System.out.println("tt1=============");
		for(int i =0;i<tt1.length;i++) {
			tt1[i].printTester();
		}
		
		System.out.println("tt2=============");
		for(int i =0;i<tt2.length;i++) {
			tt2[i].printTester();
		}
		
		System.out.println("tt3=============");
		for(int i =0;i<tt3.length;i++) {
			tt3[i].printTester();
		}
	}

}
