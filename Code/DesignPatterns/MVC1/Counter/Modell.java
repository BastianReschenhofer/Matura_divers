package Code.DesignPatterns.MVC1.Counter;

import java.util.ArrayList;
import java.util.List;

public class Modell {
    private int value;
    private final List<View> views = new ArrayList<>();

    public int getValue(){ return value;}
    public void addView(View view){ views.add(view);}

    public void increase(){ value++;}
    public void decrease(){ value--;}

    public void notifyViews(){
        for(View v : views){
            v.update(value);
        }
    }
}
