import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;

public class ButtonView extends JComponent {
    Model model;

    public ButtonView(Model model) {
        this.model = model;
        addMouseListener(selectionHandler);
        model.addListener(customListener);
    }

    public SelectedListener customListener = new SelectedListener() {
        public void buttonSelected(ButtonEvent e) {
            repaint();
        }
    };


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for(int i = 0; i < model.getButtons().length; i++) {
            Button b = model.getButtons()[i];

            g.setColor(Color.GRAY);
            if(model.getSelected(i)) g.setColor(Color.BLUE);

            g.fillRect(b.getX(), b.getY(), 50, 50);
        }
    }

    
    private MouseListener selectionHandler = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            model.click(e.getX(), e.getY());
        }
    };
}
