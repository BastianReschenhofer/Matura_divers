package Code.DesignPatterns.MVC1.Counter;

public class Controller {

    private final Modell model;

    public Controller(Modell model){
        this.model = model;
    }

    public void plusOne(){
        model.increase();
    }
    public void minusOne(){
        model.decrease();
    }
}
