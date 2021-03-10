package fastcampuswork.sort;

public class BubbleSort implements Sort{

	@Override
	public void ascending(int[] a) {
		System.out.println("BubbleSort ascending");
	}

	@Override
	public void descending(int[] a) {
		System.out.println("BubbleSort descending");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("BubbleSort입니다.");
	}

}
