package Square;

public class SquareMy {

    public static boolean isSquare(int n) {
        // fix me!
        int square = (int)Math.sqrt(n);
        if((int)(square * square) == n){
            return true;
        }else{
            return false;
        }
    }
}
