package Q2_6_1array;
// İstifadəçidən 10 ədəd daxil edin və bu ədədlərin ən böyüyünü və ən kiçiyini tapın.
import java.util.Scanner;

public class mesele2 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        System.out.println("10 ədəd daxil edin: ");
        for (int i = 0; i < arr.length; i++) {
//            System.out.println(" Ədəd " + (i+1) + ": ");
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Ən böyüyük ədəd: " + max);
        System.out.println("Ən kiçik ədəd: " + min);
    }  
}
