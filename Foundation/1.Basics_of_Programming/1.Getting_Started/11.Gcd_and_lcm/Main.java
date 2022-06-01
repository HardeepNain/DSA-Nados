package com.company;
import java.util.*;

public class Main{

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int gcd=0;
        int divisior=n1;
        int dividend=n2;
        int remainder=1;
        while(remainder!=0)                             //if  argu = divident%divisior!=0
        {
            remainder = dividend%divisior;              //then gcd=divisior
            dividend=divisior;                          //b/c in that case condition check first and fail
            divisior=remainder;                         //thats why last iteration not hapened.
        }
        gcd=dividend;
        int lcm = (n1*n2)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}


/* LESS OPTIMIZED APPROACH 

int num = Math.min(n1,n2);

for(int div = num/2; div>=2; div--){
    if(n1%div== 0 && n2 % div == 0){
        System.out.println(div);   // gcd
        System.out.println(n1*n2/div); // lcm
      break;
    } 
}

*/