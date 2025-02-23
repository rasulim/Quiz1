package Q1_4while;
// İstifadəçidən bir ədəd alın və bu ədədə qədər olan bütün müsbət tam ədədlərin cəmini hesablayın.
// (0 daxil edilənə qədər davam etsin.)

import java.util.Scanner;

public class mesele2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ədəd daxil et: ");


        int sum = 0;

        int n = sc.nextInt();


        while (n > 0) {

            sum = sum + n;
            n = n - 1;
        }

//        System.out.println(n + " qədər olan ədədlərin cəmi : "+ sum);
        System.out.println(sum);
    }
}