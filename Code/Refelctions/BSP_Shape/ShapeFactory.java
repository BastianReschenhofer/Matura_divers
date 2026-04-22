package Code.Refelctions.BSP_Shape;

import java.lang.reflect.InvocationTargetException;

public class ShapeFactory {

    public static Shape create (String typ){
        try{
            Class<?> clazz = Class.forName("Code.Refelctions.BSP_Shape." + typ);
            return (Shape) clazz.getConstructor().newInstance();
        }catch (ClassNotFoundException e){
            System.out.println("Klasse nicht gefunden!");
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static Shape create(String type, int data){
        try{
            Class<?> clazz = Class.forName("Code.Refelctions.BSP_Shape." + type);
            return (Shape) clazz.getConstructor(int.class).newInstance(data);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }


}
