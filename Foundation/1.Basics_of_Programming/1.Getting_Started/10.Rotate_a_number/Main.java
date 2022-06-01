package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        // BETTER OPTIMIZED CODE
        int n = scn.nextInt();
        int k = scn.nextInt();
        int d = 0, temp = n;

        while (temp != 0) {
            d++;
            temp = temp / 10;
        }

        int ek = k % d;
        if (ek < 0) {
            ek = d + ek;
        }

        int anspow = 1, pow = 1, i = ek, j = d - ek;

        while (i != 0) {
            pow = pow * 10;
            i--;
        }

        int a = n / pow;
        int b = n % pow;

        while (j != 0) {
            anspow = anspow * 10;
            j--;
        }
        int rtn = b * anspow + a;
        System.out.println(rtn);

    }
}
