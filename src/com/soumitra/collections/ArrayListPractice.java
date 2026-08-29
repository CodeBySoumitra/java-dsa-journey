package com.soumitra.collections;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //add elements to list
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println("List: "+list);

        //access an element
        System.out.println(list.get(0));//'0' is index number

        //modify list
        list.add(0,4);//first argument is index and second argument is element
        System.out.println("After modify: "+list);

        //delete element
        System.out.println(list.remove(2));//2 is index number
        System.out.println("After delete: "+list);

        //check particular element present or not
        System.out.println(list.contains(7));//returns true or false

        //size of the list
        System.out.println("Size of list: "+list.size());

        //loops on list
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i)+" ");
        }

        //sort
        Collections.sort(list);
        System.out.println("After sort: "+list);

        //check empty or not
        System.out.println(list.isEmpty());

        //find index of particular element(first occurence)
        System.out.println(list.indexOf(7));

        list.add(4);
        System.out.println(list);
        //last occurence of an element
        System.out.println(list.lastIndexOf(4));

        //convert ArrayList to array
        Integer[] arr = list.toArray(new Integer[0]);
        //System.out.println(arr);
        for(int num:arr){
            System.out.println(num);
        }

       // list.toString();






    }
}
