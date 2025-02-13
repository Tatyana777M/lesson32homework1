import java.util.Comparator;
import java.util.Objects;

public class Shoe {
    public String name;
    public double price;
    public double size;
    public double rating;
    public int stock;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getSize() {
        return size;
    }

    public double getRating() {
        return rating;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return "Shoe " +
                "name = '" + name + "'" +
                ", price=" + price +
                ", size=" + size +
                ", rating=" + rating +
                ", stock=" + stock ;
    }

    public Shoe(String name, double price, double size, double rating, int stock) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.rating = rating;
        this.stock = stock;


    }
}

