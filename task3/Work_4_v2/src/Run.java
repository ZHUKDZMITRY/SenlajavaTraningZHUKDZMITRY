public class Run {

	public static void main(String[] args) {
		LibraryService libraryService = new LibraryService();
		
		// a) Add books
		libraryService.addBook("Book 1");
		libraryService.addBook("Book 2");
		libraryService.addBook("Book 3");
		libraryService.addBook("Book 4");
		libraryService.addBook("Book 5");
		libraryService.addBook("Book 6");
		libraryService.addBook("Book 7");
		libraryService.addBook("Book 8");
		libraryService.addBook("Book 9");
		libraryService.addBook("Book 10");
		
		// b) Add readers
		libraryService.addReader("Reader 1", 10);
		libraryService.addReader("Reader 2", 10);
		libraryService.addReader("Reader 3", 10);
		libraryService.addReader("Reader 4", 10);
		libraryService.addReader("Reader 5", 10);
		
		// c.1) Taking books by readers
		libraryService.takeBook(1, 1);
		libraryService.takeBook(2, 1);
		
		libraryService.takeBook(3, 2);
		libraryService.takeBook(4, 2);
		
		// c.2) Giving books by readers
		libraryService.giveBook(4, 2);
		
		// d) Getting taken books from the reader
		showLinyByLine("Books from reader: ", libraryService.getBooksByReaderId(2));
		
		// e) Getting of reader for taken book 
		System.out.println("\nReader for book 3: " + libraryService.getReaderByBookId(3));
		
		// f) Getting of all books 
		showLinyByLine("\nAll library books:", libraryService.getBooks());
		
		// g) Getting of all readers
		showLinyByLine("\nAll readers:", libraryService.getReaders());
	}
	
	private static void showLinyByLine(String title, Object[] objects) {
		System.out.println(title);
		for (Object object : objects) {
			System.out.println(object);
		}
	}
}
