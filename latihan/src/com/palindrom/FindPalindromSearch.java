package com.palindrom;

import java.util.Scanner;

public class FindPalindromSearch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        System.out.println(longestPalindromString(input));
    }

    static public String InterMediatePalindrome(String s, int left, int right){
        if (left > right){
            return null;
        } while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

    public static String longestPalindromString(String s){
        if (s == null){
            return null;
        }
        String longest = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++){
            //odd case like 121
            String palindrome = InterMediatePalindrome(s, i, i);
            if (palindrome.length() > longest.length()){
                longest = palindrome;
            }
            //even cases like 1221
            palindrome = InterMediatePalindrome(s, i, i + 1);
                if (palindrome.length() > longest.length()) {
                    longest = palindrome;
                }
            }

        return longest;
    }
}
