package Code.DesignPatterns.Decorator.BSP_Coffee;


import Code.DesignPatterns.Factory.BSP_Coffe.Zucker;

import java.sql.SQLOutput;

public class CoffeDecoratorMain {

    public static void main(String[] args) {

        Beverage coffee = new MilchDecorator(new MilchDecorator(new ZuckerDecorator(new ZuckerDecorator(new Coffee()))));

        Beverage tea = new ZuckerDecorator(new Tea());

        System.out.println(coffee.description());
        System.out.println(tea.description());
    }
}
