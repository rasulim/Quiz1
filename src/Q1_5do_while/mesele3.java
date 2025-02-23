import java.util.Scanner;
// İstifadəçidən ardıcıl olaraq ədədlər alın və bunların daxilindəki ən böyük ədədi tapın.
// İstifadəçi 0 daxil etdikdə dövrə dayansın.

public class mesele3 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int newNumber;
        int maxNumber = 0;

        do {
            System.out.println("Ədəd daxil et: ");
            newNumber = sc.nextInt();
            if (newNumber > maxNumber) {
                maxNumber = newNumber;
                System.out.println("Daxil edilən ən böyük ədəd " + maxNumber);
            } else {
                System.out.println("Daxil edilən ən böyük ədəd hələki " + maxNumber + " olaraq qalır");
            }

        } while (newNumber != 0);

        sc.close();

        System.out.println("Daxil edilən ən böyük ədəd " + maxNumber + " oldu.");
    }
}
