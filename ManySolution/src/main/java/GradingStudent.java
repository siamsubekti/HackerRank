import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GradingStudent {

    static int[] gradingStudent(int[] grades){
        for (int i = 0; i < grades.length; i++){
            if (grades[i] >= 38){
                int nextMultipleOfFive = 5 - (grades[i] % 5 ) + grades[i];
                if (nextMultipleOfFive - grades[i] < 3) {
                    grades[i] = nextMultipleOfFive;
                }
            }
        }
        return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        List<Integer> grade = new ArrayList<>();

        for (int grades_i = 0; grades_i < n; grades_i++) {
            int value = in.nextInt();
            grades[grades_i] = value;
            grade.add(value);
        }
        List<Integer> result = gradingStudents(grade);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i) + (i != result.size() - 1 ? "\n" : ""));
        }
        System.out.println("");
    }

    static List<Integer> gradingStudents(List<Integer> grades){
        int n = 0;
        for (Integer grade: grades) {
            if ( grade >= 38 ) {
                int nextMultipleOfFive = 5 - ( grade % 5) + grade;

                if ( ( nextMultipleOfFive - grade ) < 3 ) {
                    grades.set(n, nextMultipleOfFive);
                }
            }
            n++;
        }

        return grades;

//        for (int i = 0; i < grades.size(); i++){
//            if (grades.get(i) >= 38){
//                List<Integer> nextMultipleOfFive = Collections.singletonList(5 - (grades.get(i) % 5) + grades.get(i));
//                if ((grades.get(i).equals(nextMultipleOfFive) < 3) {
//                    grades.set(i,nextMultipleOfFive);
//                }
//            }
//        }
//        return grades;
    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] grades = new int[n];
//        for (int grades_i = 0; grades_i < grades.length; grades_i++){
//            grades[grades_i] = in.nextInt();
//        }
//        int[] result = gradingStudent(grades);
//        for (int i=0; i < result.length; i++){
//            System.out.println(result[i] +  (i != result.length -1 ? "\n" : ""));
//        }
//        System.out.println("");
//    }
    }
