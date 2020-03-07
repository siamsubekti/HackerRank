public class CharUpper2{

    static String capitalizeWord(String str){
        StringBuffer sb = new StringBuffer();
        char ch = ' ';

        for (int i=0; i < str.length(); i++){
            if (ch == ' ' && str.charAt(i) != ' '){
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
            ch = str.charAt(i);
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String input = "HarI KemErDeKaAn";
        input = input.toLowerCase();
        System.out.println(capitalizeWord(input));

    }
}