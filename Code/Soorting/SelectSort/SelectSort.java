package Code.Soorting.SelectSort;

public class SelectSort {
    public static void selectSort(int[] z, int length){

        for(int i = 0; i < length-1; i++){
            int curMin = i;
            for(int j = i; j < length ; j++){
                if(z[j] < z[curMin]) curMin = j;
            }
            int t = z[i];
            z[i] = z[curMin];
            z[curMin] = t;
        }
    }
}
