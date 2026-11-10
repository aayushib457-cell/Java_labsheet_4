

class Book {
    String title, author;
    double price;
    static String publisher = "Oxford";

    void display() {
        String bookTitle = title;
        String bookAuthor = author;
        double bookPrice = price;

        System.out.println("Title: " + bookTitle);
        System.out.println("Author: " + bookAuthor);
        System.out.println("Price: " + bookPrice);
        System.out.println("Publisher: " + publisher);
    }
}

public class Q5 {
    public static void main(String[] args) {
        Book b = new Book();

        b.title = "Java Programming";
        b.author = "James Gosling";
        b.price = 500;

        b.display();
    }
}
