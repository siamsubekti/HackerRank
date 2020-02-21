package com.main;

public class MainApp {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3};
        int [] arr2 = {1,2,3};
        sameArray(arr1, arr2);
        int [] arr3 = {1,2,3,4};
        sumArray(arr3);
    }

    static void sameArray(int [] arr1, int [] arr2){
        int count = 0;
        for (int i = 0; i < arr1.length ; i++) {

            if(arr1[i] == arr2[i]){
                count++;
            }

        } if (count > 2){
            System.out.println("SAME");
        } else {
            System.out.println("DIFFERENT");
        }
    }


    //ada array {1,2,3,4}
    //output 10

    static int sumArray ( int [] arr){
        int count = 0;
        for (int i=0; i < arr.length; i++){
            count+=arr[i];
        }
        System.out.println(count);
        return count;
    }
}
