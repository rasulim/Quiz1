package Q1_1if_else;
// Bir ədəd alın və həmin ədədin tək, ya da cüt olduğunu yoxlayan bir proqram yazın.

import java.util.Scanner;

public class mesele3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ədəd daxil et: ");

        int num = sc.nextInt();

        if (num%2==0) {
            System.out.println(num + " Cüt ədəddir.");
        }
        else {
            System.out.println(num + " Tək ədəddir.");
        }
    }
}
