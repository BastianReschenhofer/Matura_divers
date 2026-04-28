package Code.Hashen;

import java.util.Arrays;

public class HashMapStudent {

    private Student[] hasMap;
    private boolean[] deleted;
    int cap;
    private int size;
    private static final double LOAD_FACTOR = 0.7;

    public HashMapStudent(int cap) {
        this.cap = cap;
        this.hasMap = new Student[cap];
        this.deleted = new boolean[cap];
        this.size = 0;
    }

    private int indexFor(int key) {
        return Math.floorMod(key, cap);
    }

    private void rehash() {
        Student[] oldMap = hasMap;
        boolean[] oldDeleted = deleted;

        cap = cap * 2;
        hasMap = new Student[cap];
        deleted = new boolean[cap];
        size = 0;

        for (int i = 0; i < oldMap.length; i++) {
            if (oldMap[i] != null && !oldDeleted[i]) {
                put(oldMap[i]);
            }
        }
    }

    public void put(Student a) {
        if ((double) (size + 1) / cap > LOAD_FACTOR) {
            rehash();
        }

        int start = indexFor(a.matrNr);

        for (int i = 0; i < cap; i++) {
            int index = (start + i) % cap;

            if (hasMap[index] == null || deleted[index]) {
                hasMap[index] = a;
                deleted[index] = false;
                size++;
                return;
            }

            if (hasMap[index].equals(a)) {
                hasMap[index] = a;
                return;
            }
        }

        throw new IllegalStateException("HashMap ist voll");
    }

    public Student get(int matrNr) {
        int start = indexFor(matrNr);

        for (int i = 0; i < cap; i++) {
            int index = (start + i) % cap;

            if (hasMap[index] == null && !deleted[index]) {
                return null;
            }

            if (hasMap[index] != null && !deleted[index] && hasMap[index].matrNr == matrNr) {
                return hasMap[index];
            }
        }

        return null;
    }

    public boolean delete(int matrNr) {
        int start = indexFor(matrNr);

        for (int i = 0; i < cap; i++) {
            int index = (start + i) % cap;

            if (hasMap[index] == null && !deleted[index]) {
                return false;
            }

            if (hasMap[index] != null && !deleted[index] && hasMap[index].matrNr == matrNr) {
                hasMap[index] = null;
                deleted[index] = true;
                size--;
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return "hasMap=" + Arrays.toString(hasMap);
    }

    public int getSize(){return this.size;}

    public boolean[] getDeleted(){return this.deleted;}
}