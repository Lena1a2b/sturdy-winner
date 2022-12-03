import static java.lang.Math.abs;
import static java.lang.Math.max;
import static java.lang.Math.min;

public class Mathematics {

    public static double abs(double num) {
      double a;
      if( num < 0) a = - num; 
      else
      a = num; 
      return a;
    }

    public static int max(int a, int b) {
    	if( b < a) b = a;
       return b;
    }

    public static int min(int a, int b) {
    	if( b > a) b = a;
        return b;
    }

    public static void main(String[] args) {

        int a = -6, b = -3;

        System.out.println(abs(a));
        System.out.println(max(a, b));
        System.out.println(min(a, b));
    }
}