package Q2_6_2array;
// Bir massiv yaradın və həmin massivdəki ədədlərin tərsinə çevrilmiş halını ekrana yazdırın.
//(Array-in tərsinə çevrilməsi üçün əlavə bir massiv yaradılmasın.)
import java.util.Arrays;

public class mesele3 {
    public static void main(String[] args) {
        int[] arr = {15, 14, 13, 12, 11};
        for (int i = 0; i < arr.length / 2; i++) {
            int t = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = t;
        }
        System.out.println("" + Arrays.toString(arr));
    }
}
