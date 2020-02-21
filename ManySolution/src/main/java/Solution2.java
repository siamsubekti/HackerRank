public class Solution2 {
    public static void main(String[] args) {
        int [][] array ={ {10, 13, 25, -7},
                          {8, 9, 13, 20},
                          {1, 2, 3, 4},
                          {7, 9, 8, 1} };

     int valX = 0;
     int valY = 3;
     int sumX = 0;
     int sumY = 0;

     for (int i=0; i <4; i ++){
         sumX = sumX + array[i][valX];
         sumY = sumY + array[i][valY];
         valX++;
         valY--;
     }
        System.out.println(sumX);
        System.out.println(sumY);
        System.out.println(sumX+sumY);
    }
}
