package Code.DesignPatterns.MVC1.Ampel;

import javax.swing.*;
import java.awt.*;

public class AmpelView extends JPanel {

    public final AmpelModel model;

    public AmpelView(AmpelModel model){
        this.model = model;
        setPreferredSize(new Dimension(160, 320));
        setBackground(Color.DARK_GRAY);
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        int x = 40;
        int y = 30;
        int d = 60;
        int gap = 15;

        g.setColor(Color.BLACK);
        g.fillRoundRect(25, 20, 110, 240, 20, 20);

        if(model.getState() == 0) g.setColor(Color.RED);
        else g.setColor(Color.GRAY);
        g.fillOval(x, y, d, d);

        if(model.getState() == 1) g.setColor(Color.ORANGE);
        else g.setColor(Color.GRAY);
        g.fillOval(x, y + d + gap, d, d);

        if(model.getState() == 2) g.setColor(Color.GREEN);
        else g.setColor(Color.GRAY);
        g.fillOval(x, y + 2 * (d + gap), d, d);

    }
}
