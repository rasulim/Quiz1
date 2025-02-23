package Q1_1if_else;
//Bir ədəd alın və həmin ədədin sadə, ya da mürəkkəb olduğunu yoxlayan bir proqram yazın.

import java.util.Scanner;

public class mesele2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ədəd daxil et: ");

        int num = sc.nextInt();

        if (num == 1){
            System.out.println("1 nə sadə nədə mürəkkəb ədədir");
        }
        else if (num == 2){
            System.out.println("Sadə ədəddir");
        }
        else {
            int count = 0;

            for (int i = 1; i <= num; i++) {

                if (num % i == 0) {
                    count++;
                }
            }
            if (count > 2) {
                System.out.println("Mürəkkəb əddədir");

            } else {
                System.out.println("Sadə ədəddir");
            }
        }
    }
}