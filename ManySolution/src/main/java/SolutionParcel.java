import java.util.Arrays;

public class SolutionParcel {

    public static void main(String[] args) {
        int[] arr = {2, 15};//63

        System.out.println(sumOddNumber(arr));
    }

    public static int sumOddNumber(int[] arrNum) {
        int sumOdd = 0;
        Arrays.sort(arrNum);
        int a = arrNum[0];
        int b = arrNum[1];
        for (int i = a; i <= b; i++) {
            if (i % 2 == 1){
                sumOdd = sumOdd + i;
            }
        }

        return sumOdd;
    }
}
