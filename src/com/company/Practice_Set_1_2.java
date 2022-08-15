package com.company;

import java.util.Scanner;
// find CGPA
public class Practice_Set_1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        float sum=0;
        float input;
        for(int i=0;i<size;i++)
        {
            input=sc.nextInt();
            sum+=input;
        }
        float cgpa = sum/(size*10);
        System.out.println(cgpa);

    }
}
