public class Library {
    private String address;
    private Book[] books;
    private static final String OPENING_HOURS = "9 AM to 5 PM daily";

    public Library(String libraryAddress) {
        address = libraryAddress;
        books = new Book[0];
    }

    public String getAddress() {
        return address;
    }

    public Book[] getBooks() {
        return books;
    }

    public void addBook(Book book) {
        Book[] newBooks = new Book[books.length + 1];
        System.arraycopy(books, 0, newBooks, 0, books.length);
        newBooks[books.length] = book;
        books = newBooks;
    }

    public static String getOpeningHours() {
        return OPENING_HOURS;
    }

    public void printAvailableBooks() {
        System.out.println("Available books:");
        for (Book book : books) {
            if (!book.isRented()) {
                System.out.println(book.getTitle());
            }
        }
    }

    public static void main(String[] args) {
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");
        
        Book book1 = new Book("The Da Vinci Code");
        Book book2 = new Book("Harry Potter and the Philosopher's Stone");
        Book book3 = new Book("The Great Gatsby");
        
        firstLibrary.addBook(book1);
        firstLibrary.addBook(book2);
        secondLibrary.addBook(book3);

        System.out.println("First Library's opening hours: " + getOpeningHours());
        System.out.println("First Library's address: " + firstLibrary.getAddress());
        firstLibrary.printAvailableBooks();

        System.out.println();

        System.out.println("Second Library's opening hours: " + getOpeningHours());
        System.out.println("Second Library's address: " + secondLibrary.getAddress());
        secondLibrary.printAvailableBooks();
    }
}
