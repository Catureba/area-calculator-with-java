import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double result;
        double R = input.nextDouble();
        R =  Math.pow(R, 2);
        result = 3.14159 * R ;
        System.out.println("A=" + String.format("%.4f", result));

    }
}