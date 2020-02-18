import java.util.Locale;

public class SetenceCapitalization {
    public static void main(String[] args) {
        String input = "HARI KemErdekAAn iNdoneSia".toLowerCase();
        StringBuffer sb = new StringBuffer();
        sb.append(input);

        System.out.println(input);
        char[] chs = input.toCharArray();
//        System.out.println(chs);
        for (int i = 0; i < chs.length; i++){
          if (chs.equals(" ")){
              char ch = input.charAt(0);
              Character.toUpperCase(ch);
              System.out.println(ch);
              String n = sb.append(ch).toString();
              System.out.println(n);
//              String n = sb.append(ch).toString();

          }
        }
    }
}
