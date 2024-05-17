package com.divyansh;

import java.util.Scanner;

public class primefunc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(isprime(n));;
    }
    static boolean isprime(int a){
        if (a <=1){
            return false;

        }
        int c = 2;
        while (c*c <= a){
            if (a%c==0){
                return false;

            }
            c++;


        }
        if (c*c>a){
            return true;
        }
        return false;

    }
}
