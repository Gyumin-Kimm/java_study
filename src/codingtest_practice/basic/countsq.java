package codingtest_practice.basic;

import java.math.BigInteger;

public class countsq {

	public static void main(String[] args) {
		countsq cs = new countsq();
		System.out.println(cs.solution(8, 12));
	}

	public long solution(int w, int h) {
		long totalCount = (long) w * (long) h;
		long diagonalCount = w + h - BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).longValue();

		return totalCount - diagonalCount;
	}

}
