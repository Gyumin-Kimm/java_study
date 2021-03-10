package fastcampuswork;

public class 닭 implements Duck {

	@Override
	public void walking() {
		System.out.println("뒤뚱 뒤뚱");
	}

	@Override
	public void flying() {
		System.out.println("호다닭!");
	}
	
	@Override
	public void quack() {
		System.out.println("꼬끼오!");
	}

}
