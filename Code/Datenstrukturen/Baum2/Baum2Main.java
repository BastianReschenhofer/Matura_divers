package Code.Datenstrukturen.Baum2;

public class Baum2Main {
    public static void main(String[] args) {
    Baum2 b = new Baum2();

    int[] values = {15, 7, 21, 27, 18, 2, 10, 9, 1, 4, 12, 30, 16, 19, 24};

    for (int v : values) {
        b.insert(v);
    }

    System.out.println("Count: " + b.count());
    System.out.println("Height: " + b.height());

    System.out.println("Includes 10: " + b.includes(10));
    System.out.println("Includes 99: " + b.includes(99));

    System.out.println("Max: " + b.max().getValue());

    System.out.println("Delete 9: " + b.delet(9).getValue());
    System.out.println("Delete 7: " + b.delet(7).getValue());
    System.out.println("Delete 15: " + b.delet(15).getValue());

    System.out.println("Count after delete: " + b.count());
    System.out.println("Height after delete: " + b.height());
}
}
