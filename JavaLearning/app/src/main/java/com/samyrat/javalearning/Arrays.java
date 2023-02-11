package com.samyrat.javalearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {
    public static void main (String[] args){
        //Array

        String[] myStringArray = new String[4];

        myStringArray[0] = "James";
        myStringArray[1] = "Lars";
        myStringArray[2] = "Kirk";
        myStringArray[3] = "Rob";

        System.out.println(myStringArray[1]);

        int[] myIntegerArray = new int[4];

        myIntegerArray[0] = 50;
        myIntegerArray[1] = 60;
        myIntegerArray[2] = 70;
        myIntegerArray[3] = 80;

        System.out.println(myIntegerArray[1]);

        int[] myNumberArray = {1,2,3,4,5,6};
        System.out.println(myNumberArray[2]);

        String[] myFamilyArray = {"Oleg","Yulya","Nagim"};
        System.out.println(myFamilyArray[1]);

        //List

        ArrayList<String> myStringArrayList = new ArrayList<String>();

        myStringArrayList.add("James");
        myStringArrayList.add("Lars");
        myStringArrayList.add(1,"Kirk");
        myStringArrayList.add("Rob");

        System.out.println(myStringArrayList.get(0));
        System.out.println(myStringArrayList.get(1));
        System.out.println(myStringArrayList.get(2));
        System.out.println(myStringArrayList.get(3));

        System.out.println(myStringArrayList.size());

        //Set

        HashSet<String> mySet = new HashSet<>();
        mySet.add("James");
        mySet.add("James");
        System.out.println(mySet.size());

        //HashMap

        HashMap<String,String> myHahMap = new HashMap<String,String>();
        myHahMap.put("name" , "James");
        myHahMap.put("instrument" , "Guitar");

        System.out.println(myHahMap.get("name"));
        System.out.println(myHahMap.get("instrument"));

        HashMap<String , Integer> myHashMapStringInteger = new HashMap<String,Integer>();

        myHashMapStringInteger.put("run", 100);
        myHashMapStringInteger.put("basketball",200);

        System.out.println(myHashMapStringInteger.get("run"));
        System.out.println(myHashMapStringInteger.get("basketball"));
    }

}
