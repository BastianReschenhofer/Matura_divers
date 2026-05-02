package Code.DesignPatterns.Decorator.BSP_Textdecorator;

public class UnderlineDecorator extends TextDecorator{
    public UnderlineDecorator(TextComponent component){
        super(component);
    }

    @Override
    public String render(){
        return super.component.render() + " [underline]";
    }
}
