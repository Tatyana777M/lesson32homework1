import java.util.Comparator;

public class ComparatorShoeBySize implements Comparator<Shoe> {
    public int compare(Shoe s1, Shoe s2) {
        return (int) (s1.getSize()- s2.getSize());
    }
}
