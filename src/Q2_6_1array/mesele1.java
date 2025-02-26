package Q2_6_1array;
// İstifadəçidən 5 ədəd daxil edin və bu ədədlərin toplamını və orta qiymətini hesablayan bir proqram yazın.
import java.util.Scanner;

public class mesele1 {
      public static void main(String[] args) {

        int[] arr = new int[5];
        int s = 0;
        Scanner sc =new Scanner(System.in);
        System.out.println("5 ədəd daxil edin: ");
        for( int i = 0; i< arr.length; i++ ) {
            arr[i] = sc.nextInt();
            s = s + arr[i];
        }
        double avg = (double) s / arr.length;

        System.out.println("Ədədlərin cəmi: " +s+"\nOrta qiyməti: " +avg);
    }
}
