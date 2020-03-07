import java.util.Scanner;

public class PyramidInputCount {

    static void pyramid(int countPyramid, int rows){
        int space = countPyramid;
        for (int x = 1; x <= countPyramid; x++){
            for (int i = 1; i <= rows; i++) {
                for (int j = space; j > 0; j--){
                    System.out.print(" ");
                }
                for (int j = 1; j <= x; j++){
                    System.out.print("* ");
                }
                for (int j = space-2; j >= 0; j--){
                    System.out.print(" ");
                }
            }
            space--;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPyramid = scanner.nextInt();
        int rows = scanner.nextInt();

        pyramid(rows, countPyramid);
    }
}
