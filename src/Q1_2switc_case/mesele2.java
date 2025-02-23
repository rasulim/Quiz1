package Q1_2switc_case;
// İstifadəçidən bir məktub (A, B, C, D və s.) alın və bu məktubun qiymət dərəcəsini yazdırın
// (A - Əla, B - Yaxşı, C - Kafi, D - Zəif).

import java.util.Scanner;

public class mesele2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Məktub daxil et: ");
        
        char mek = sc.next().charAt(0);

        switch (mek) {

            case 'A':
                System.out.println("A - Əla");
                break;

            case 'B' :
                System.out.println("B- Yaxşı");
                break;

            case 'C' :
                System.out.println("C- Kafi");
                break;

            case 'D' :
                System.out.println("D - Zəif");
                break;

            default:
                System.out.println("Ele bir məktub yoxdur");
        }
    }
}