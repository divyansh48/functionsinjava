package com.divyansh;

import java.util.Scanner;

public class returnsum {
    public static void main(String[] args) {

        int ans = sum();
        System.out.println(ans);
    }

    static int sum(){
        int num1, num2, sum;
        Scanner in = new Scanner(System.in);

        System.out.print("enter the first number:");
        num1 = in.nextInt();
        System.out.print("enter the second number:");
        num2 = in.nextInt();

        sum = num1 + num2;

        return sum;

    }
}
