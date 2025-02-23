import java.util.Scanner;
// İstifadəçidən bir ədəd daxil etməsini istəyin və bu ədədin kvadratını hesablamağa davam edin,
// amma daxil edilən ədəd 0 olduqda dövrə dayansın.

public class mesele2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.println("Ədəd daxil et: ");
            n = sc.nextInt();

            if (n != 0) {
                System.out.println(n*n);
            }

        }while (n != 0);

        sc.close();
    }
}
