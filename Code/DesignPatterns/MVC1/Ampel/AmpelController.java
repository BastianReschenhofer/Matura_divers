package Code.DesignPatterns.MVC1.Ampel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AmpelController implements ActionListener {

    private final AmpelView view;
    private final AmpelModel model;

    public AmpelController(AmpelModel model, AmpelView view){
        this.model = model;
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.tootgleState();
        view.repaint();
    }
}
