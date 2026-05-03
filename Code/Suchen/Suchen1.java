package Code.Suchen;

public class Suchen1 {
    
    public static void main(String[] args) {
        
        int[] x = {3, 7, 9, 11, 18, 25, 29, 34, 42, 50};

        System.out.println(searchSeq(1, x));


        
    }

    public static boolean searchSeq(int target, int[] x){
        for(int pos = 0; pos < x.length; pos ++){
            if(x[pos] == target) return true;
        }
        return false;
    }

    public static boolean searchBin(int target, int[] x) {
        int low = 0;
        int high = x.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (x[mid] == target) {
                return true;
            } else if (target > x[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}
