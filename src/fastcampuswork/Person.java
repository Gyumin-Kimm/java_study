package fastcampuswork;

public class Person {
	int age;
	String name;
	boolean isMarried;
	int numberOfChildren;
	
	public void printMyChildren() {
		if(isMarried) {
			System.out.println("나는 기혼이고 자녀는 " + numberOfChildren + "명입니다.");
		}
		else {
			System.out.println("나는 미혼입니다.");
		}
	}
}
