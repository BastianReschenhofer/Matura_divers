package Code.Refelctions.BSP_Person;

public class Person {
    private String name;
    private int age;

    public Person(){
        this.name = "N/G";
        this.age = 0;
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    public void setName(String newName){
        this.name = newName;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
}
