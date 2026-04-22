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
}
