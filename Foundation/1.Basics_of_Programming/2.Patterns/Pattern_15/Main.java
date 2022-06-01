package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Manisha Ka code

        int n = scn.nextInt();

        int valc = 1;                         //valc represent ki ek row me kitni values print hogi
        int spc = n / 2;
        int rstr = 1;

        for (int r = 1 ; r <= n; r++)
        {

            //print spaces
            for (int c = 1; c <= spc; c++)
            {
                System.out.print("\t");
            }

            //print values
            int val = rstr;                      // har row ki values usi row no. se start ho rhi h
            for (int c = 1; c <= valc; c++)
            {
                System.out.print(val + "\t");

                if(c<= valc/2)                   //kyonki addhe column cover karne k baad val kam hone lag jaati hai
                {
                    val++;
                }
                else
                {
                    val--;
                }
            }
            System.out.println();
            if (r <= n / 2)
            {
                spc--;
                valc+=2;
                rstr++;
            }
            else if (r > n / 2)
            {   spc++;
                valc-=2;
                rstr--;
            }

        }
    }
}

