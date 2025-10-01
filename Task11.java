public class Task11 {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "John Smith", 2021, 39.99);
        Book book2 = new Book("Python Basics", "Jane Doe", 2020, 29.99);
        Book book3 = new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);

        System.out.println("Book 1:\nTitle: " + book1.title + "\nAuthor: " +
                book1.author + "\nYear Published: "
                + book1.yearPublished + "\nPrice: " + book1.price);
        System.out.println();
        System.out.println("Book 2:\nTitle: " + book2.title + "\nAuthor: " +
                book2.author + "\nYear Published: "
                + book2.yearPublished + "\nPrice: " + book2.price);
        System.out.println();
        System.out.println("Book 3:\nTitle: " + book3.title + "\nAuthor: " +
                book3.author + "\nYear Published: "
                + book3.yearPublished + "\nPrice: " + book3.price);

        System.out.println();

        Book[] bookArray = new Book[] { book1, book2, book3 };
        for (int i = 0; i < bookArray.length; i++) {
            System.out
                    .println("Book " + (i + 1) + ":\nTitle: " + bookArray[i].title + "\nAuthor: " + bookArray[i].author
                            + "\nYear Published: " + bookArray[i].yearPublished + "\nPrice :" + bookArray[i].price);
            System.out.println();
        }
    }
}

class Book {
    String title;
    String author;
    int yearPublished;
    double price;

    public Book(String bookTitle, String bookAuthor, int bookYearPublished, double bookPrice) {
        this.title = bookTitle;
        this.author = bookAuthor;
        this.yearPublished = bookYearPublished;
        this.price = bookPrice;
    }
}