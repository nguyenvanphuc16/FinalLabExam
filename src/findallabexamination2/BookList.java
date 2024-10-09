package findallabexamination2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BookList {

    private ArrayList<Book> bookList;

    public BookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    public BookList() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void updateBookById(String id) {
        for (Book book : bookList) {
            if (book.getBookID().equals(id)) {
                book.updateBook(id);
            }
        }
    }

    public void deleteBookById(String id) {
        bookList.removeIf(Book -> Book.getBookID().equals(id));
    }

    public void findBookById(String id) {
        for (Book book : bookList) {
            if (book.getBookID().equals(id)) {
                book.displayBook();
            }
        }
    }

    public double calculateTotalAmount() {
        double total = 0;
        for (Book book : bookList) {
            total = total + book.calculateTotal();
        }
        return total;
    }

    public void displayAllBooks() {
        for (Book book : bookList) {

            book.displayBook();

        }
    }
}
