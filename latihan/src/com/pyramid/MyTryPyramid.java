package com.pyramid;

import java.util.Scanner;

public class MyTryPyramid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int pharos = scanner.nextInt();

        int space = pharos;

        for (int x = 1; x <= pharos; x++){

            for (int i = 1; i <= rows; i++) {
                for (int j = space; j > 0; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= x; j++){
                    System.out.print("* ");
                }
                for (int j = space-2; j >=0 ; j--) {
                    System.out.print(" ");
                }
            }
            space--;
            System.out.println();
        }
    }
}
