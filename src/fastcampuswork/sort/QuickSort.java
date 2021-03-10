package fastcampuswork.sort;

public class QuickSort implements Sort{

	@Override
	public void ascending(int[] a) {
		System.out.println("QuickSort ascending");
	}

	@Override
	public void descending(int[] a) {
		System.out.println("QuickSort descending");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("QuickSort입니다.");
	}

}
