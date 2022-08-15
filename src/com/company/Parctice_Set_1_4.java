package com.company;

import java.util.Scanner;
// KM to MILES
public class Parctice_Set_1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float km = sc.nextInt();
        float miles = km*0.6213712f;

        System.out.println(miles);
    }
}
