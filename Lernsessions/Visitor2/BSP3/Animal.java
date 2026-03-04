package BSP3;
public abstract class Animal {

    private String name;
    
    public Animal(String name){
        this.name = name;
    }


    public abstract <T> T accept(Visitor<T> v);


} 
