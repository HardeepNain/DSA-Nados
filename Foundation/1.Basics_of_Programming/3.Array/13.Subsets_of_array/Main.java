//CFMB
package com.company;

import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }

        printSubsets(arr);
    }
    public static void printSubsets(int arr[]){
        int n = arr.length;

        int tw = (int)Math.pow(2,n);

        for(int num = 0 ; num < tw ; num++){
            int bNum = getBinary(num);
            printSeq(arr,bNum);
        }
    }
    public static void printSeq(int arr[],int bNum){
        int n = arr.length;
        int idx = n-1;
        String str = "";                       //String str = "";
        while(n != 0){                         //for(int idx = arr.length-1; idx>=0; idx--)
            int rem = bNum%10;                 //  {
            bNum = bNum / 10;                  //      int rem = bNum%10;
            if(rem == 0){                      //      bNum = bNum / 10;
                str = "-\t"+str;               //      if(rem == 0){
            }else{                             //          str = "-\t"+str;
                str = arr[idx]+"\t"+str;       //      }
            }                                  //      else{ 
            idx--;                             //          str = arr[idx]+"\t"+str;
            n--;                               //      }
        }                                      //  }
        System.out.println(str);               //System.out.println(str);
    }
    public static int getBinary(int n){
        int rv = 0;
        int pow = 1;

        while(n > 0){
            int rem = n%2;
            rv = rv + (rem*pow);
            pow = pow*10;
            n = n / 2;
        }

        return rv;
    }

}
