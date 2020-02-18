import java.util.*;
import java.util.stream.Collectors;

class minMaxSum {
    private static final Scanner scanner = new Scanner(System.in);

        static void miniMaxSum(int[] arr) {
            int[] array = {1,2,3,4,8,6,5};
            List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
            List<Integer> listArray = new ArrayList<>();
            listArray.add(3);
            listArray.add(5);
            listArray.add(2);
//            listArray.sort((Comparator<? super Integer>) list);
//            Collections.sort(listArray);
//            Collections.sort(list);
            Arrays.sort(array);
//            long x=0, y=0;
//            for(int j=0;j<(list.size()-1);j++){
//                x = x + list.get(j);
//                y = y + list.get(j+1);
//            }
//            System.out.println(x +" "+y);
//            int temp = 0;
//            for(int i = 0; i < arr.length; i++){
//                for(int j = i + 1; j < arr.length; j++){
//                    if(arr[i] > arr[j]){
//                        temp = arr[i];
//                        arr[i] = arr[j];
//                        arr[j] = temp;
//                    }
//                }
//            }
//
//            int minSum = 0;
//            int maxSum = 0;
//            for(int i=1; i < arr.length; i++){
//                maxSum = arr[i] + maxSum;
//            } for (int i=0; i < arr.length; i++){
//                minSum = arr[i] + minSum;
//            }
//            System.out.println(maxSum+" "+ minSum);
        }



        public static void main(String[] args) {
            int[] array = {1,2,3,4,8,6,5};
            String[] arrays = {"a", "g", "b","l"};
            List<Integer> listArray = new ArrayList<>();
            listArray.add(3);
            listArray.add(5);
            listArray.add(2);
            List<Integer> lists = new LinkedList<>();
            lists.add(6);
            lists.add(3);
            lists.add(5);
            lists.add(4);
            lists.add(2);
            Map<Integer, String> maps = new LinkedHashMap<>();
            maps.put(1, "A");
            maps.put(4, "B");
            maps.put(3, "D");
            maps.put(5, "C");
            maps.put(6, "F");
            System.out.println(maps);


//            listArray.sort((Comparator<? super Integer>) listArray);
//            Collections.sort(listArray);
//            System.out.println(listArray);
//            System.out.println(lists);
//            int[] arr = new int[5];
//
//
//            String[] arrItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            for (int i = 0; i < 5; i++) {
//                int arrItem = Integer.parseInt(arrItems[i]);
//                arr[i] = arrItem;
//            }

//            miniMaxSum(arr);
            Arrays.sort(arrays);
            System.out.println(Arrays.toString(arrays));
//            System.out.println(Arrays.sort(array));

//            scanner.close();
        }

}
