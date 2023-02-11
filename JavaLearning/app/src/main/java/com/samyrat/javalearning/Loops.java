package com.samyrat.javalearning;

public class Loops {
    public static void main(String[] args){
        // for loop

       int[] myNumber = {12,15,18,21,24};
       //int x = myNumber[0] / 3 * 5;
        //System.out.println(x);


       for (int i = 0; i< myNumber.length; i++){
           int x = myNumber[i] / 3 * 5;
           //System.out.println(x);
       }

       for (int number: myNumber){
           //System.out.println(number / 3 * 5);
       }

       for ( int a = 0; a<10; a++){
           int b = a * 10;
           //System.out.println(b);
       }

       //While

        int j = 0;
       while (j<10){
           System.out.println("Test");
           j++;
       }






    }
}
