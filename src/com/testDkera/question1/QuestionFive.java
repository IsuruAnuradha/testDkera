package com.testDkera.question1;

public class QuestionFive {

    public static void main(String[] args) {
        //System.out.println(reverceOrder("This is test"));
    }

    public  String reverceOrder(String word) {
        String s[] = word.split(" ");
        String output = "";
        for (int i = s.length - 1; i >= 0; i--) {
            output += s[i] + " ";
        }
        return output;
    }
}
