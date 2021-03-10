package fastcampuswork;

public abstract class Coffee {
	//서브 클래스 구현 메소드
	abstract void boilWater();
	abstract void brew();
	abstract void pourInCup();
	
	//final 선언으로 Override 불가
	final public void create() {
		boilWater();
		brew();
		pourInCup();
	}
}
