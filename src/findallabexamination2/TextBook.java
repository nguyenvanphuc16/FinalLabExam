package findallabexamination2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TextBook extends Book {

    private String status;

    public TextBook(String bookID, String publisher, Date entryDate, double unitPrice, double quanity) {
        super(bookID, publisher, entryDate, unitPrice, quanity);
    }

    public TextBook() {
    }

    public TextBook(String status, String bookID, String publisher, Date entryDate, double unitPrice, double quanity) {
        super(bookID, publisher, entryDate, unitPrice, quanity);
        this.status = status;
    }

    public TextBook(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void addBook() {
        System.out.println("==Enter the book==");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter book's id: ");
        String id = keyboard.nextLine();
        setBookID(id);
        System.out.print("Enter publisher : ");
        String publisher = keyboard.nextLine();
        setPublisher(publisher);
        System.out.print("Enter Date entry:");
        String entrydateString = keyboard.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date entrydate = sdf.parse(entrydateString);
            setEntryDate(entrydate);
        } catch (Exception e) {
            System.out.println("Error Data.");
        }
        System.out.print("Enter price:");
        double price = keyboard.nextDouble();
        setUnitPrice(price);
        keyboard.nextLine();
        System.out.print("Enter quanity:");
        double quanity = keyboard.nextDouble();
        setQuanity(quanity);
        keyboard.nextLine();
        System.out.print("Enter status(new/old):");
        String status = keyboard.nextLine();
        setStatus(status);
    }

    @Override
    public void updateBook(String id) {
        System.out.println("==Update Book==");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter publisher : ");
        String publisher = keyboard.nextLine();
        setPublisher(publisher);
        System.out.print("Enter Date entry:");
        String entrydateString = keyboard.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date entrydate = sdf.parse(entrydateString);
            setEntryDate(entrydate);
        } catch (Exception e) {
            System.out.println("Error Data.");
        }
        System.out.print("Enter price:");
        double price = keyboard.nextDouble();
        setUnitPrice(price);
        keyboard.nextLine();
        System.out.print("Enter quanity:");
        double quanity = keyboard.nextDouble();
        setQuanity(quanity);
        keyboard.nextLine();
        System.out.print("Enter status(new/old):");
        String status = keyboard.nextLine();
        setStatus(status);
    }

    @Override
    public void displayBook() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Book:"+getBookID()+" ,publisher:"+getPublisher()+" ,entry Date:"+sdf.format(getEntryDate()));
        System.out.println("Price:"+getUnitPrice()+" ,quanity:"+getQuanity()+" ,status:"+getStatus());
        
    }

    @Override
    public double caculateDiscount() {
        if(getStatus().equals("new"))
        {
            return getUnitPrice()*getQuanity()*0.1;
        }else if(getStatus().equals("old"))
        {
            return getQuanity()*getUnitPrice()*0.5;
        }
        return 0;
    }

    @Override
    public double calculateTotal() {
        return getQuanity()*getUnitPrice()-caculateDiscount();
    }

}
