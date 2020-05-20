package book;

public class book {
	private int bookId;
	private String bookname;
	private double bookprice;
	public book(int bookId, String bookname, double bookprice) {
		super();
		this.bookId = bookId;
		this.bookname = bookname;
		this.bookprice = bookprice;
	}
	public book(){
	
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public double getBookprice() {
		return bookprice;
	}
	public void setBookprice(double bookprice) {
		this.bookprice = bookprice;
	}
	

}
