package BSP3;

public class SpeekVisitor implements Visitor<String> {

    @Override
    public String visit(Sau sau) {
        return "Grunz Grunz";
    }

    @Override
    public String visit(Rindviech rindviech) {
        return "MUUHHHHHH";
    }
}
