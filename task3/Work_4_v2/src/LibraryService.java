
public class LibraryService {

	private final static int BOOK_SIZE = 100;
	private final static int READERS_SIZE = 100;
	
	private Library library;
	
	public LibraryService() {
		this.library = new Library(READERS_SIZE, BOOK_SIZE);
	}
	
	public void addBook(String bookName) {
		for (int i = 0; i < library.getBooks().length; i++) {
			if (library.getBooks()[i] == null) {
				Book newBook = new Book();
				newBook.setId(i + 1);
				newBook.setName(bookName);
				newBook.setLibrary(library);
				library.getBooks()[i] = newBook; 
				break;
			}
		}
	}

	public void addReader(String fullName, int maxBooksCount) {
		for (int i = 0; i < library.getReaders().length; i++) {
			if (library.getReaders()[i] == null) {
				Reader newReader = new Reader(maxBooksCount);
				newReader.setId(i + 1);
				newReader.setFullName(fullName);
				library.getReaders()[i] = newReader; 
				break;
			}
		}
	}

	public void takeBook(int bookId, int readerId) {
		Reader reader = getReader(readerId);
		Book book = getBook(bookId);
		for (int i = 0; i < reader.getBooks().length; i++) {
			if (reader.getBooks()[i] == null) {
				reader.getBooks()[i] = book;
				book.setReader(reader);
				break;
			}
		}
	}

	public void giveBook(int bookId, int readerId) {
		Book book = getBook(bookId);
		Reader reader = getReader(readerId);
		for (int i = 0; i < reader.getBooks().length; i++) {
			if (reader.getBooks()[i] != null && reader.getBooks()[i].getId() == bookId) {
				reader.getBooks()[i] = null;
				book.setReader(null);
				break;
			}
		}
	}

	public Book[] getBooksByReaderId(int readerId) {
		Reader reader = getReader(readerId);
		return reader != null ? getNotNullBooks(reader.getBooks()) : new Book[0];
	}

	public Reader getReaderByBookId(int bookId) {
		Book result = getBook(bookId);
		return result != null ? result.getReader() : null;
	}

	public Book[] getBooks() {
		return getNotNullBooks(library.getBooks());
	}

	public Reader[] getReaders() {
		Reader[] result = new Reader[getNotNullCount(library.getReaders())];
		fillResultByNotNull(result, library.getReaders());
		return result;
	}

	//------------------------------------------------------------------------------
	
	private Book[] getNotNullBooks(Book[] books) {
		Book[] result = new Book[getNotNullCount(books)];	
		fillResultByNotNull(result, books);
		return result;
	}
	
	private void fillResultByNotNull(Object[] result, Object[] resource) {
		int i = 0;
		for (Object object : resource) {
			if (object != null) {
				result[i] = object;
				i++;
			}
		}
	}
	
	private int getNotNullCount(Object[] objects) {
		int count = 0;
		for (Object object : objects) {
			if (object != null) {
				count++;
			}
		}
		return count;
	}
	
	private Reader getReader(int readerId) {
		return readerId > 0 && readerId <= library.getReaders().length ? library.getReaders()[readerId - 1] : null;
	}
	
	private Book getBook(int bookId) {
		return bookId > 0 && bookId <= library.getBooks().length ? library.getBooks()[bookId - 1] : null;
	}
}
