package Code.DesignPatterns.MVC1.Counter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ColorView extends JFrame implements View{
    private final JPanel panel;
    private final JLabel label;

    public ColorView(Controller controller) {
        setTitle("Counter View 2");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel(new BorderLayout());
        label = new JLabel("Aktuell: 0", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 24));

        JButton minusButton = new JButton("Kleiner");
        JButton plusButton = new JButton("Größer");

        minusButton.addActionListener(e -> controller.minusOne());
        plusButton.addActionListener(e -> controller.plusOne());

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                controller.minusOne();
            }
        });

        JPanel south = new JPanel();
        south.add(minusButton);
        south.add(plusButton);

        panel.add(label, BorderLayout.CENTER);
        panel.add(south, BorderLayout.SOUTH);
        add(panel);
    }

    @Override
    public void update(int value) {
        label.setText("Aktuell: " + value);

        if (value < 0) {
            panel.setBackground(Color.PINK);
        } else if (value == 0) {
            panel.setBackground(Color.LIGHT_GRAY);
        } else {
            panel.setBackground(Color.GREEN);
        }
    }
}
