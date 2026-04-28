package Code.Hashen;

import java.util.Objects;

public class Student {
    int matrNr;
    String name;
    int note;

    public Student(int matrNr, String name, int note) {
        this.matrNr = matrNr;
        this.name = name;
        this.note = note;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student other)) return false;
        return matrNr == other.matrNr;
    }

    @Override
    public int hashCode() {
        return Objects.hash(matrNr);
    }

    @Override
    public String toString() {
        return matrNr + " " + name + " " + note;
    }
}