import java.lang.reflect.GenericArrayType;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static <T extends Comparable<T>> int binarySearch(T[]  a, T key, int low, int hi){
        if (low > hi) throw new IllegalArgumentException("Low > hi!");
        if (low < 0 ||  hi>= a.length) throw new IllegalArgumentException("Incorrect indexes");
        int mid = 0;
        int iters = 0;
        while(low <= hi){
            ++iters;
            mid = (low + hi) / 2;
            T value = a[mid];
            if(value == key) {
                return mid;
            }
            else if (key.compareTo(value)>0) low = mid + 1;
            else hi = mid - 1;
        }
        return -(low + 1);
    }
    public static void main(String[] args){
    Integer[] a = {1, 2, 3,4, 5, 6, 7, 8,9};
    String[] a1 = {"1", "2", "3","4", "5", "6", "7", "8","9"};
    int index = binarySearch(a, 4, 0, a.length - 1);
    int  index2 = binarySearch(a1, "5", 0, a.length - 1);
    System.out.println(index);
    System.out.println(index2);

}
}