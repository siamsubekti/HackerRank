package soal.from.wa;

import java.util.Scanner;

public class SolutionNo2 {

    private static String[] numbers={"", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas"};

    static String convertString(double number){
        if (number < 12){
            return numbers[(int)number];
        } if (number >= 12 && number <= 19){
            return numbers[(int) number%10] + " belas ";
        } if (number >= 20 && number <= 99){
            return numbers[(int)number/10] + " puluh " + numbers[(int)number%10];
        } if (number >= 100 && number <=199){
            return " seratus " + convertString(number%100);
        } if (number >= 200 && number <= 999){
            return numbers[(int)number/100] + " ratus " + convertString(number%100);
        } if (number >= 1000 && number <= 1999){
            return " seribu " + convertString(number%1000);
        } if (number >= 2000 && number <= 999999){
            return convertString((int)number/1000) + " ribu " + convertString(number%1000);
        } if (number >= 1000000 && number <= 99999999){
            return convertString((int)number/1000000) + " juta " + convertString(number%1000000);
        }
        return " ";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double enter = in.nextDouble();
        System.out.println(convertString(enter));
    }
}
