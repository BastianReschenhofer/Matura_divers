import java.util.LinkedList;


public class Model {
    LinkedList<SelectedListener> listeners = new LinkedList<>();

    private Button[] buttons;
    private int selected;

    public Model(Button[] buttons) {
        this.buttons = buttons;
        selected = 0;
    }

    public Button[] getButtons() {
        return buttons;
    }

    public boolean getSelected(int index) {
        return selected == index;
    }

    public void click(int x, int y) {
        int prevSelected = selected;

        for(int i = 0; i < buttons.length; i++) {
            if(buttons[i].inside(x, y)) {
                selected = i;
            }
        }

        if (prevSelected != selected) {
            fireClickEvent();
        }
    }

    public void addListener(SelectedListener listener) {
        listeners.add(listener);
    }

    public void fireClickEvent() {
        for(SelectedListener l : listeners) {
            l.buttonSelected(new ButtonEvent(selected));
        }
    }
}