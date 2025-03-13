package Q2_6_5array;
// Bir massivdəki iki ədədin yerini dəyişin. İstifadəçidən massivdə iki index daxil edin və
// həmin indexlərdəki ədədləri bir-birinə mübadilə edin.

import java.util.Scanner;

public class mesele4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Əvvəlki massiv:");
        printArray(arr);

        System.out.print("Birinci indexi daxil edin: ");
        int index1 = scanner.nextInt();

        System.out.print("İkinci indexi daxil edin: ");
        int index2 = scanner.nextInt();

        swapElements(arr, index1, index2);

        System.out.println("Mübadilə olunmuş massiv:");
        printArray(arr);

        scanner.close();
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void swapElements(int[] arr, int index1, int index2) {

        if (index1 < 0 || index1 >= arr.length || index2 < 0 || index2 >= arr.length) {
            System.out.println("Daxil edilən indekslər səhvdir.");
            return;
        }

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}