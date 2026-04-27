package Code.Soorting.BubbleSort;

public class BubbleSort {
    public static void bubbleSort(int[] z) {
        boolean swapt;
        for (int i = 0; i < z.length - 1; i++) {
            swapt = false;
            for (int j = 0; j < z.length - 1 - i; j++) {
                if (z[j] > z[j + 1]) {
                    int t = z[j];
                    z[j] = z[j + 1];
                    z[j + 1] = t;
                    swapt = true;
                }
            }
            if(!swapt) break;
        }
    }
}
