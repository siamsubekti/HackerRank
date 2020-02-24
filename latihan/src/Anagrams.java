import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String string1, String string2){
        string1 = string1.toUpperCase();
        string2 = string2.toUpperCase();
        boolean ret = false;
        StringBuilder builder = new StringBuilder(string2);

        if (string1.length() == string2.length()){
            for (int i=0; i < string1.length(); i++){
                for (int j = 0; j < builder.length(); j++){
                    if (string1.charAt(i) == builder.charAt(j)){
                        builder.deleteCharAt(j);
                        if (i == string1.length() - 1 && builder.length() == 0){
                            ret = true;
                            break;
                        }
                        break;
                    }
                }
            }
        }return ret;
    }

    public static void main(String[] args) {
        //input : Hello, input2 : hello
        //output : Anagrams
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.next();
        String input2 = scanner.next();

        scanner.close();
        boolean ret = isAnagram(input1, input2);
        System.out.println((ret) ? "Anagrams" : "NotAnagrams");
    }
}
