package Q2_6_5array;
// İstifadəçidən iki ədəd massiv daxil edin (hər biri 5 ədəd olmalıdır).
// Hər iki massivdəki ədədləri bir-biri ilə mübadilə edin (yəni, massivlərin elementlərini dəyişdirin).

import java.util.Scanner;

public class mesele1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array1 = new int[5];
        System.out.println("Birinci massiv üçün 5 ədəd daxil edin:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        int[] array2 = new int[5];
        System.out.println("İkinci massiv üçün 5 ədəd daxil edin:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        System.out.println("İlk massiv:");
        printArray(array1);
        System.out.println("İkinci massiv:");
        printArray(array2);

        swapArrays(array1, array2);

        System.out.println("Massivlərin mübadiləsindən sonra:");
        System.out.println("Birinci massiv:");
        printArray(array1);
        System.out.println("İkinci massiv:");
        printArray(array2);

        scanner.close();
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void swapArrays(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }
    }
}