import java.util.Scanner;

public class mesele3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1-ci ədədi gir: ");
        int ə1 = input.nextInt();
        System.out.println("2-ci ədədi gir: ");
        int ə2 = input.nextInt();
        System.out.println("Əməliyyat işarəsini daxil et: ");
        String o = input.next();

        switch (o) {
            case "+":
                System.out.println(ə1 + ə2);
                break;
            case "-":
                System.out.println(ə1 - ə2);
                break;
            case "*":
                System.out.println(ə1 * ə2);
                break;
            case "/":
                System.out.println(ə1 / ə2);
                break;
            default:
                System.out.println("Yanlış əməliyyat");

        }
    }
}