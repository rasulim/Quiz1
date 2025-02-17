import java.util.Scanner;

public class mesele4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1-ci və 2-ci ədədləri gir: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Əməliyyat işarəsini daxil et (+,-,*,/): ");
        char op = sc.next().charAt(0);
        mesele4(a, b, op);
    }

    public static int mesele4(int a, int b, char op) {
        int c = 0;
        if (op == '+') {
            c = a + b;
            System.out.println(c);
        } else if (op == '-') {
            c = a - b;
            System.out.println(c);
        } else if (op == '*') {
            c = a * b;
            System.out.println(c);
        } else if (op == '/') {
            c = a / b;
            System.out.println(c);
        } else {
            System.out.println("Yanlış əməliyyat");
        }
        return c;
    }
}
