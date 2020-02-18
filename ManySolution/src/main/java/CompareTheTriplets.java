import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {

        static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
            int winA = 0;
            int winB = 0;

            for(int i=0; i < a.size(); i++){

                    if (a.get(i) > b.get(i)){
                        winA++;
                    } if (a.get(i) < b.get(i)){
                        winB++;
                    }


        }
            return Arrays.asList(winA, winB);
    }
    public static void main(String[] args) throws IOException {
            List<Integer> listA = new ArrayList<>();
            List<Integer> listB = new ArrayList<>();
            listA.add(3);
            listA.add(5);//1
            listB.add(2);//0
            listB.add(8);

        System.out.println(compareTriplets(listA, listB));
    }
}
