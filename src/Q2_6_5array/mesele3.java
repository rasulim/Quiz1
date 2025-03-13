package Q2_6_5array;
// Bir massiv yaradın və həmin massivdəki ədədləri ikiqat artırın. Məsələn, 1, 2, 3 massivini 2, 4, 6-ya çevirin.

import java.util.Arrays;

public class mesele3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Əvvəlki massiv: " + Arrays.toString(arr));

        doubleElements(arr);

        System.out.println("İkiqat artırılmış massiv: " + Arrays.toString(arr));
    }

    public static void doubleElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2; // Hər bir elementi 2 ilə vururuq
        }
    }
}