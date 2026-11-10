

class Library {
    int booksAvailable;
    static String libraryName = "Central Library";

    void issueBook(int quantity) {
        int issue = quantity;

        if (issue > 0 && issue <= booksAvailable) {
            booksAvailable -= issue;
            System.out.println(issue + " Books Issued Successfully");
        } else {
            System.out.println("Books Not Available");
        }

        System.out.println("Available Books: " + booksAvailable);
    }

    void returnBook(int quantity) {
        int returned = quantity;

        if (returned > 0) {
            booksAvailable += returned;
            System.out.println(returned + " Books Returned Successfully");
        } else {
            System.out.println("Invalid Return Quantity");
        }

        System.out.println("Available Books: " + booksAvailable);
    }
}

public class Q30 {
    public static void main(String[] args) {
        Library l = new Library();

        l.booksAvailable = 100;

        System.out.println("Library: " + Library.libraryName);

        l.issueBook(10);
        l.returnBook(5);
    }
}
