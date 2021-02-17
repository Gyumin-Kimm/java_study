package codingtest_practice;

import java.util.Arrays;

public class excute {

	public static void main(String[] args) {
		
		failRunner fr = new failRunner();
		
//		String[] p = {"leo", "kiki", "eden"};
//		String[] q = {"eden", "kiki"};

		String[] p = {"mislav", "stanko", "mislav", "ana"};
		String[] q = {"stanko", "ana", "mislav"};
		
		System.out.println(fr.solution(p, q));
		
		dayoftheweek dw = new dayoftheweek();
		System.out.println(dw.solution(5, 24));
		
		int[] a = {1, 5, 2, 6, 3, 7, 4};
		int[][] b = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		numberKth nk = new numberKth();
		System.out.println(Arrays.toString(nk.solution(a, b)));
		

	}

}
