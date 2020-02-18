import java.util.Scanner;
class SimpleArraySum {
    private static final Scanner scan = new Scanner(System.in);

    static int simpleArraySum(int[] ar){
        return 0;
    }

    public static void main(String[] args) {
        int arrCount = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arrCount];

        String[] arItems = scan.nextLine().split(" ");
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arrCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        System.out.println();
        scan.close();
    }
}

