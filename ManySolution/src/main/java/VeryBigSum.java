import java.util.Scanner;

public class VeryBigSum {

    static long sum = 0;

    static long aVeryBigSum(long[] arr){
        for (int i=0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int arrCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long[] ar = new long[arrCount];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i=0; i < arrCount; i++){
            int arItem = Integer.parseInt(arrItems[i]);
            ar[i] = arItem;
        }

        System.out.println(aVeryBigSum(ar));

    }

}
