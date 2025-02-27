package Q2_6_3array;
//İstifadəçidən 10 ədəd daxil edin və bu ədədlərdən yalnız unikal olanları tapın (təkrarlanan ədədləri nəzərə almayın).
import java.util.Arrays;

public class mesele4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 1, 2, 3};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}
