package fastcampuswork;

public class Book {
	private static Book book = null;
	int id;
	String name;
	
	private Book() {
		
	}
	
	private Book(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public static Book getInstance() {
		if(book == null) {
			book = new Book();
		}
		return book;
	}
	
	public static Book changeInstance(int id, String name) {
		if(book != null) {
			book = null;
		}
		return new Book(id, name);
	}
	
	String bookName;
	String author;
	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
