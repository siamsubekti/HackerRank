import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line;
        int i = 1;
        while (in.hasNext()){
            line = in.nextLine();
            System.out.println(i + " " + line);
            i++;
        }

    }
}
