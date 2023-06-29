import java.util.*;

public class Book implements Comparable<Book> {
    private String bookName;
    private int pageCount;
    private String authorName;
    private String publicationDate;

    public Book(String bookName, int pageCount, String authorName, String publicationDate) {
        this.bookName = bookName;
        this.pageCount = pageCount;
        this.authorName = authorName;
        this.publicationDate = publicationDate;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    @Override
    public int compareTo(Book otherBook) {
        return this.bookName.compareTo(otherBook.bookName);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", pageCount=" + pageCount +
                ", authorName='" + authorName + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Set<Book> bookSetByName = new TreeSet<>();
        bookSetByName.add(new Book("Java Programming", 500, "John Smith", "2020-01-01"));
        bookSetByName.add(new Book("Python Basics", 300, "Jane Doe", "2019-05-10"));
        bookSetByName.add(new Book("Algorithms and Data Structures", 700, "Alice Johnson", "2021-03-15"));
        bookSetByName.add(new Book("Web Development 101", 400, "Bob Williams", "2018-11-30"));
        bookSetByName.add(new Book("Introduction to Artificial Intelligence", 600, "Emily Brown", "2022-07-20"));

        System.out.println("Books sorted by name:");
        for (Book book : bookSetByName) {
            System.out.println(book);
        }

        Set<Book> bookSetByPageCount = new TreeSet<>(Comparator.comparingInt(Book::getPageCount));
        bookSetByPageCount.addAll(bookSetByName);

        System.out.println("\nBooks sorted by page count:");
        for (Book book : bookSetByPageCount) {
            System.out.println(book);
        }
    }
}
