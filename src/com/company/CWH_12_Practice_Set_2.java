package com.company;

import java.util.Scanner;

public class CWH_12_Practice_Set_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //(1) what is the result of floating expression float a = 7/4*9/2

      /* float a = 7/4.0f*9/2.0f;
        System.out.println(a);*/
//        (2) Write a Java program to encrypt a great by adding 8 to it.Decrease it to show the correct grade

        /*char grade='B';
        grade=(char)(grade+8);
        System.out.println(grade);

        grade=(char)(grade-8);
        System.out.println(grade);*/

        //(3) Use comparison operator to find out whether a given number is greater than user Entered number or not

      /* int a = sc.nextInt();
        System.out.println(a>8);*/

        // (4) write the following expression

        /*float v = sc.nextFloat();
        float u = sc.nextFloat();
        float a = sc.nextFloat();
        float s = sc.nextFloat();

        float ans = v * v - (u * u) / (2 * a * s);
        System.out.println(ans);*/

//        (5) Find the value of following expression

        int x = sc.nextInt();
        int a = x*49/x+35/7;
        System.out.println(a);

    }
}