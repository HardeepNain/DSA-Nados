package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = 0, rn = 0;
        while (n != 0)
        {
            x = n % 10;
            // rn=rn*10+x; // if you want to really reverse a number rather tha printing from back side
            System.out.println(x);
            n = n / 10;
        }
    }
}
