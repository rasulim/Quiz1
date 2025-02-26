package Q2_6_3array;
//Məsələ 1:
//İstifadəçidən 10 ədəd daxil edin və həmin massivdə istənilən bir ədədin olub olmadığını tapın.
//Əgər varsa, "Ədəd tapıldı" mesajını, yoxdursa "Ədəd tapılmadı" mesajını yazdırın.
import java.util.Scanner;

public class mesele1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("10 ədəd daxil edin: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int x,f,S,E,M;
        System.out.print("\n\nAxtarmaq üçün nömrə daxil edin: ");
        x=sc.nextInt();
        f=0;
        S=0;
        E=arr.length-1;
        while(S<=E)
        {
            M=(S+E)/2;
            if(x==arr[M])
            {
                System.out.print("Ədəd tapıldı");
                f=1;
                break;
            }
            else if(x>arr[M])
                {
                    S=M+1;
                }
            else if(x<arr[M])
                {
                    E=M-1;
                }
        }
        if(f==0)
        {
            System.out.print("Ədəd tapılmadı");
        }
    }
}
