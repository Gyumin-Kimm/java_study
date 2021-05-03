package fastcampuswork;

import java.util.stream.IntStream;

class Object_test implements Cloneable{

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}

//class Class_test extends Class{
//	
//}

public class ObjectTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Object_test o1 = new Object_test();
		try {
			Object_test o2 = (Object_test) o1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		Class cls = Class.forName("fastcampuswork.object_test");
		
//		Object_test o3 = (Object_test) cls.newInstance();
		
		IntStream stream = IntStream.of(7,5,5,2,1,2,3,5,4,6);
		int sum = stream.skip(2).limit(5).sorted().filter(e-> e%2==0).sum();
		System.out.println(sum);
		
		
	}

}
