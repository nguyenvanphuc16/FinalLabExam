package findallabexamination2;

import java.util.Scanner;

public class Proccesor {

    public static void main(String[] args) {
        BookList booklist = new BookList();
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.println("==Menu==");
            System.out.println("1. Add new text book");
            System.out.println("2. Add new reference book");
            System.out.println("3. Update book by id");
            System.out.println("4. Delete book by id");
            System.out.println("5. Find book by id");
            System.out.println("6. Display all books");
            System.out.println("7. Display total amount");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = keyboard.nextInt();
            keyboard.nextLine();
            switch (choice) {
                case 1:
                    TextBook tb = new TextBook();
                    tb.addBook();
                    booklist.addBook(tb);
                    break;
                case 2:
                    ReferenceBook rb = new ReferenceBook();
                    rb.addBook();
                    booklist.addBook(rb);
                    break;
                case 3:
                    System.out.print("Enter id need to update:");
                    String id = keyboard.nextLine();
                    booklist.updateBookById(id);
                    break;
                case 4:
                    System.out.print("Enter id need to delete:");
                    String iddl = keyboard.nextLine();
                   
                    booklist.deleteBookById(iddl);
                    break;
                case 5:
                    System.out.print("Enter id need to find:");
                    String idfind = keyboard.nextLine();
                    booklist.findBookById(idfind);
                    break;
                case 6:
                    System.out.println("Book List:");
                    booklist.displayAllBooks();
                    break;
                case 7:
                    System.out.print("Total amount:" + booklist.calculateTotalAmount());
                    break;
                case 8:
                    System.exit(0);
                    break;

            }

        }
    }}
