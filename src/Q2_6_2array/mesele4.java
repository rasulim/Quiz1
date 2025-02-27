package Q2_6_2array;
//  İstifadəçidən 6 ədəd daxil edin və bu ədədləri tərsinə sıralayıb ekrana yazdırın.
//  (Bunun üçün for dövrəsi və ya başqa bir üsul istifadə edin.)
import java.util.Scanner;

public class mesele4 {
    public static void main(String[] args) {

        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("6 ədəd daxil edin: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Daxil edilən ədədlər: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print(" \nDaxil edilən ədədlərin tərsinə sıralanması: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
