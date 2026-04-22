package Code.Sort.Tierpark;

import java.lang.reflect.Method;

public class Reflection {

    public static void main(String[] args) throws Exception{
        Class<?> tierClass = Class.forName("Code.Sort.Tierpark.Tier");

        Method[] methods = tierClass.getDeclaredMethods();
        System.out.println("Methoden der Classe");
        for(Method m : methods){
            System.out.println(m.getName());
        }


    }
}
