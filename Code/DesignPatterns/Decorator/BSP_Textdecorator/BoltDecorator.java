package Code.DesignPatterns.Decorator.BSP_Textdecorator;

public class BoltDecorator extends TextDecorator {

    public BoltDecorator(TextComponent component){super(component);}
    @Override
    public String render() {
        return super.component.render() + " [bolt]";
    }
}
