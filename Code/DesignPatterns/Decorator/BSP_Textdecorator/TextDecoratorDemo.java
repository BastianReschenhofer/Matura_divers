package Code.DesignPatterns.Decorator.BSP_Textdecorator;

public class TextDecoratorDemo {

    public static void main(String[] args){
        TextComponent title = new BoltDecorator(new UnderlineDecorator(new Heading("Test test")));
        TextComponent mainPart = new BoltDecorator(new MainPart("Das ist der Hauptteil und der ist wundertoll"));

        System.out.println(title.render());
        System.out.println(mainPart.render());
    }
}
