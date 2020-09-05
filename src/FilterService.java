import java.util.ArrayList;

public class FilterService {
    public ArrayList<Book> filterGenre(ArrayList<Book> books, Genre genre) {
        ArrayList<Book> sorted = new ArrayList<Book>();
        for (Book book : books)
            if (book.getGenre().equals(genre)) {
                sorted.add(book);
            }

        return sorted;
    }

    public ArrayList<Book> filterRating(ArrayList<Book> books, int rating) {
        ArrayList<Book> sorted = new ArrayList<Book>();
        for (Book book : books)
            if (book.getRating() == rating) {
                sorted.add(book);
            }

        return sorted;
    }

    public ArrayList<Book> filterAuthor(ArrayList<Book> books, String author) {
        ArrayList<Book> sorted = new ArrayList<Book>();
        for (Book book : books)
            if (book.getAuthor().equals(author)) {
                sorted.add(book);
            }

        return sorted;
    }

    public ArrayList<Book> filterYear(ArrayList<Book> books, long year) {
        ArrayList<Book> sorted = new ArrayList<Book>();
        for (Book book : books)
            if (book.getYear() == year) {
                sorted.add(book);
            }

        return sorted;
    }

    public void printArray(ArrayList<Book> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.println("Title: " + array.get(i).getTitle());
            System.out.println("Author:" + array.get(i).getAuthor());
            System.out.println("Genre:" + array.get(i).getGenre().toString());
            System.out.println("Year:" + array.get(i).getYear());
            System.out.println("Rating:" + array.get(i).getRating());

        }
    }
}
