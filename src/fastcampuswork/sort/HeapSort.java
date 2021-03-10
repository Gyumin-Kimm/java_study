package fastcampuswork.sort;

public class HeapSort implements Sort{

	@Override
	public void ascending(int[] a) {
		System.out.println("HeapSort ascending");
	}

	@Override
	public void descending(int[] a) {
		System.out.println("HeapSort descending");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("HeapSort입니다.");
	}

}
