package Code.Refelctions.BSP_LinkedList;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

public class LinkedListRefelections {
    public static void main(String[] args) throws Exception{

        List<String> list;
        Class<?> linkedListClass = Class.forName("java.util.LinkedList");
        list = (List) linkedListClass.newInstance();

        Method addMethod = linkedListClass.getMethod("add", Object.class);
        Method toStringMethod = linkedListClass.getMethod("toString");
        Method addIndexMethod = linkedListClass.getMethod("add", Integer.TYPE, Object.class);
        Method containsMethod = linkedListClass.getMethod("contains", Object.class);

        Method sizeMethod= linkedListClass.getDeclaredMethod("size");


        addMethod.invoke(list, "a");
        addMethod.invoke(list, "b");
        addIndexMethod.invoke(list, 1, "c");

        System.out.println(toStringMethod.invoke(list));
        System.out.println(sizeMethod.invoke(list));

        if((boolean) containsMethod.invoke(list, "a")){
            System.out.println("true a");
        }else{
            System.out.println("false a");
        }


    }
}
