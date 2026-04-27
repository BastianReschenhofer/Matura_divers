package Code.Datenstrukturen.Stack;

import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> stack;
    private int size;

    public Stack(int size){
        stack = new ArrayList<>();
        this.size = size;
    }

    public void push(T val) throws StackOverflow{
        if(stack.size() == size) throw new StackOverflow("Stack voll");
        stack.add(val);
    }

    public T pop() throws StackUnderfllow{
        if(stack.isEmpty()) throw new StackUnderfllow("Stack leer");
        return stack.removeLast();
    }
}
