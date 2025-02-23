import java.util.Scanner;
// Bir neçə ədəd daxil edin və bu ədədlərdən hansının ən kiçik olduğunu tapın.
// İstifadəçi sıfır daxil etdikdə dövrə dayansın.

public class mesele4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int newNumber;
        int minNumber = 0;

        do {
            System.out.println("Ədəd daxil et: ");
            newNumber = sc.nextInt();
            if (newNumber < minNumber) {
                minNumber = newNumber;
                System.out.println("Daxil edilən ən kiçik ədəd " + minNumber);
            }else{
                System.out.println("Daxil edilən ən kiçik ədəd hələki " + minNumber + " olaraq qalır");
            }
        }while (newNumber != 0);

        sc.close();

        System.out.println("Daxil edilən ən kiçik ədəd " + minNumber + " oldu.");
    }
}