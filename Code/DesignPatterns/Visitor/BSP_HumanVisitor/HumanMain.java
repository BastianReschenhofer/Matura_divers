package Code.DesignPatterns.Visitor.BSP_HumanVisitor;

import java.util.ArrayList;

public class HumanMain {
    public static void main(String[] args) {
        
        Woman Susanne = new Woman("Gerda", 40, false, true);
        Man Sepp = new Man("Sepp", 57, true, true);
        Man Peter = new Man("Peter", 84, true, true);

        ArrayList<Man> mans = new ArrayList<Man>();
        mans.add(Sepp);
        mans.add(Peter);


        GlazenVisitor gv = new GlazenVisitor();
        int glazenCount = 0;
        for(Man m : mans){
            if(m.accept(gv)) glazenCount++;
        }

        System.out.println(glazenCount);
    }
}
