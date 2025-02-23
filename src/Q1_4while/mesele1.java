package Q1_4while;
// İstifadəçidən bir ədəd alın və bu ədədin asal olub olmadığını yoxlayın.
// Əgər asal ədədirsə, "Asal ədəddir", əks halda "Asal ədəd deyil" mesajını yazdırın.

import java.util.Scanner;

public class mesele1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ədəd daxil et :");

        int num = sc.nextInt();

        if (num == 1){
            System.out.println("1 nə asal nədə asal olmayan ədədir");
        }

        else if (num == 2){
            System.out.println("Asal ədəddir");
        }

        else {
            int count = 0;
            int i = 1;

            while (i <= num) {
                if (num % i == 0) {
                    count++;
                }
                i++;
            }

            if (count > 2) {
                System.out.println("Asal ədəd deyil");
            }

            else {
                System.out.println("Asal ədəddir");
            }
        }
    }
}
