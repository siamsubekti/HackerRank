import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class diagonalDifference {
    private static final Scanner scanner = new Scanner(System.in);
    public static int diagonalDifference(List<List<Integer>> arr) {
        int sumX = 0;
        int sumY = 0;
        for(int i=0; i < arr.size(); i++) {
            sumX = sumX + arr.get(i).get(i);
            sumY = sumY + arr.get(i).get(arr.size()-1 -i);
        }

        System.out.println(sumX+sumY);
        return sumX + sumY;
    }

    public static void main(String[] args) {
        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];
        List<List<Integer>> arr = new ArrayList<>();

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arr.size(); i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        System.out.println(diagonalDifference(arr));
        scanner.close();
    }
}
