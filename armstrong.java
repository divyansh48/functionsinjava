package com.divyansh;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(isarm(n));

    }
    static boolean isarm(int n){
        int original = n;
        int sum = 0;

        while(n>0){
            int rem = n % 10 ;
            int cube = rem * rem * rem;
            sum += cube;
            n = n/10;
        }

        if (sum == original){
            return true;

        }
        return false;


    }
}
