package learning.designpattern.creational.prototype;

public class Book {
	private int bId;
	private String bookName;
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	@Override
	public String toString() {
		return "Book [bId=" + bId + ", bookName=" + bookName + "]";
	}
	public Book(int bId, String bookName) {
		super();
		this.bId = bId;
		this.bookName = bookName;
	}
}
