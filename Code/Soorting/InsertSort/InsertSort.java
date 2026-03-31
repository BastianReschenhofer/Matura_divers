package Code.Soorting.InsertSort;

public class InsertSort {

    public static void main(String[] args) {
        int[] a = {5, 2, 9, 1, 5, 6};
        int count = insertionSortAnzahl(a);
        System.out.println("Vergleiche: " + count);
        System.out.print("Sortiert: ");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    public static int insertionSortAnzahl(int[] a) {
    
        int tmp; 
        int count = 0; 

        // Äußere Schleife: Geht das Array von links nach rechts durch
        for (int i = 1; i < a.length; i++) {
            
            tmp = a[i]; 
            int j = i; 

            // Innere Schleife: Geht vom aktuellen Element nach links
            while (j > 0) {
                count++; 
                
                if (a[j - 1] > tmp) {
                    a[j] = a[j - 1]; 
                    j--; 
                } else break;
            }
            a[j] = tmp; 
        }
        return count; 
    }

    public static <T extends Comparable<T>> int insertionSortAnzahl(T[] a) {

        T tmp;
        int count = 0;

        // Äußere Schleife: Geht das Array von links nach rechts durch
        for (int i = 1; i < a.length; i++) {

            tmp = a[i];
            int j = i;

            // Innere Schleife: Geht vom aktuellen Element nach links
            while (j > 0) {
                count++;

                if (a[j - 1].compareTo(tmp) > 0) {
                    a[j] = a[j - 1];
                    j--;
                } else break;
            }
            a[j] = tmp;
        }
        return count;
    }


}


