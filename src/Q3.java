import java.lang.reflect.Array;
import java.util.Arrays;

public class Q3 {
    //Write a java solution to find the lowest number from this array. 211, 110, 99, 34, 67, 89, 67, 456
    // 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65

    public static void main(String[] args) {
        int[] b = {211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90,
                45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};

            System.out.println(Arrays.stream(b).min());
        System.out.println(Arrays.stream(b).max()); //b.
        }
    }
