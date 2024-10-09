
package findallabexamination2;

import java.util.Date;


public abstract class Book implements IBook{
       private String bookID;
       private String publisher;
       private Date entryDate;
       private double unitPrice,quanity;

    public Book(String bookID, String publisher, Date entryDate, double unitPrice, double quanity) {
        this.bookID = bookID;
        this.publisher = publisher;
        this.entryDate = entryDate;
        this.unitPrice = unitPrice;
        this.quanity = quanity;
    }

    public Book() {
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getQuanity() {
        return quanity;
    }

    public void setQuanity(double quanity) {
        this.quanity = quanity;
    }
    public abstract void addBook();
    public abstract void updateBook(String id);
    public abstract void displayBook();
    public abstract double caculateDiscount();
    
}
