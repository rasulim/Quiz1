package Q2_6_3array;
// Bir massivdə və ya növbəti ən böyük və ən kiçik ədədi tapın.
// Məsələn, əgər massivdə 3, 5, 7, 9 ədədləri varsa, ən kiçikdən sonra ən kiçik olan 5 olmalıdır.

public class mesele3 {
    public static void main(String[] args) {
        int arr[] = {-12, 30, 10, -2, 89, 10};

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    min = arr[i];
                    arr[i]=arr[j];
                    arr[j]=min;
                }
                if(arr[i] < max){
                    max = arr[i];
                }
                if(arr[i] > min) {
                    min = arr[i];
                }
            }
        }
        System.out.println(" Ən böyük ədəd: " + min + "\n Ən kiçik ədəd: " + max + " \n Ən kiçik ədəddən sonrakı ən kiçik ədəd: " + arr[1]);
    }
}
