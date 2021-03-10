package fastcampuswork;

/*
* The hierarchy of the type A is inconsistent
* Cycle detected: a cycle exists in the type hierarchy between B and A
* 
* 상속은 상위 클래스의 변수와 메서드를 물려받아 사용하는 것으로 
* 상속된 클래스가 상위 클래스를 상속하는것은 위와 같은 오류를 발생시킨다.
* 아래와 같은 상황에서는 B가 상위 클래스이며 A가 B를 상속 받은것이다.
* 따라서 A클래스를 선언하고 B의 method를 사용하는 것을 확인 할 수 있다. 
*/
class A extends B
{
	void a_func() {}
}

class B //extends A
{
	void b_func() {}
}

public class ABTest {
	
	public static void main(String[] args) {
		A a = new A();
		a.a_func();	// A method
		a.b_func(); // B method
		
		B b = new B();
		b.b_func(); // B method
		//b.a_func(); error
	}

}