package Q2_6_1array;
// İstifadəçidən 7 ədəd daxil edin və daxil olunan ədədlərin cüt olanlarını tapın və ekrana yazdırın.
import java.util.Scanner;

public class mesele3 {
    public static void main(String[] args) {
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        System.out.println("7 ədəd daxil edin: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Cüt ədədlər: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                System.out.println(arr[i] + " ");
        }
    }
}  
