package Q1_1if_else;
// İstifadəçidən iki ədəd və bir əməliyyat işarəsi (+, -, *, /) alın.
// Bu əməliyyatı yerinə yetirin və nəticəni yazdırın.
// Əgər istifadəçi səhv əməliyyat işarəsi daxil edərsə, "Yanlış əməliyyat" mesajını yazdırın.

import java.util.Scanner;

public class mesele4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1- ci ədədi daxil et: ");
        int a = sc.nextInt();

        System.out.println("2- ci ədədi daxil et: ");
        int b = sc.nextInt();

        System.out.println("Əməliyyat işarəsini daxil et (+,-,*,/): ");
        char op = sc.next().charAt(0);
        mesele4(a, b, op);
    }

    public static int mesele4(int a, int b, char op) {
        int c = 0;

        if (op == '+') {
            c = a + b;
            System.out.println("Cavab: " + c);

        } else if (op == '-') {
            c = a - b;
            System.out.println("Cavab: " + c);

        } else if (op == '*') {
            c = a * b;
            System.out.println("Cavab: " + c);

        } else if (op == '/') {
            c = a / b;
            System.out.println("Cavab: " + c);

        } else {
            System.out.println("Yanlış əməliyyat");
        }

        return c;
    }
}
