package Code.Soorting.MergeSort;

public class MergeSort {

    public static void mergeSort(int[] array) {
        int n = array.length;
        if (n < 2) return;

        //Array aufteilen (halbieren
        int mid = n / 2;
        int[] links = new int[mid];
        int[] rechts = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            links[i] = array[i];
        }
        for (int i = mid; i < n; i++) {
            rechts[i - mid] = array[i];
        }

        //rekursiever Aufruf
        mergeSort(links);
        mergeSort(rechts);

        //geteilte Arrays wieder zusammfügen
        merge(array, links, rechts);

    }

    public static void merge(int[] result, int[] links, int[] rechts) {
        int i = 0; //linkes Array
        int j = 0; //rechts Array
        int k = 0; //result

        //immer das kleiner zu Result hinzufügen, vergleicht das nächste Element in rechts und links
        while (i < links.length && j < rechts.length) {
            if (links[i] <= rechts[j]) {
                result[k] = links[i];
                k++;
                i++;
            } else {
                result[k] = rechts[j];
                k++;
                j++;
            }
        }

        //Rest des übriggebliebene Arrays an Result anhängen
        while (i < links.length) {
            result[k] = links[i];
            i++;
        }
        while (j < rechts.length) {
            result[k] = rechts[j];
            j++;
        }

    }


    public void mergeSorti(int[] array){
        int n = array.length;
        if(n<2)return;

        int mid = n /2;
        int[] links = new int[mid];
        int[] rechts = new int[n-mid];

        for(int i = 0; i < mid; i++){
            links[i] = array[i];
        }
        for(int i = mid; i<n; i++){
            rechts[i -mid] = array[i];
        }

        mergeSorti(links);
        mergeSorti(rechts);

        mergi(array, links, rechts);
    }

    private void mergi(int[] result, int[] links, int[] rechts){
        int x = 0;
        int y = 0;
        int k = 0;

        while(x < links.length && y < rechts.length){
            if(links[x] <= rechts[y]){
                result[k] = links[x];
                k++; x++;
            }else{
                result[k] = rechts[y];
                k++; y++;
            }
        }

        while(x < links.length){
            result[k] = links[x];
            k++; x++;
        }
        while(y < rechts.length){
            result[k] = rechts[y];
            k++; y++;
        }
    }
}
