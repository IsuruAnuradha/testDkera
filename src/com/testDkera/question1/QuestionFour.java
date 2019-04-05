package com.testDkera.question1;

public class QuestionFour {

    public static void main(String[] args) {
//        int a[] = {1,2,4,7,8,5,6};
//        System.out.println(findMissingnumber(a));
    }

    public  int findMissingnumber(int [] arr){
        int N = arr.length ;
        int acctualTotal = ((N+1)*(N+2))/2 ;
        int total = 0;
        for (int i = 0; i < N ; i++) {
            total+=arr[i] ;
        }
        return (acctualTotal-total) ;
    }

}
