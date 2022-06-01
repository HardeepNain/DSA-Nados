package com.company;

import java.util.*;

public class Main{

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 1; i*i<=n; i++)     //this is a code to print perfect sq. no. upto n
        {
            System.out.println(i*i);
        }
    }
}

// No. of bulb toggles == no. of factors
// only bulb having odd no. of factors are on.
// only perfect squares have odd no. of factors