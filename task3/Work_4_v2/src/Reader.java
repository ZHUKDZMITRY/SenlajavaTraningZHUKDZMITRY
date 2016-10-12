public class Reader {

	private long id;
	private String fullName;
	private Book[] books;

	public Reader(int maxBooksCount) {
		this.books = new Book[maxBooksCount];
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return fullName;
	}
	
}
