package com.company;
import java.util.*;

public class Main{

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int a = 0, b = 1, c = 0;
        for(int i =0;i<n;i++)
        {
            c=a+b;
            System.out.println(a);
            a=b;
            b=c;

        }
    }
}

/*
we print a because it the only number which travel all the places for more refer image.
*/