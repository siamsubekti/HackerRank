package com.pyramid;

import java.util.Scanner;

public class PyramidSumOfCountPyramid {
    public static void main(String[] args) {
        int i,j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("amount pattern pyramid: ");
        int rows1 = scanner.nextInt();
        System.out.println("rows of pyramid: ");
        int countPyramid = scanner.nextInt();
        int space = countPyramid;
        for (int x=1; x <= countPyramid; x++) {
            for (i=1; i <= rows1; i++) {
                for (j=space; j > 0; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= x; k++) {
                    System.out.print("* ");
                }
                for (j=space-2; j >= 0; j--){
                    System.out.print(" ");
                }
            }
            space--;
            System.out.println();

        }
    }
}
