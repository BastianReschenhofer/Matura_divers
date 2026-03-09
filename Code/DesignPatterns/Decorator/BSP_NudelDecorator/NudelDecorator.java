package Code.DesignPatterns.Decorator.BSP_NudelDecorator;

public abstract class NudelDecorator implements Nudel{

   protected Nudel nudel;

   public NudelDecorator(Nudel nudel){
    this.nudel = nudel;
   }
}
