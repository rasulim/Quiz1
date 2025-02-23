package Q1_4while;
// Kullanıcıdan bir ədəd alın və bu ədədin daxilindəki rəqəmlərin cəmini tapın.
// (Məsələn: 567 daxil edilərsə, 5+6+7 = 18 olacaq.)

import java.util.Scanner;

public class mesele3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ədəd daxil et: ");

        int num = sc.nextInt();

        String convertNumber = String.valueOf(num);
        int sum = 0;

        for (int i = 0; i < convertNumber.length(); i++) {

//            System.out.println( Integer.parseInt(String.valueOf(convertNumber.charAt(i))));
            sum += Integer.parseInt(convertNumber.charAt(i) + "");
        }

        System.out.println(sum);
    }
}