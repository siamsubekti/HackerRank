package soal.from.wa;

import java.util.Scanner;

public class SolutionNo1 {

    //soal satu :
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Nilai: ");
        int enter = input.nextInt();
        for (int x = 0; x < enter; x++) {

            for (int i = 1; i <= enter; i++) {
                for (int j = 1; j <= i; j++) {
                    if (i <= x) {
                        System.out.print("#");
                    } else {
                        System.out.print(i);
                    }
                    int temp = 0;

                }
            }
            for (int p = (enter - 1); p >= 1; p--) {
                for (int q = p; q >= 1; q--) {
                    if (p <= x) {
                        System.out.print("#");
                    } else {
                        System.out.print(p);
                    }
                }
            }
            System.out.println();
        }

    }
}


