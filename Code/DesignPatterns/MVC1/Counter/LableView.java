package Code.DesignPatterns.MVC1.Counter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LableView extends JFrame implements View {

    private final JLabel label;

    public LableView(Controller controller){
        setTitle("Counter View 1");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        label = new JLabel("Wert: 0", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 24));

        JButton plusButton = new JButton("+");
        JButton minusButton = new JButton("-");

        plusButton.addActionListener(e -> controller.plusOne());
        minusButton.addActionListener(e -> controller.minusOne());

        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                controller.plusOne();
            }
        });

        JPanel buttonPanel1 = new JPanel();
        buttonPanel1.add(minusButton);
        buttonPanel1.add(plusButton);

        add(label, BorderLayout.CENTER);
        add(buttonPanel1, BorderLayout.SOUTH);

    }

    public void update(int value){
        label.setText("Wert: " + value);
    }

}
