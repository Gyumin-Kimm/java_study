package fastcampuswork.decorate;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee americano = new KenyaBean();
		americano.brewing();
		
		System.out.println();
		
		Coffee latte = new Latte(new KenyaBean());
		latte.brewing();
	}

}
