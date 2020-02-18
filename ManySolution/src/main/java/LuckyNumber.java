public class LuckyNumber {
    public static int counter = 2;

    static boolean isLucky(int n){
        int nextPosition = n;

        if (counter > n){
            return true;
        } if (n%counter == 0){
            return false;
        } else {
            nextPosition -= nextPosition/counter;
        }counter++;
        return isLucky(nextPosition);
    }

    public static void main(String[] args) {
        int x = 5;
        if (isLucky(x)){
            System.out.println("is lucky number");
        } else {
            System.out.println("is not a lucky number");
        }
    }
}
