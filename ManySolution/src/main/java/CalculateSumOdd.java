import java.util.Scanner;

public class CalculateSumOdd {
    public static void main(String[] args) {
//        int n, sumE = 0, sumO = 0
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter number of array : ");
//        n = in.nextInt();
//        int[] array = new int[n];
//        System.out.println("Enter element of array: ");
//        for (int i = 0; i < n; i++) {
//            array[i] = in.nextInt();
//        }
//        for (int i=0; i < n; i++){
//            if (array[i] % 2 == 0){
//                sumE = sumE + array[i];
//            }
//            else {
//                sumO = sumO + array[i];
//            }
//        }
//        System.out.println(sumE);
//        System.out.println(sumO);

        int n, sumEven = 0, sumOdd = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of array : ");
        n = in.nextInt();
        int[] array = new int [n];
        System.out.println("Enter element of array : ");

        for(int i =0; i < n; i++){
            array[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 1){
                sumOdd = sumOdd + array[i];
            }
//            else {
//                sumOdd = sumOdd + array[i];
//            }
        }
//        System.out.println(sumEven);
        System.out.println(sumOdd);
    }
}
