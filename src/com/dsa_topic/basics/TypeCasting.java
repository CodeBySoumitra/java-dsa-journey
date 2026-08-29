package com.dsa_topic.basics;

public class TypeCasting {
    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        //type casting
//        int num = (int)67.25f;
//        System.out.println(num);
//
//        //automatic type promotion in expressions
//        int a = 257;
//        byte b  = (byte) a;
//        System.out.print(b);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 5000;
        float f = 452.7f;
        double d  = 0.12458;
        double result = (f * b)  + (i / c) - (d * s);
        // float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);

        byte r = 42;
        r = (byte) (r * 2);


    }
}
