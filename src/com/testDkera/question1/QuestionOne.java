package com.testDkera.question1;

public class QuestionOne {

//    public static void main(String[] args) {
//        System.out.println(findLargestElement(new int[]{23,100,45,67,6,78,55}));
//    }

    public int findLargestElement(int[] arr){

        int max= arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max)
                max=arr[i];
        }
        return max ;
    }
}
