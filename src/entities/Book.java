package entities;

public class Book {
    private String bookCode;
    private int totalOfExemplary;
    private String bookName;

    public Book(String bookCode, int totalOfExemplary, String bookName) {
        this.bookCode = bookCode;
        this.totalOfExemplary = totalOfExemplary;
        this.bookName = bookName;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public int getTotalOfExemplary() {
        return totalOfExemplary;
    }

    public void setTotalOfExemplary(int totalOfExemplary) {
        this.totalOfExemplary = totalOfExemplary;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
