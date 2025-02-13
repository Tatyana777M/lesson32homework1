import java.util.Comparator;

public class ComparatorShoeByRating implements Comparator<Shoe> {
    public int compare(Shoe s1, Shoe s2) {

        return (int) (s1.getRating() - s2.getRating());
    }
}
