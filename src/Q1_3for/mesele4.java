package Q1_3for;
// İstifadəçidən bir ədəd alın və həmin ədədin hər bir rəqəmini ayrı-ayrılıqda ekrana yazdırın.
// (Məsələn: 345 daxil edildikdə, 3, 4, 5 yazdırılmalıdır.)

import java.util.Scanner;

public class mesele4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ədəd daxil et :");

        int number = sc.nextInt();

        String convertNumber = String.valueOf(number);

        for (int i = 0; i < convertNumber.length(); i++) {
            if (i != convertNumber.length() - 1) {
                System.out.print(convertNumber.charAt(i)+",");
            }
            else {
                System.out.print(convertNumber.charAt(i));
            }
        }
    }
}