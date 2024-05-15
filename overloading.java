package com.divyansh;

public class overloading {
    public static void main(String[] args) {
        fun(67);
        fun("divyansh");
        sum(3,4);
        sum(3,4,5);


    }
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }

    static void fun(int a){
        System.out.println("first one");
        System.out.println(a);
    }
    static void fun(String a){
        System.out.println("second one");
        System.out.println(a);

    }
}
