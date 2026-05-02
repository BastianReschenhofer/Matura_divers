package Code.DesignPatterns.MVC1.Ampel;

import java.util.ArrayList;
import java.util.List;

public class AmpelModel {

    private int state = 0;
    private final List<AmpelView> views = new ArrayList<>();

    public int getState(){return state;}
    public void tootgleState(){
        state = (state+1)%3;
    }




}
