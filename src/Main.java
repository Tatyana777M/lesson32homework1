import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Shoe> shoes = new ArrayList<>();
        shoes.add(new Shoe("Nike Air Max", 90.0, 39, 4.8, 10));
        shoes.add(new Shoe("Adidas Boost", 120.0, 38, 4.7, 15));
        shoes.add(new Shoe("Puma Suede", 80.0, 37, 4.3, 20));
        shoes.add(new Shoe("Reebok Dance", 95.0, 40, 4.9, 5));
        shoes.sort(new ComparatorShoeByName());
        System.out.println("\nInitially our shoes are sorted by name:");
        for (Shoe shoe : shoes) {
            System.out.println(shoe);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chose the way of sorting: ");
        System.out.println("1. by price \n2. by size \n3. by rating \n4. by stock");
        //System.out.println("1. by price");
        int select = scanner.nextInt();
        Comparator comparator;
        switch (select) {
            case 1:
                comparator = new ComparatorShoeByPrice();
                break;
            case 2:
                comparator = new ComparatorShoeBySize();
                break;
            case 3:
                comparator = new ComparatorShoeByRating();
                break;
            default:
                comparator = new ComparatorShoeByStock();
        }
        shoes.sort(new ComparatorShoeByPrice());
        System.out.println("Sort by price:");
        for (Shoe shoe : shoes) {
            System.out.println(shoe.getName() + " - " + shoe.getPrice());
        }
        shoes.sort(new ComparatorShoeBySize());
        System.out.println("\nSort by size:");
        for (Shoe shoe : shoes) {
            System.out.println(shoe.getName() + " - " + shoe.getSize());
        }
        shoes.sort(new ComparatorShoeByRating());
        System.out.println("\nSort by rating:");
        for (Shoe shoe : shoes) {
            System.out.println(shoe.getName() + " - " + shoe.getRating());
        }
        shoes.sort(new ComparatorShoeByStock());
        System.out.println("\nSort by stock:");
        for (Shoe shoe : shoes) {
            System.out.println(shoe.getName() + " - " + shoe.getStock());
        }
        shoes.sort(new ComparatorShoeByName());
        System.out.println("\nSort by name:");
        for (Shoe shoe : shoes) {
            System.out.println(shoe.getName() + " - " + shoe.getRating());
        }

    }
}



