package cigma.pfe;

import java.util.*;

class Laptop{
    double price;
    public Laptop(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Laptop{" +
                "price=" + price +
                '}';
    }

    @Override
    public int hashCode() {
        return (""+this.price).length();
    }
    @Override
    public boolean equals(Object o) {
        return this.price==((Laptop)o).price;
    }
}
public class Rappel {
    public static void main(String[] args) {
        Set<Laptop> l = new HashSet<>();
        l.add(new Laptop(12.000));
        l.add(new Laptop(13.6));
        l.add(new Laptop(12));
        l.add(new Laptop(15.4));
        l.add(new Laptop(13.600));
        l.add(new Laptop(13.60));

        l.forEach(i-> System.out.println(i));
    }
}
