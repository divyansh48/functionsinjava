package com.divyansh;

import java.util.Arrays;

public class change {
    public static void main(String[] args) {
//        create an array
        int[] arr = {1,2,3,4,5};
        changes(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void changes(int[] num) {
        num[0] = 66;
//      change will occur this time because the value of refrence is modified this time not a new
//        object is created so the change will be displayed in the output
    }
}
