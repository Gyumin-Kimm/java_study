package fastcampuswork;

import java.util.ArrayList;

public class Student {

	private int studentID;
	public String studentName;
	ArrayList<Book> books;

	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;

		books = new ArrayList<Book>();
	}

	public void addBook(String bookName, String author) {
		books.add(new Book(bookName, author));
	}

	public void showStudentInfo() {
		String booknames = "";
		for (Book book : books) {
			booknames += book.getBookName() + " ";
		}
		System.out.println(studentName + " 학생이 읽은 책은 : " + booknames + "입니다");

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
}
