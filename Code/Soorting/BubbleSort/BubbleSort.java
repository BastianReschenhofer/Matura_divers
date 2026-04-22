package Code.Soorting.BubbleSort;

public class BubbleSort {
    public static void bubbleSort(int[] z , int lenght){
        for(int i = 0; i < lenght-1; i++){
            for(int j = i+1; j < lenght; j++){
                if(z[i] > z[j]){
                    int t = z[i];
                    z[i] = z[j];
                    z[j] = t;
                }
            }
        }
    }
}
