package Q2_6_1array;
// Bir massiv yaradın (məsələn, int[] numbers = {1, 2, 3, 4, 5}) və
// həmin massivdəki bütün ədədlərin kvadratlarını hesablayıb ekrana yazdırın.

public class mesele4 {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};
        for (int i = 0; i < nums.length; i++) {
            int kvadrat = nums[i] * nums[i];

            System.out.println(nums[i] + " ədədinin kvadratı: " + kvadrat);
        }
    }
}
