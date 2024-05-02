package com.divyansh;

public class nochange {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        swap(a,b);
        System.out.println(a + " " + b);
//        no chnage done in the value of a and b
//        because the value of refrence is changed not modified if we make any modifications in the
//        values then only change will be displayed


    }

    static void swap(int a, int b) {
        int temp = a;
        a=b;
        b=temp;


    }


}
