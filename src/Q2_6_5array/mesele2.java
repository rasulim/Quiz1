package Q2_6_5array;
// Bir massiv yaradın və həmin massivdəki hər bir ədədin yerini dəyişin
// (məsələn, ilk və sonuncu elementi mübadilə edin, sonra ikinci və sondan birinci elementi və s.).
import java.util.Arrays;

public class mesele2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        swapElementsIndex(arr,0,4);
        swapElementsIndex(arr,0,3);
        swapElementsIndex(arr,0,2);
        swapElementsIndex(arr,0,1);
        swapElementsIndex(arr,1,0);
        swapElementsIndex(arr,1,2);
        swapElementsIndex(arr,1,3);
        swapElementsIndex(arr,1,4);
        swapElementsIndex(arr,2,0);
        swapElementsIndex(arr,2,1);
        swapElementsIndex(arr,2,3);
        swapElementsIndex(arr,2,4);
        swapElementsIndex(arr,3,0);
        swapElementsIndex(arr,3,1);
        swapElementsIndex(arr,3,2);
        swapElementsIndex(arr,3,4);
        swapElementsIndex(arr,4,0);
        swapElementsIndex(arr,4,1);
        swapElementsIndex(arr,4,2);
        swapElementsIndex(arr,4,3);

    }

    public static void swapElementsIndex(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
