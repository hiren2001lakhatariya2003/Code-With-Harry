package com.company;
import java.util.Scanner;
public class CWH_05_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        boolean b1 = sc.hasNextInt(); // for expression validity check
//        System.out.println(b1);

//        String str = sc.next(); // for only one word
        String str = sc.nextLine(); // for whole string
        System.out.println(str);
    }
}