package from.catalist.hackerrank;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution1 {

    static String findAmountString(String[] amount){
        Queue<String> listString = new LinkedList<>();
        int countN = 0;
        int countE = 0;
        int lines = 0;
        for (int i=0; i < amount.length; i++){
            if (amount[i].equalsIgnoreCase("N")){
                countN++;
            } if (amount[i].equalsIgnoreCase("E")){
                countE++;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M = Integer.parseInt(in.nextLine());
        String[] input = new String[M];
        for (int i=0; i < M; i++){
            input[i] = in.nextLine();
        }
        String result = findAmountString(input);
        System.out.println(result);
    }
}
