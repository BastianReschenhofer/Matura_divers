import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class ButtonApp {

    private JFrame frame;
    private Model model;
    private ButtonView view1;


    ButtonApp(final Model _model) {
        this.model = _model;

        frame = new JFrame("Selection");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container contentPane = frame.getContentPane();

        JPanel panel = new JPanel(new GridLayout(1, 2));

        view1 = new ButtonView(model);

        panel.add(view1);

        contentPane.add(panel);

        frame.setLocation(100, 100);
        frame.setSize(600, 320);
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        Button[] buttons = {
            new Button(50, 50), 
            new Button(200, 50), 
            new Button(350, 50),
            new Button(50, 200), 
            new Button(200, 200),
            new Button(350, 200)};

        SwingUtilities.invokeLater(() -> {
            new ButtonApp(new Model(buttons));
        });
    }
}
