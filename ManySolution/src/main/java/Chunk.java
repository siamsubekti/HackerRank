import java.util.Arrays;

public class Chunk {
    public static void main(String[] args) {
        int[] input = {1,2,3,4,78,999,-1, 456, 100,5};
        int chunk = 3;

        int arrayTemp = input.length/chunk + (input.length% chunk > 0 ? 1:0);
        int amountSisaArray = input.length % chunk;
        int amountChunk = chunk + (input.length % chunk > 0 ? 1:0);
        int [][]tempArray = new int[arrayTemp][];
//        for (int i=0; i <(amountSisaArray > 0 ? chunk); i++) {
//            int from = i*chunk;
//            tempArray[i] = Arrays.copyOfRange(input, i*chunk, from +3);
//
//
//        }
        for (int i=0; i < arrayTemp; i++){
//            int [][] temp = Arrays.copyOfRange(input,)
            System.out.println();
        }
    }
}
