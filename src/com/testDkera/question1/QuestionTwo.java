package com.testDkera.question1;

import java.util.HashMap;

public class QuestionTwo {

//    public static void main(String[] args) {
//
//        System.out.println(hasDuplicatesUsingMap(new int[]{1,1,2,2,3,3},6));
//    }

    public static String hasDuplicatesUsingMap(int[] arrA, int N) {

        if (N != arrA.length)
            return "Given length is not equal to size of Array";

        HashMap<Integer, Integer> map = new HashMap<>();
        int numberOfDuplicates = 0;
        String result = "";

        for (int i = 0; i < arrA.length; i++) {
            if(arrA[i]> N){
                return "Invalid input – elements must be between 1 and N";
            }
            if (map.containsKey(arrA[i])) {
                int count = map.get(arrA[i]);
                map.put(arrA[i],++count);
                if(count==2) {
                    result = result +"," + String.valueOf(Math.abs(arrA[i])) ;
                }
                numberOfDuplicates++;
            } else {
                map.put(arrA[i], 1);
            }
        }
        if (numberOfDuplicates >= 1)
            return "Duplicates are:" + result;
        else
            return "No Duplicates";
    }
}