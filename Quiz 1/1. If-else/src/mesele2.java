public class mesele2 {
    public static void main(String[] args) {
        int num = 4;

        int count = 0;

        if(num == 2) {
            System.out.println(num + " Sadə ədəddir");
        } else {

            for(int i = 1; i <= num; i++) {
                if(num % i == 0) {
                    count++;
                }
            }

            if(count == 2) {
                System.out.println(num + " Sadə ədəddir");
            }
            else if(count == 1) {
                System.out.println(num + " Sadə ədəddir");
            }
            else {
                System.out.println(num + " Mürəkkəb ədəddir");
            }
        }
    }
}