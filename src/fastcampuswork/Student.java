package fastcampuswork;

public class Student {
	
	public int studentID;
	public String studentName;
	public String address;
	
	public Student(int studentID, String studentName, String address) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.address = address;
	}
	
	public void showStudentInfo() {
		System.out.println(this.studentName + ", " + this.address);
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
