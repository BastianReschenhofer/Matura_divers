package Code.Datenstrukturen.LinkedList;

public class LinkedList {


    Node head;

    public void append(int data){
        Node newNode = new Node(data);

        if(head == null) head = newNode;
        else{
            Node curr = head;

            while(curr.getNext() != null){
                curr = curr.getNext();
            }

            curr.setNext(newNode);
        }
    }

    public void prepend(int data){
        Node newNode = new Node(data);

        if(head == null) head = newNode;
        else{
            newNode.setNext(head);
            head = newNode;
        }
    }

    



}
