package Q2_6_3array;
//Bir massivdəki tək ədədləri tapın və ekrana yazdırın. (İstifadəçi tərəfindən daxil edilmiş ədəd massivinə görə işləsin.)
import java.util.Scanner;

public class mesele2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Daxil ed");
        int size = sc.nextInt(); // 10
        int arr[] = new int[size];
        int i;
        System.out.println("Element daxil et: ");
        for(i=0; i<size; i++)
            arr[i] = sc.nextInt();
        System.out.println("Tək ədədlər: ");
        for(i=0; i<size; i++)
            if((arr[i]%2) !=0 )
        System.out.println(arr[i]+" ");
    }
}
