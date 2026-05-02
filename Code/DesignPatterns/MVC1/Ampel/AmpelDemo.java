package Code.DesignPatterns.MVC1.Ampel;

import Code.DesignPatterns.MVC1.Counter.Controller;

import javax.swing.*;
import java.awt.*;

public class AmpelDemo {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AmpelModel model = new AmpelModel();
            AmpelView view = new AmpelView(model);
            AmpelController controller = new AmpelController(model, view);

            JButton button = new JButton("Nächste Farbe");
            button.addActionListener(controller);

            JFrame frame = new JFrame("Ampel MVC");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());

            frame.add(view, BorderLayout.CENTER);
            frame.add(button, BorderLayout.SOUTH);

            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
