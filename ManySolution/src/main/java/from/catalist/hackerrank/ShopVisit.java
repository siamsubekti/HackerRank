package from.catalist.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class ShopVisit {
  public static void main(String[] args) {
    ShopVisit result = new ShopVisit();
    result.start();
  }
  public void start() {
    Scanner scanner = new Scanner(System.in);
    try {
      int size = Integer.parseInt(scanner.nextLine());

      if (size > 0) {
        char[][] data = new char[size][size];
        for (int row = 0; row < size; row++) {
          char[] cols = scanner.nextLine().toCharArray();

          System.arraycopy(cols, 0, data[row], 0, size);
        }

        count(size, data);
      }
    } catch (RuntimeException re) {
      System.out.println(re.getMessage());
    }
  }

  private void count(int size, char[][] data) {
    int max = 1;
    for (int y = 0; y < size; y++) {
      System.out.println(Arrays.toString(data[y]));
      char prev = data[0][y];
      int count = 1;

      for (int x = 1; x < size; x++) {
        char now = data[x][y];

        if (prev == now) {
          count++;
        } else {
          count = 1;
        }

        prev = now;
        if (count > max) max = count;
      }
    }

    System.out.println(max);
  }
}
