package findallabexamination2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ReferenceBook extends Book {

    private double tax;

    public ReferenceBook(String bookID, String publisher, Date entryDate, double unitPrice, double quanity) {
        super(bookID, publisher, entryDate, unitPrice, quanity);
    }

    public ReferenceBook() {
    }

    public ReferenceBook(double tax, String bookID, String publisher, Date entryDate, double unitPrice, double quanity) {
        super(bookID, publisher, entryDate, unitPrice, quanity);
        this.tax = tax;
    }

    public ReferenceBook(double tax) {
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
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
        System.out.print("Enter tax:");
        double tax = keyboard.nextDouble();
        setTax(tax);
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
        System.out.print("Enter tax:");
        double tax = keyboard.nextDouble();
        setTax(tax);
    }

    @Override
    public void displayBook() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Book:"+getBookID()+" ,publisher:"+getPublisher()+" ,entry Date:"+sdf.format(getEntryDate()));
        System.out.println("Price:"+getUnitPrice()+" ,quanity:"+getQuanity()+" ,tax:"+getTax());
        
    }

    @Override
    public double caculateDiscount() {
        
        return getQuanity()*getUnitPrice()*0.05;
    }

    @Override
    public double calculateTotal() {
        return getQuanity()*getUnitPrice()+getTax()-caculateDiscount();
    }

}
