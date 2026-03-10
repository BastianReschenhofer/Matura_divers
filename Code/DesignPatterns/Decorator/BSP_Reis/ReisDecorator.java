package Code.DesignPatterns.Decorator.BSP_Reis;

public abstract class ReisDecorator implements Reis {
    protected Reis reis;

    public ReisDecorator(Reis reis){
        this.reis = reis;
    }
}
