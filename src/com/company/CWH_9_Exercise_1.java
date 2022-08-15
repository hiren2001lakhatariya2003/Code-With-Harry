package com.company;

import java.util.Scanner;

public class CWH_9_Exercise_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[]= new int[n];
        float sum=0;
        for (int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
            sum += a[i];
        }
        System.out.println("sum: "+sum+"\npercentage: "+(sum*100)/(n*100)+"%");

    }
}
