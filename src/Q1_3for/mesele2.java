package Q1_3for;
// İstifadəçidən bir ədəd alın və həmin ədədə qədər olan bütün ədədlərin cəmini hesablayan bir proqram yazın.

import java.util.Scanner;

public class mesele2 {

    public static void  main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ədəd daxil et :");

        int n = sc.nextInt();

        int sum = 0;

        for(int i=1;i<=n;i++){
            sum = sum + i;
        }

        System.out.println(n + " qədər olan ədədlərin cəmi : "+ sum);
    }
}
