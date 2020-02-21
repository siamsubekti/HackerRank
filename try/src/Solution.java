import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.BitSet;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
//    static int getMissingNo(int a[], int n)
//    {
//        int total = 1;
//        for (int i = 2; i <= (n + 1); i++)
//        {
//            total += i;
//            total -= a[i - 2];
//        }
//        return total;
//    }
    // Driver Code
//    public static void main(String[] args)
//    {
//        int[] arr = { 1, 2, 3, 5 };
//        System.out.println(getMissingNo(arr, arr.length));
//    }

    public static void printMissingNumber(int[] Numbers, int count){
        int missingNumbers = count - Numbers.length;
        BitSet bitset = new BitSet(count);

        for(int number : Numbers)
        {
            bitset.set(number - 1);
        }

        int missingIndex = 0;
        for(int i = 0; i < missingNumbers; i++)
        {
            missingIndex = bitset.nextClearBit(missingIndex);
            System.out.printf("%n Missing Number is %d", ++missingIndex);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,8,10,22,34,45,56,67,88,90,100};
        printMissingNumber(numbers, 100);
    }
}
