public class Library {

	// Storage
	private Reader[] readers;
	private Book[] books;

	public Library(int maxReadersCount, int maxBooksCount) {
		this.readers = new Reader[maxBooksCount];
		this.books = new Book[maxBooksCount];
	}

	public Reader[] getReaders() {
		return readers;
	}

	public void setReaders(Reader[] readers) {
		this.readers = readers;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}

}
