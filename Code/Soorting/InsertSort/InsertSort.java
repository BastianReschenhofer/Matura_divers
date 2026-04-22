package Code.Soorting.InsertSort;

public class InsertSort {

    public static void insertSort(int[] z, int lenght){
        for(int i = 0; i < lenght; i++ ){
            for(int j = i; j != 0 && z[j] < z[j-1]; j--){
                int t = z[j-1];
                z[j-1] = z[j];
                z[j] = t;
            }
        }
    }
}


