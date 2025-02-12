import java.util.Comparator;

class PriceComparator implements Comparator<Shoe> {
    public int compare(Shoe s1, Shoe s2) {
        return Double.compare(s1.price, s2.price);
    }
}
class SizeComparator implements Comparator<Shoe> {
    public int compare(Shoe s1, Shoe s2) {
        return Double.compare(s1.size, s2.size);
    }
}
class RatingComparator implements Comparator<Shoe> {
    public int compare(Shoe s1, Shoe s2) {
        return Double.compare(s1.rating, s2.rating);
    }
}
class StockComparator implements Comparator<Shoe> {
    public int compare(Shoe s1, Shoe s2) {
        return Double.compare(s1.stock, s2.stock);
    }
}
class NameComparator implements Comparator<Shoe> {
    public int compare(Shoe s1, Shoe s2) {
        return s1.name.compareTo(s2.name);
    }
}
class ComparatorShoeName implements Comparator<Shoe> {
    @Override
    public int compare(Shoe s1, Shoe s2) {
        int compare = s1.getName().compareToIgnoreCase(s2.getName());

            return compare;

    }
}


