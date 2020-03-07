import java.util.Scanner;

public class SubstringComparison {

    public static String getSmallestAndLargest(String s, int k){
        String largest = "";
        String smallest = "";

        largest = s.substring(0,k);
        smallest = s.substring(0,k);

        for (int i = 0; i <= s.length() - k; i++) {
            String str = s.substring(i, k + i);
            if (smallest.compareTo(str) > 0){
                smallest = str;
            }
            if (largest.compareTo(str) < 0){
                largest = str;
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input s : welcometojava
        //input k : 3
        //expected output = ava
        //                  wel
        String s = scanner.next();
        int k = scanner.nextInt();
        scanner.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
}
