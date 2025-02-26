package Q2_6_2array;
// İstifadəçidən bir ədəd daxil edin və
// 1-dən həmin ədədə qədər olan bütün ədədlərin tərs sırada massivə əlavə edildiyi bir proqram yazın.
import java.util.Scanner;

public class mesele2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir ədəd daxil edin: ");
        int n =sc.nextInt();

        int[] arr = new int[n];
        for ( int i =0; i<n; i++) {
            arr[i] = n - i;
        }
        System.out.println("Yuxarıda qeyd edilən ədədə qədər olan bütün ədədlərin tərs sırada yazılması: ");
        for (int i = 0; i<arr.length; i++) {
            System.out.println(arr[i] + "");
        }
    }
}
