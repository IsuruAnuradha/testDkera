package com.testDkera.question1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionThree {

    public static void main(String[] args) {

//        List<Integer> result = mergeTwoLists(  new ArrayList<>(Arrays.asList(1,2,6,7)) ,
//                new ArrayList<>(Arrays.asList(4,5)));
//        for(int i=0;i<result.size();i++){
//            System.out.println(result.get(i));
//        }
    }

    public  List<Integer> mergeTwoLists(List<Integer> A , List<Integer>B){

        for (int index1 = 0 , index2=0 ; index2<B.size();index1++){
            if(index1==A.size()||A.get(index1)>B.get(index2))
                A.add(index1,B.get(index2++));
        }
        return A ;
    }
}
