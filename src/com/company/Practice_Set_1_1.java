package com.company;

import java.util.Scanner;
// sum of three numbers
public class Practice_Set_1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int sum=0;
        int input;
        for(int i=0;i<size;i++)
        {
            input=sc.nextInt();
            sum+=input;
        }
        System.out.println(sum);
    }
}
