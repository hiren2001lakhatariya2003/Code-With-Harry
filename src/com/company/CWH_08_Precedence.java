package com.company;

public class CWH_08_Precedence {
    public static void main(String[] args) {
       /* int a = 6/5-34*2; // left to right associativity

        System.out.println(a);
    */
        int b=1;
        int c = 4;
        int a = 5;

        int ans = b*b - (4*a*c)/(2*a);
        System.out.println(ans);
    }
}
