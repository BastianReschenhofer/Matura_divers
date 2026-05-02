package Code.DesignPatterns.Decorator.BSP_Textdecorator;

public class Heading implements TextComponent{
    private final String context;

    public Heading(String context){
        this.context = context;
    }
    public String render(){
        return "Heading: " + context;
    }
}
