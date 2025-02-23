package Q1_1if_else;
//İstifadəçidən iki ədəd alın və bu ədədlərin bir-birinə bərabər olub-olmamasını yoxlayın.
// Əgər bərabərsə, "Ədədlər bərabərdir"; mesajını, əks halda "Ədədlər bərabər deyil" mesajını yazdırın.

import java.util.Scanner;

public class mesele1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1- ci ədədi daxil et: ");

        int num1 = sc.nextInt();
        System.out.println("2- ci ədədi daxil et: ");

        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("Ədədlər bərabərdir");
        }
        else if ( num1 != num2 ) {
            System.out.println("Ədədlər bərabər deyil");

        }
    }
}