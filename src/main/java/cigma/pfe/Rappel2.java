package cigma.pfe;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Point{
    double x;
    double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

public class Rappel2 {
    public static void main(String[] args) {
        Set<Point> l = new TreeSet<>((p1,p2)->(int) (p1.x-p2.x));
        l.add(new Point(12.5,13));
        l.add(new Point(14.4,15));
        l.add(new Point(12.50,15));
        l.add(new Point(11.50,15));
        l.forEach(i-> System.out.println(i));
    }
}
