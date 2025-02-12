import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Shoe> shoes = new ArrayList<>();
        shoes.add(new Shoe("Nike Air Max", 90.0, 39, 4.5, 10));
        shoes.add(new Shoe("Adidas Boost", 120.0, 38, 4.7, 15));
        shoes.add(new Shoe("Puma Suede", 80.0, 37, 4.3, 20));
        shoes.add(new Shoe("Reebok Dance", 95.0, 40, 4.0, 5));

        Collections.sort(shoes, new PriceComparator());
        System.out.println("Sort by price:");
        for (Shoe shoe : shoes) {
            System.out.println(shoe.getName() + " - " + shoe.getPrice());
        }

        Collections.sort(shoes, new SizeComparator());
        System.out.println("\nSort by size:");
        for (Shoe shoe : shoes) {
            System.out.println(shoe.getName() + " - " + shoe.getSize());
        }
        Collections.sort(shoes, new RatingComparator());
        System.out.println("Sort by rating:");
        for (Shoe shoe : shoes) {
            System.out.println(shoe.getName() + " - " + shoe.getRating());
        }
        Collections.sort(shoes, new StockComparator());
        System.out.println("Sort by stock:");
        for (Shoe shoe : shoes) {
            System.out.println(shoe.getName() + " - " + shoe.getStock());
        }
        Collections.sort(shoes, new NameComparator());
        System.out.println("\nSort by name:");
        for (Shoe shoe : shoes) {
            System.out.println(shoe.getName() + " - " + shoe.getRating());
        }

        Collections.sort(shoes, new ComparatorShoeName());
        System.out.println("Sorted by name:");
        for (Shoe shoe : shoes) {
            System.out.println(shoe);
        }
    }
}




