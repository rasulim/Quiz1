import java.util.Scanner;
//İstifadəçidən bir şifrə daxil etməsini istəyin. Şifrə doğru daxil edilənə qədər bu prosesi təkrarlayın.
// Şifrə düzgün olduqda "Giriş uğurla tamamlandı""mesajını yazdırın.

public class mesele1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String shifre = "123";

        String shifre2;

        do {
            System.out.println("Şifrə daxil edin: ");
            shifre2 = sc.nextLine();
        }while (!shifre.equals(shifre2));


        System.out.println("Giriş uğurla tamamlandı");
    }
}
