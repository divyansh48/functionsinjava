


package com.divyansh;


import java.util.Scanner;

public class sumusingfunc {
    public static void main(String[] args) {
        sum();


        }

    static void sum(){
        int num1, num2, sum;
        Scanner in = new Scanner(System.in);

        System.out.print("enter the first number:");
        num1 = in.nextInt();
        System.out.print("enter the second number:");
        num2 = in.nextInt();

        sum = num1 + num2;

        System.out.println("the sum is " + sum);
    }

}
