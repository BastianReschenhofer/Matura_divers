package Code.Testen.ListTest;

public class LinkedList<T> {

    private Node<T> head;
    private int size;

    public LinkedList(){
        this.head = null;
        this.size = 0;
    }

    public void append(T data){
        Node<T> newNode = new Node<>(data);
        if(head == null) head = newNode;
        else{
            Node<T> current = head;
            while (current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size ++;
    }

    public void prepend(T data){
        Node<T> newNode = new Node<>(data);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<T> current = head;
        while (current != null) {
            result.append(current.getValue());
            if (current.getNext() != null) {
                result.append(", ");
            }
            current = current.getNext();
        }
        result.append("]");
        return result.toString();
    }

    public int count(){
        return this.size;
    }

    public T get(int index){
        checkIndex(index);

        Node<T> current = head;

        for(int i = 0; i < index; i++){
            current = current.getNext();
        }
        return current.getValue();
    }

    public void delete(int index){
        checkIndex(index);

        Node<T> target = null;
        Node<T> previous = head;

        if(index == 0){
            head = head.getNext();
            size--;

            return;
        }
        for(int i = 0; i < index-1; i++){
            previous = previous.getNext();
        }
        target = previous.getNext();

        if(target.getNext() == null){
            previous.setNext(null);
            size--;
            return;
        }

        previous.setNext(target.getNext());
        size--;
    }

    private void checkIndex(int index){
        if(index < 0 || index >= size) throw new NoSuchValueException("Index ungültig");
    }
}
