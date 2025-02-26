package Q2_6_4array;
// İstifadəçidən 6 ədəd daxil edin və bu ədədləri kiçikdən böyüyə doğru sıralayın.
// (Bunu etmək üçün sort metodundan istifadə edə bilərsiniz.)
import java.util.Arrays;

public class mesele1 {
    public static void main(String[] args) {
        Integer[] a = {2,-1,3,4,0,8};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
