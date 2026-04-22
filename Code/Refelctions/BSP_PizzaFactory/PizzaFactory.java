package Code.Refelctions.BSP_PizzaFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PizzaFactory {

    public Pizza creat(String pizza){
        try{
            Class<?> pizzaClass = Class.forName("Code.Refelctions.BSP_PizzaFactory"+ pizza );
            Constructor<?> pizzaConst = pizzaClass.getConstructor();
            return (Pizza) pizzaConst.newInstance();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }


    }
}
