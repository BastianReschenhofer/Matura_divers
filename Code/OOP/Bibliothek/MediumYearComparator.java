package Code.OOP.Bibliothek;

import java.util.Comparator;

public class MediumYearComparator implements Comparator<Medium> {

    @Override
    public int compare(Medium o1, Medium o2) {
        return Integer.compare(o1.getJahr(), o2.getJahr());
    }
    
    
}
