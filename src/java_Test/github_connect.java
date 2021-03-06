package java_Test;

import java.util.ArrayList;
import java.util.Scanner;

public class github_connect {

	public static void main(String[] args) {
		github_connect gc = new github_connect();

		int[] a1 = { 4, 11 };
		int[] a2 = { 9 };
		System.out.println(gc.solution(11, a1, 1));
		System.out.println("---------------------");
		System.out.println(gc.solution(16, a2, 2));
	}

	public int solution(int n, int[] stations, int w) {
		int answer = 0;
		int range = 0;
		boolean flag = false;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < stations.length; i++) {
			arr.add(stations[i]);
		}

		for (int i = 1; i <= n - w; i++) {
			// station check
			for (int j : arr) {
				if (i > j + w)
					continue;

				if (i == j) {
					i += w;
					flag = true;
					break;
				}

				System.out.println("i:"+i+" j:"+j + ", abs:" + Math.abs(j - i) + ", range:" + range);
				if (Math.abs(j - i) <= w) {
					flag = true;
					break;
				}
			}

			if (flag) {
				range = 0;
			}
			else {
				if (range >= w) {
					arr.add(i);
					answer++;
					range = 0;
				}
				else {
					range++;
				}
			}

			flag = false;

			for (int j : arr) {
				System.out.print(j + ",");
			}
			System.out.println();

		}

		return answer;
	}

}
