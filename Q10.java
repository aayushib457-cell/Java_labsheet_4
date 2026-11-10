

class Movie {
    String name, genre;
    double rating;
    static String industry = "Bollywood";

    void display() {
        String movieName = name;
        String movieGenre = genre;
        double movieRating = rating;

        System.out.println("Movie: " + movieName);
        System.out.println("Genre: " + movieGenre);
        System.out.println("Rating: " + movieRating);
        System.out.println("Industry: " + industry);
    }
}

public class Q10 {
    public static void main(String[] args) {
        Movie m = new Movie();

        m.name = "3 Idiots";
        m.genre = "Comedy Drama";
        m.rating = 8.4;

        m.display();
    }
}
