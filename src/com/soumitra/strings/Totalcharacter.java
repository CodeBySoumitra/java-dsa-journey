package com.soumitra.strings;

public class Totalcharacter {
    static void main(String[] args) {
        String name = "Das";
//        with in build method
        System.out.println("Total character of "+name+" is = "+name.length());

//        without inbuild method
        int count = 0;
        for(char ch : name.toCharArray()){
            count++;
        }
        System.out.print("Total character "+count);
    }

}
