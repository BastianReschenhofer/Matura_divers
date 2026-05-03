package Code.Rekursion;

public class RekMain {
    public static void main(String[] args){
        System.out.println(quersumme(125));
        System.out.println(revString("HalloSack"));
    }

    public static int quersumme(int n){
        if(n == 0) return 0;
        return (n % 10) + quersumme(n/10);
    }

    public static String revString(String s){
        if(s.isEmpty() || s.length() == 1) return s;
        return revString(s.substring(1)) + s.charAt(0);
    }
}


