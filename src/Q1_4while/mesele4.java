package Q1_4while;
// Bir neçə ədəd daxil edin və bu ədədlərin cəmindən sonra onların ortalamasını hesablayan bir proqram yazın.
// İstifadəçi sıfır daxil edərək prosesi sonlandırsın.

import java.util.Scanner;

public class mesele4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ədəd daxil et: ");

        int sum = 0;

        int num = sum = sc.nextInt();

        int counter = 0;

        while (num != 0) {
            counter++;
            System.out.println("Ədəd daxil et: ");

            num = sc.nextInt();

            sum += num;
        }

        sc.close();

        System.err.println(counter);
        System.out.println(sum);
        System.out.println(sum/counter);

    }
}
