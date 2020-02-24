package com.palindrom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PalindromeMySolution {

    static List<String> isPalindrome(String str){
        List<String> palinList = new ArrayList<>();
//        StringBuilder builder = new StringBuilder(str);

        String word = "";
        if (str == null || str.length() < 3)
            return null;
        for (int i=1; i < str.length()-1; i++){
            for (int j=i-1, k=i+1; j >=0 && k < str.length(); j--, k++){
                if (str.charAt(j) == str.charAt(k)){
                    if (k - j+1 >= 3)
                    word = str.substring(j, k+1);
                    palinList.add(word);

                }
                else
                    break;
            }
        }

        for (int i=1; i < str.length()-1; i++){
            for (int j =i, k=i+1; j >= 0 && k < str.length(); j--, k++){
                if (str.charAt(j) == str.charAt(k)) {
                    if (k - j+1 >= 3)
                        word = str.substring(j, k+1);
                    palinList.add(word);
                }
                else
                    break;
            }
        }
        return palinList;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();

        System.out.println(isPalindrome(words));
    }
}
