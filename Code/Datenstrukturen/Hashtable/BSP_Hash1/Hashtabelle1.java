package Code.Datenstrukturen.Hashtable.BSP_Hash1;

public class Hashtabelle1 {


    private int tablelenght;
    private Node[] table;
    private int size;

    public Hashtabelle1(int tablelenght){
        this.table = new Node[tablelenght];
        this.tablelenght = tablelenght;
        this.size = 0;
    }

    public static class Node{
        private int value;
        private final String key;
        private Node next;

        public Node(int value, String key){
            this.value = value;
            this.key = key;
            this.next = null;
        }

        public int getValue(){
            return this.value;
        }

        public Node getNext(){
            return this.next;
        }

        public void setNext(Node newNext){
            next = newNext;
        }

        public void setValue(int val){
            value = val;
        }
        public String getKey(){
            return this.key;
        }
    }


    public void put(int x, String key){
        int idx = hash(key);
        Node current = table[idx];

        while(current != null){
            if(current.getKey().equals(key)){
                current.setValue(x);
                return;
            }
            current = current.getNext();
        }

        Node n = new Node(x, key);
        n.setNext(table[idx]);
        table[idx] = n;
        size++;
    }

    public void delet(String key){
        int idx = hash(key);
        if(table[idx] == null) return;

        Node curr = table[idx];
        if(table[idx].getNext() == null && table[idx].getKey().equals(key)){
            table[idx] = null;
            return;
        }
        Node bcurr = curr;
        curr = curr.getNext();
        while(curr != null){
            if( curr.getKey().equals(key)){
                if(curr.getNext() == null){
                    curr = null;
                    return;
                }
                bcurr = curr.getNext();
                curr = null;
            }
            bcurr = curr;
            curr = curr.getNext();
        }
    }


    private int hash(String key){
        int code = 0;
        for(int i = 0; i < key.length(); i++){
            code = code*31 +(int)key.charAt(i);
        }
        return code % tablelenght;
    }

}

