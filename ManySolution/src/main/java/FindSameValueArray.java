import java.util.*;

public class FindSameValueArray {

    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 1;

        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            int count = 0;

            for(int j =0; j < array.length; j ++){
                if (temp == array[j]){
                    count++;
                }
            }
            map.put(temp, count);
        }

        Set<Integer> duplicate = new LinkedHashSet<Integer>();
        for(int i =0; i < array.length; i++){
            if(map.containsKey(array[i])){
                System.out.println("Key " + array[i] + " Value " + map.get(array[i]));

                if(map.get(array[i]) > 1){
                    duplicate.add(array[i]);
                }
            }
        }
        System.out.println("Duplicate " + Arrays.toString(duplicate.toArray()));
    }

}
