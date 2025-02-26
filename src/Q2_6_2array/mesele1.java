package Q2_6_2array;
// İstifadəçidən 5 ədəd alın və bu ədədləri tərsinə yazdıran bir proqram yazın.
// (Məsələn, 1, 2, 3, 4, 5 daxil edildikdə, nəticə 5, 4, 3, 2, 1 olacaq.)
import java.util.Scanner;

public class mesele1 {
    public static void main(String[] args) {
        int[] nums = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("5 ədəd daxil edin: ");

        for( int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Yuxarıda qeyd edilən ədədlərin tərsinə yazılması: ");
        for (int i =nums.length - 1; i>=0; i--) {
            System.out.println( nums[i] + "");
        }
    }
}
