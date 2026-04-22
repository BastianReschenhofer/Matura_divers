package Code.Refelctions.BSP_CarFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AutoFactory {
    public static Car create(String modell, String[] params) {
        try{
            Class<?> clazz = Class.forName("Code.Refelctions.BSP_CarFactory."+modell);
            Constructor<?> constructor0 = clazz.getConstructor();
            Constructor<?> constructor1 = clazz.getConstructor(int.class);
            Constructor<?> constructor2 = clazz.getConstructor(String.class, int.class);

            if(params.length == 0) return (Car) constructor0.newInstance();
            if(params.length == 1) return (Car) constructor1.newInstance(Integer.parseInt(params[0]));
            if(params.length == 2) return (Car) constructor2.newInstance(params[0], Integer.parseInt(params[1]));
            return null;
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
