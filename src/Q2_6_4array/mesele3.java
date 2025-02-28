package Q2_6_4array;
// Bir massivdəki ədədləri əks sıralama (böyükdən kiçiyə) ilə düzün.
// Bunu for dövrəsi və ya sort metodunu istifadə edərək həyata keçirin.
import java.util.Arrays;

public class mesele3 {
    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5};

        Arrays.sort(a);

        reverse(a);

        System.out.println(Arrays.toString(a));
    }

    public static void reverse(int[] a) {

        int n = a.length;

        for (int i = 0; i < n / 2; i++) {

            int t = a[i];

            a[i] = a[n - i - 1];

            a[n - i - 1] = t;
        }
    }
}
