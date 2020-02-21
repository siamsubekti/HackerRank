import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

//        String input = "TRI";
//        byte[] temp = input.getBytes();
//        byte[] temporary = new byte[temp.length];
//
//        for (int i=0; i < temporary.length; i++){
//            temporary[i] = temp[(temp.length -1)-i];
//        }
//        System.out.println(new String(temp));

//        String input2 = "ARIF DERMAWAN";
//        String[] input3 = input2.split(" ");
//        String[] StringToArray = new String[input3.length];
//
//        for (int i=0; i < input3.length; i++){
//            StringToArray[i] = input3[(input3.length -1) -i];
//        }
//        System.out.println(Arrays.toString(StringToArray));

        String input = "ABBA";
        byte[] stringArrays = input.getBytes();
        if (isPalindrom(input)) {
            System.out.println("PALINDROM");
        } else {
            System.out.println("NOT PALINDROM");
        }
    }
   static boolean isPalindrom(String str){
        int i = 0;
        int j = str.length()-1;
        while (i < j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
   }

}
