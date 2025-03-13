package Q2_6_4array;
//Bir massivdəki ədədlərin orta qiymətinə görə sıralama aparın. (Ən yaxın olanları bir-birinə sıralayın.)

import java.util.Arrays;
import java.util.Comparator;

public class mesele4 {

    public static void main(String[] args) {

        int[] arr = {5, 2, 10, 3, 9};

        double average = calculateAverage(arr);

        Integer[] sortedArr = sortByProximityToAverage(arr, average);

        System.out.println(Arrays.toString(sortedArr));
    }

    public static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    public static Integer[] sortByProximityToAverage(int[] arr, double average) {
        Integer[] result = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }

        Arrays.sort(result, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {

                double diffA = Math.abs(a - average);
                double diffB = Math.abs(b - average);
                return Double.compare(diffA, diffB);
            }
        });

        return result;
    }
}