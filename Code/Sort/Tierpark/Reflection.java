package Code.Sort.Tierpark;

import jdk.jfr.Description;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Reflection {

    public static void main(String[] args) throws Exception{
        Class<?> tierClass = Class.forName("Code.Sort.Tierpark.Tier");

        Method[] methods = tierClass.getDeclaredMethods();
        System.out.println("Methoden der Classe");
        for(Method m : methods){
            System.out.println(m.getName());
        }

        Constructor<?> tierConst = tierClass.getConstructor(String.class, String.class, int.class);
        Tier t1 = (Tier) tierConst.newInstance("Hubert", "Esel" , 1);

        System.out.println(t1.getName());

        System.out.println(tierClass.getAnnotation(Description.class));


    }
}
