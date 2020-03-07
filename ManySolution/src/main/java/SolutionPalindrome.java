public class SolutionPalindrome {

    public static void main(String[] args) {

        String input = "ABBAS";
        byte[] stringArrays = input.getBytes();
        if (isPalindrome(input)) {
            System.out.println("PALINDROM");
        } else {
            System.out.println("NOT PALINDROM");
        }
    }
   static boolean isPalindrome(String str){
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
