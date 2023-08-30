public class Book {
    private String title;
    private boolean rented;

    public Book(String bookTitle) {
        title = bookTitle;
        rented = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isRented() {
        return rented;
    }

    public void borrowed() {
        if (rented) {
            System.out.println("Book is already rented");
        } else {
            rented = true;
            System.out.println("Book has been rented");
        }
    }

    public void returned() {
        if (rented) {
            rented = false;
            System.out.println("Book has been returned");
        } else {
            System.out.println("Book is not rented");
        }
    }

    public static void main(String[] args) {
        Book book = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + book.getTitle());
        System.out.println("Rented? (should be false): " + book.isRented());
        book.borrowed();
        System.out.println("Rented? (should be true): " + book.isRented());
        book.returned();
        System.out.println("Rented? (should be false): " + book.isRented());
    }
}
