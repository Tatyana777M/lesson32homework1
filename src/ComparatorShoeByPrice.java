import java.util.Comparator;
/* Andrey, tell me please,can I use this type of notation?
 I found on internet that for Double it must be like this,
 but when I try to write "return"as you showed in the lesson,
 Idea requires me to change double to int in yhe brackets.
 */
public class ComparatorShoeByPrice implements Comparator<Shoe> {
    public int compare(Shoe s1, Shoe s2) {
        return Double.compare(s1.price, s2.price);
    }
}
