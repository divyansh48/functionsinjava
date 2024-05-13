package com.divyansh;

public class scope {
    public static void main(String[] args) {

        int a = 10;   // this is how initializing takes place only if we write int or any datatype in front of any variable
        int b = 20;

        {
//            int a =20; you cannot initialize the same variable inside or even inside the same function after once being initialized
            a = 30; //but you can modify the variable which was initialized outside the block but not initialize the same variable inside the block
            int c = 60;
            System.out.println(c);
//            the variable initialized inside the block will remain inside the block only
        }


//        System.out.println(c); //this will give error bcz c is initialized inside the block

        System.out.println(a); // will give updated one even if updated inside the block
//        this will run correctly
    }

    static void sum(){
        int num1 = 3;
        int num2 = 4;
        int sum = num1 + num2;

//        System.out.println(c); this will give erroe bcz variables which are only defined in thid function can be used only in this function.
        System.out.println(num1);
        System.out.println(sum);
    }




}
