package com.divyansh;

public class returnstring {

    public static void main(String[] args) {
        String msg = greet();
        System.out.println(msg);
    }
    static String greet(){
        String greeting = "How are you";
        return greeting;

    }
}
