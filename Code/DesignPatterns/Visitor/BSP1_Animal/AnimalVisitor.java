package Code.DesignPatterns.Visitor.BSP1_Animal;

public class AnimalVisitor implements Visitor<String> {

    @Override
    public String visit(Kamel kamel) {
        return "Kamel";
    }

    @Override
    public String visit(Giraffe giraffe) {
        return "Giraffe";
    }

    @Override
    public String visit(Lowe lowe) {
        return "Löwe";
    }

}
