package Code.Datenstrukturen.Hashtable;

public class HashTable {
    private static class Node {
        String key;
        int value;
        Node next;

        public Node(String key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }

        public Node(String key) {
        this.key = key;
        this.next = null;
        }
    }

    private Node[] table;
    private int size;

    public HashTable(int capacity) {
        table = new Node[capacity];
        size = 0;
    }

    private int hash(String key) {
        int h = Math.abs(key.hashCode());
        return h % table.length;
    }ch

    public void put(String key, int value) {
        int index = hash(key);
        Node current = table[index];

        while (current != null) {
            if (current.key.equals(key)) {
                current.value = value;
                return;
            }
            current = current.next;
        }

        Node newNode = new Node(key, value);
        newNode.next = table[index];
        table[index] = newNode;
        size++;
    }

    public void put(String key) {
        int index = hash(key);
        Node current = table[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return; // schon da
            }
            current = current.next;
        }

        Node neu = new Node(key);
        neu.next = table[index];
        table[index] = neu;
    }

    public Integer get(String key) {
        int index = hash(key);
        Node current = table[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }

        return null;
    }

    public boolean remove(String key) {
        int index = hash(key);
        Node current = table[index];
        Node prev = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    table[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                return true;
            }
            prev = current;
            current = current.next;
        }

        return false;
    }

    public void printTable() {
        for (int i = 0; i < table.length; i++) {
            System.out.print(i + ": ");
            Node current = table[i];

            while (current != null) {
                System.out.print("[" + current.key + " = " + current.value + "] -> ");
                current = current.next;
            }

            System.out.println("null");
        }
    }

    public int size() {
        return size;
    }

    public void rehash() {
        if(size < table.length * 0.70) {
            return;
        }

        Node[] oldTable = table;
        table = new Node[oldTable.length * 2];
        size = 0;

        for (Node head : oldTable) {
            Node current = head;
            while (current != null) {
                put(current.key, current.value);
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        HashTable ht = new HashTable(10);

        ht.put("Anna", 20);
        ht.put("Ben", 35);
        ht.put("Clara", 42);
        ht.put("David", 18);
        ht.put("Gerhart");
        ht.put("Rudi");

        System.out.println("Ben: " + ht.get("Ben"));
        System.out.println("Anna: " + ht.get("Anna"));

        ht.put("Ben", 99);
        System.out.println("Ben neu: " + ht.get("Ben"));

        ht.remove("Clara");

        ht.printTable();
        System.out.println("Anzahl Elemente: " + ht.size());
    }
}
