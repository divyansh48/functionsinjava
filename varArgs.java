package com.divyansh;

import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {

        fun(2,3,4,5,6,7,7,9,0);

        multiple(2,3,"kunal" , "divyansh");


        }

    static void fun(int...v) {
        System.out.println(Arrays.toString(v));
    }

    private static void multiple(int i, int i1, String kunal, String divyansh) {


    }

}



