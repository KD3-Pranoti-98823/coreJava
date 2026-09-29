package que;


public class Book {
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;
	
	public Book(String isbn,double price,String authorName,int quantity) {
		this.isbn=isbn;
		this.price=price;
		this.authorName=authorName;
		this.quantity=quantity;
	}
	 @Override
	    public String toString() {
	        return "Book [isbn=" + isbn
	                + ", price=" + price
	                + ", authorName=" + authorName
	                + ", quantity=" + quantity + "]";
	    }
	
}
