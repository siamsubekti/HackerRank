public class CharUpper {
    public static void main(String[] args) {
        String input = "hAri KemerdeKaan iNdonEsia";
        System.out.println(input);
        System.out.println(convertToUpperCase(input));
    }

    static String convertToUpperCase(String str) {
        char ch[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ') {
                if (ch[i] >= 'a' && ch[i] <= 'z') {
                    ch[i] = (char)(ch[i] - 'a' + 'A');
                }
            }
            else if (ch[i] >= 'A' && ch[i] <= 'Z')
                ch[i] = (char)(ch[i] + 'a' - 'A');
        }
        String st = new String(ch);
        return st;
    }
}
