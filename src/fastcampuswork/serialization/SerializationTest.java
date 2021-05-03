package fastcampuswork.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	String name;
	String job;
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	@Override
	public String toString() {
		return name + ", " + job;
	}
}


public class SerializationTest {

	public static void main(String[] args) {
		Person personLee = new Person("이순신", "엔지니어");
		Person personKim = new Person("김유신", "선생님");
		
		try( FileOutputStream fos = new FileOutputStream("serial.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(personLee);
			oos.writeObject(personKim);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		try( FileInputStream fis = new FileInputStream("serial.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			Object o1 = ois.readObject();
			Object o2 = ois.readObject();
			if( o1 instanceof Person && o2 instanceof Person ) {
				Person p1 = (Person)o1;
				Person p2 = (Person)o2;
				System.out.println(p1);
				System.out.println(p2);
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
