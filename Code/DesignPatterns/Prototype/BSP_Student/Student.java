package Code.DesignPatterns.Prototype.BSP_Student;

public class Student implements Comparable<Student> {
    private int id;
    private int birthYear;
    private String name;

    public Student(int id, int birthYear, String name) throws UndefinedDate{
        if(birthYear < 1980){
            throw new UndefinedDate("Das Geburtsdatum ist falsch!");
        }
        this.id = id;
        this.birthYear = birthYear;
        this.name = name;
    }

    public int getId(){
        return this.id;
    }

    public int getBirthYear(){
        return this.birthYear;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.getName());
    }

    public Student cloneStudent() throws UndefinedDate{
        return new Student(id, birthYear, name);
    }
}
