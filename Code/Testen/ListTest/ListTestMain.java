package Code.Testen.ListTest;

public class ListTestMain {

    public static void main(String[] args) {
        // Erstellung einer Liste für Strings
        LinkedList<String> namen = new LinkedList<>();

        // Test: Elemente hinzufügen
        namen.append("Max");
        namen.append("Susi");
        namen.prepend("Anna"); // Anna sollte nun am Anfang stehen

        System.out.println("Liste nach dem Hinzufügen: " + namen.toString());
        System.out.println("Anzahl der Elemente: " + namen.count());

        // Test: Ein Element an einem bestimmten Index abrufen
        System.out.println("Element an Index 1: " + namen.get(1));

        // Test: Löschen des ersten Elements (Index 0)
        namen.delete(0);
        System.out.println("Nach Löschen von Index 0: " + namen.toString());

        // Test: Löschen in der Mitte oder am Ende
        namen.append("Lukas");
        System.out.println("Vor dem Löschen von Lukas: " + namen.toString());
        namen.delete(2); // Löscht das letzte Element
        System.out.println("Nach dem Löschen von Index 2: " + namen.toString());

        // Test mit einem anderen Datentyp (Integer)
        LinkedList<Integer> zahlen = new LinkedList<>();
        zahlen.append(10);
        zahlen.append(20);
        System.out.println("Zahlen-Liste: " + zahlen.toString());
    }
}
