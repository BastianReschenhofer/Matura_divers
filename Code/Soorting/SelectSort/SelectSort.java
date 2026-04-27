package Code.Soorting.SelectSort;

public class SelectSort {

    public void selectionSort(int[] z){
        for(int i = 0; i < z.length - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < z.length; j++){
                if(z[j] < z[minIndex]){
                    minIndex = j;
                }
            }
            int t = z[i];
            z[i] = z[minIndex];
            z[minIndex] = t;
        }
    }
}
