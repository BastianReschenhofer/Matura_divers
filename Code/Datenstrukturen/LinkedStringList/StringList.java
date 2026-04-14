package Code.Datenstrukturen.LinkedStringList;

import java.util.ArrayList;
import java.util.List;

public class StringList {

    StringNode head;

    public void prepend(StringNode n){

        if(head == null) head = n;
        else{
            n.setNext(head);
            head = n;
        }
    }
    
    public void print(){
        StringNode curr = head;
        while(curr != null){
            System.out.println(curr.getData());
            curr = curr.getNext();
        }
    }

    public void prepend(String s){

        for(int i = s.length();i > 0; i--){
            char b = s.charAt(i-1);
            StringNode n = new StringNode(b);
            prepend(n);
        }
    }

    public int count(){
        StringNode curr = head;
        int count = 0;
        while(curr != null){
            count ++;
            curr = curr.getNext();
        }
        return count;
    }

    public StringNode getN(int n){
        if(head == null) return null;
        StringNode curr = head;
        while(curr != null){
            if(n==0){
                return curr;
            }
            n--;
            curr = curr.getNext();
        }
        return null;
    }

    public StringNode removeFirst(){
        if(head == null)return null;

        StringNode tmp = head;
        head = head.getNext();
        return tmp;
    }

    public void insertAtN(StringNode k, int n){
        StringNode bevoreN = getN(n-1);
        StringNode atN = getN(n);

        bevoreN.setNext(k);
        k.setNext(atN);
    }

    public void append(StringNode n){
        if(head == null) head = n;
        else{
            StringNode curr = head;
            while(curr.getNext() != null){
                curr = curr.getNext();
            }
            curr.setNext(n);
        }
    }

    public void set(StringNode n, int k){
        StringNode beforeN = getN(k-1);
        StringNode atN = getN(k);

        beforeN.setNext(n);
        n.setNext(atN.getNext());
    }

    public StringNode findFirst(char c){
        if(head == null) return null;

        StringNode curr = head;
        while(curr != null){
            if(curr.getData() == c) return curr;
            curr = curr.getNext();
        }
        return null;
    }

    public StringNode findLast(char c){
        if(head == null) return null;

        StringNode curr = head;
        StringNode n = null;

        while(curr != null){
            if(curr.getData() == c){
                n = curr;
            }
            curr = curr.getNext();
        }
        return n;
    }

    public void removeLast(){
        if(head == null) return;

        StringNode curr = head;
        
        while(curr.getNext() != null){
            curr = curr.getNext();
        }
        curr.setNext(null);
    }

    public boolean remove(char c) {
        if (head == null) return false;

        if (head.getData() == c) {
            head = head.getNext();
            return true;
        }

        StringNode curr = head;
        while (curr.getNext() != null) {
            if (curr.getNext().getData() == c) {
                curr.setNext(curr.getNext().getNext());
                return true;
            }
            curr = curr.getNext();
        }
        return false;
    }


    public void sort(){
        if(head == null) return;

        List<Character> a = new ArrayList<>();
        StringNode curr = head;

        while(curr != null){
            a.add(curr.getData());
        }

        for(int i = 0; i <= a.size()-1; i++){
            for(int j = 0; j <= a.size()-1; j++){
                if(a.get(j) > a.get(j+1)){
                    char tmp = a.get(j+1);
                    a.set(j+1, a.get(j));
                    a.set(j, tmp);
                }
            }   
        }

        head = new StringNode(a.get(0));
        int i = a.size();
        int j = 1;
        curr = head;
        while( j != i-1){
            StringNode c = new StringNode(a.get(j));
            j++;
            curr.setNext(c);
            curr = curr.getNext();
        }
    }

}
