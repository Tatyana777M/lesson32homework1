import java.util.Comparator;
     public class ComparatorShoeByName implements Comparator<Shoe> {
        @Override
        public int compare(Shoe s1, Shoe s2) {
            return s1.getName().compareToIgnoreCase(s2.getName());
        }
    }
