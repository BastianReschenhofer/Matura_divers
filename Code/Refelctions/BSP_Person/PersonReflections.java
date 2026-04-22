package Code.Refelctions.BSP_Person;
import java.lang.reflect.*;
import java.sql.SQLOutput;

public class PersonReflections {

    public static void main(String[] args) throws Exception{

        Class<?> personClass = Class.forName("Code.Refelctions.BSP_Person.Person");
        System.out.println(personClass);

        Constructor<?> personConst0 = personClass.getConstructor();
        Constructor<?> personConst1 = personClass.getConstructor(String.class, Integer.TYPE);

        Person person0 = (Person) personConst0.newInstance();
        Person person1 = (Person) personConst1.newInstance("Hans", 19);

        Field nameField = personClass.getDeclaredField("name");
        Field ageField = personClass.getDeclaredField("age");
        nameField.setAccessible(true);
        ageField.setAccessible(true);


        Method setName = personClass.getDeclaredMethod("setName", String.class);
        Method setAge = personClass.getDeclaredMethod("setAge", Integer.TYPE);
        setName.invoke(person0, "Huber");
        setAge.invoke(person1, 10);


        System.out.println(person0.getName() + person0.getAge());
        System.out.println(person1.getName() + person1.getAge());

        nameField.set(person0, "Kunibiert");
        ageField.set(person0, 100);

        System.out.println(person0.getName() + person0.getAge());




    }
}
