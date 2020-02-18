import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class BirthdayCakeCandles {
    private static final Scanner scanner = new Scanner(System.in);
    static int birthdayCakeCandles(int[] ar){
        long limit = 0;
        int result = 0;

        for(int i=0; i < ar.length; i++){
            if(limit < ar[i]){
                limit = ar[i];
                result = 1;
            } else if(limit == ar[i]){
                result++;
            }
        }
        return result;

    }
    public static void main(String[] args) {
        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        System.out.println(birthdayCakeCandles(ar));
        scanner.close();
    }

}
