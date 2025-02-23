import java.util.Scanner;
public class yoxlama {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number1: ");
        int number1 = sc.nextInt();

        System.out.println("Enter number2: ");
        int number2 = sc.nextInt();

        String message1 = "Ədədlər bərabərdir";
        String message2 = "Ədədlər bərabər deyil";

        boolean checkNumberAndNUmber2 = (number1 == number2);

        String result = checkNumberAndNUmber2 ? message1 : message2;

        System.out.println(result);

    }
}
