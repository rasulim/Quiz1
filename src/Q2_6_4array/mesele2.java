package Q2_6_4array;
//İstifadəçidən 8 ədəd daxil edin və həmin ədədləri böyükdən kiçiyə doğru sıralayın.
import java.util.Arrays;
import java.util.Collections;

public class mesele2 {
    public static void main(String[] args) {
        Integer[] a = {2,-1,3,4,0,258,8,9};
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println(Arrays.toString(a));
    }
}
