package Q1_3for;
// Bir ədəd alın və bu ədədə qədər olan bütün ədədlərin faktorialını hesablamaq üçün bir proqram yazın.

import java.util.Scanner;

class mesele3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ədəd daxil et :");

        int n = sc.nextInt();

        int faktorial = 1;

        for (int i = 1; i <= n; i++) {

            faktorial = faktorial * i;
        }
        System.out.println(n + " faktorialı " + faktorial);
    }
}