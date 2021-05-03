package codingtest_practice;

import java.util.Arrays;

import codingtest_practice.Hash.phoneNumberList;
import codingtest_practice.basic.cpTest;
import codingtest_practice.basic.dailyEvent;
import codingtest_practice.basic.giftCard;
import codingtest_practice.basic.robotMake;
import codingtest_practice.basic.train;
import codingtest_practice.greedy.makeBigNumber;
import codingtest_practice.heap.diskController;
import codingtest_practice.heap.moreSpicy;

public class excute {

	public static void main(String[] args) {
		dailyEvent de = new dailyEvent();
		int[] de1 = {5, 1, 9, 8, 10, 5};
		int[] de2 = {10, 1, 10, 1, 1, 4, 3, 10};
		System.out.println(de.solution(de1,3));
		System.out.println("----------------");
		System.out.println(de.solution(de2,6));
		
//		giftCard gc = new giftCard();
//		int[] gc1 = {4, 5, 3, 2, 1};
//		int[] gc11 = {2, 4, 4, 5, 1};
//		int[] gc2 = {5, 4, 5, 4, 5};
//		int[] gc22 = {1, 2, 3, 5, 4};
//		System.out.println(gc.solution(gc1,gc11));
//		System.out.println("----------------");
//		System.out.println(gc.solution(gc2,gc22));
//		System.out.println("----------------");
		
//		robotMake rm = new robotMake();
//		int[][] rm1 = { { 1, 0, 0 }, {1, 1, 0}, {1, 1, 0}, {1, 0, 1}, {1, 1, 0}, {0, 1, 1} };
//		System.out.println(rm.solution(rm1,2));
//		System.out.println("----------------");
		
//		train tn = new train();
//		int[] tn1 = {1,1,1,1,1,1};
//		int[][] tn11 = {{1,2},{1,3},{1,4},{3,5},{3,6}};
//		int[] tn2 = {2,1,2,2};
//		int[][] tn22 = {{1,2},{1,3},{2,4}};
//		int[] tn3 = {1,1,2,3,4};
//		int[][] tn33 = {{1,2},{1,3},{1,4},{1,5}};
//		System.out.println(tn.solution(6,tn1,tn11));
//		System.out.println("----------------");
//		System.out.println(tn.solution(4,tn2,tn22));
//		System.out.println("----------------");
//		System.out.println(tn.solution(5,tn3,tn33));
		
		
//		cpTest ct = new cpTest();
//		int[] ct1 = {1,3,2,4};
//		int[] ct2 = {3,1,2};
//		int[] ct1 = {24,22,20,10,5,3,2,1};
//		int[] ct2 = {1300000000,700000000,668239490,618239490,568239490,568239486,518239486,157658638,157658634,100000000,100};
//		
//		System.out.println(ct.solution2(3,ct1));
//		System.out.println("----------------");
//		System.out.println(ct.solution2(2,ct2));
//		phoneNumberList pnl = new phoneNumberList();
//		String[] pnl1 = {"119", "97674223", "1195524421"};
//		String[] pnl2 = {"123", "456", "789"};
//		String[] pnl3 = {"12", "123", "1235", "567", "88"};
//		System.out.println(pnl.solution(pnl1));
//		System.out.println("--------------------");
//		System.out.println(pnl.solution(pnl2));
//		System.out.println("--------------------");
//		System.out.println(pnl.solution(pnl3));
		
//		diskController dc = new diskController();
//		int[][] dc1 = {{0, 3}, {1, 9}, {2, 6}};
//		int[][] dc2 = {{3, 4}, {1, 10}, {10, 3}};
//		System.out.println(dc.solution(dc1));
//		System.out.println("--------------------");
//		System.out.println(dc.solution(dc2));
		
//		moreSpicy ms = new moreSpicy();
//		int[] ms1 = {1, 2, 3, 9, 10, 12};
//		System.out.println(ms.solution(ms1, 7));
		
//		makeBigNumber mbn = new makeBigNumber();
//		System.out.println(mbn.solution("1924", 2));
//		System.out.println(mbn.solution("1231234", 3));
//		System.out.println(mbn.solution("4177252841", 4));
		
//		String[] gt1 = {"Cardiology", "Orthopaedics", "Neurology", "Cardiology", "Orthopaedics", "Cardiology"};
//		int[] gt1 = {0, 1, 1, 1, 0, 1, 1, 1, 0, 1};
		
//		temp gt = new temp();
//		System.out.println(temp.solution(gt1));
//		System.out.println(temp.solution(1,8,3,2));
//		System.out.println(temp.solution(2,3,3,2));
		
//		int[] gt1 = { 1, 3, 2, 4, 2 };
////		int[] gt2 = { 1, 2, 3, 4, 5 };
////		int[] gt3 = { 1, 1, 1, 1, 1, 1, 1, 1, 1,1,1,1,1,1 };
//		guessTest gt = new guessTest();
//		System.out.println(Arrays.toString(gt.solution(gt1)));
////		System.out.println(Arrays.toString(gt.solution(gt2)));
////		System.out.println(Arrays.toString(gt.solution(gt3)));
//		System.out.println("-----------------------");
//
//		centerStr cs = new centerStr();
////		System.out.println(cs.solution("abcde"));
//		System.out.println(cs.solution("qwer"));
//		System.out.println("-----------------------");
//
//		int[] btc1 = { 2, 3, 4 };
//		int[] btc2 = { 1, 3, 5 };
//		borrowTraningClothes btc = new borrowTraningClothes();
//		System.out.println(btc.solution(5, btc1, btc2));
//		System.out.println("-----------------------");
//
//		reverseThree rt = new reverseThree();
//		System.out.println(rt.solution(125));
//		System.out.println("-----------------------");
//
//		int[] a1 = { 2, 1, 3, 4, 1 };
////		int[] a1 = {5, 0, 2, 7};
//		sumListTwoNum sl = new sumListTwoNum();
//		System.out.println(Arrays.toString(sl.solution(a1)));
//		System.out.println("-----------------------");
//
////		int[][] c = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
////		int[] d = {1, 5, 3, 5, 1, 2, 1, 4};
//		int[][] c = { { 0, 2, 0 }, { 1, 2, 0 }, { 2, 2, 1 } };
//		int[] d = { 1, 2, 2, 2, 1, 3 };
//		pickDoll pd = new pickDoll();
//		System.out.println(pd.solution(c, d));
//		System.out.println("-----------------------");
//
//		int[] a = { 1, 5, 2, 6, 3, 7, 4 };
//		int[][] b = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
//		numberKth nk = new numberKth();
//		System.out.println(Arrays.toString(nk.solution(a, b)));
//		System.out.println("-----------------------");
//
//		dayoftheweek dw = new dayoftheweek();
//		System.out.println(dw.solution(5, 24));
//		System.out.println("-----------------------");
//
////		String[] p = {"leo", "kiki", "eden"};
////		String[] q = {"eden", "kiki"};
//		String[] p = { "mislav", "stanko", "mislav", "ana" };
//		String[] q = { "stanko", "ana", "mislav" };
//		failRunner fr = new failRunner();
//		System.out.println(fr.solution(p, q));
//		System.out.println("-----------------------");
	}

}
