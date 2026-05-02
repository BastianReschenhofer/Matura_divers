package Code.DesignPatterns.MVC1.Counter;

import javax.swing.SwingUtilities;

public class CounterDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Modell model = new Modell();
            Controller controller = new Controller(model);

            LableView view1 = new LableView(controller);
            ColorView view2 = new ColorView(controller);

            model.addView(view1);
            model.addView(view2);

            view1.setVisible(true);
            view2.setVisible(true);
        });
    }
}
