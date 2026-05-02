package Code.DesignPatterns.Decorator.BSP_Textdecorator;

public class MainPart implements TextComponent {

    private final String context;

    public MainPart(String context){
        this.context = context;
    }

    public String render(){
        return "MainPart: " + context;
    }
}
