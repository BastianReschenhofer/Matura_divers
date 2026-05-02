package Code.DesignPatterns.Factory.ShapeFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ShapeFactory {

    public Shape create(String shape, double[] values) {
        try {
            if (values.length < 1 || values.length > 3) {
                throw new NoMatchingShape("Keine passende Form für Parameter");
            }

            Class<?> clazz = Class.forName("Code.DesignPatterns.Factory.ShapeFactory." + shape);

            if (values.length == 1) {
                Constructor<?> c = clazz.getConstructor(double.class);
                return (Shape) c.newInstance(values[0]);
            } else if (values.length == 2) {
                Constructor<?> c = clazz.getConstructor(double.class, double.class);
                return (Shape) c.newInstance(values[0], values[1]);
            } else {
                Constructor<?> c = clazz.getConstructor(double.class, double.class, double.class);
                return (Shape) c.newInstance(values[0], values[1], values[2]);
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Klasse nicht gefunden: " + shape, e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Passender Konstruktor nicht gefunden für: " + shape, e);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException("Objekt konnte nicht erzeugt werden: " + shape, e);
        }
    }
}