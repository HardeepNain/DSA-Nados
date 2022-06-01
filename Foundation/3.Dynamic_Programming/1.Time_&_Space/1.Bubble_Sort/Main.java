/*
SP Nain Optimization -- Maine swapCount byaya aur dekha agr kisi bhi itrth iteration me (which may be 2nd,3rd any iteration) 
                        agr swapCount 0 hua to that means ki koi swapping nhi hui aur us iteration se pahle saare element sor ho chuke hai
                        to ab baki bchi hui iterations krne ka koi matlab nhi bnta isiliye hum for loop ko break krke bahar aa jaate hai 
                       
count to sirf check karne ke liye bnaya tha ki actually me operations decrease ho rhe hai kya.

Agr iss code ko nados pe run kroge to test cases fail honge kyunki swapping aur comparing jitni baar print hone chahiye the 
wo loop bich me break hone ke karn print nhi honge
isiliye swapCount ko comment krke hi code run krna aur submit krna nados pe.
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        // int count = 0;
        for (int itr = 1; itr <= n - 1; itr++) { // for n lements there wil be n-1 iterations in BS [#1]
            // int swapCount = 0;
            for (int j = 0; j <= n - itr - 1; j++) { // In each iteration one element get sorted so no. of
                if (isSmaller(arr, j + 1, j)) { // chekcs decrease // j has to bestart from zero b/c
                    // swap // in array indexing start from zero
                    swap(arr, j + 1, j);
                    // swapCount++;

                }
                // count++;
            }
            // if(swapCount==0){
            // break;
            // }
        }
        // System.out.println(count);

    }

    // used for swapping ith and jth elements of array
    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // return true if ith element is smaller than jth element
    public static boolean isSmaller(int[] arr, int i, int j) {
        System.out.println("Comparing " + arr[i] + " and " + arr[j]);
        if (arr[i] < arr[j]) {
            return true;
        } else {
            return false;
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        bubbleSort(arr);
        print(arr);
    }

}

/*

  // MB Code : Without swapCount and count
  public static void bubbleSort(int[] arr) {
  int n = arr.length;
  
  for(int itr = 1 ; itr <= n-1 ; itr++){ // for n lements there wil be n-1
  iterations in BS
  for(int j = 0 ; j <= n-itr-1 ; j++){ // In each iteration one element get
  sorted so no. of
  if(isSmaller(arr,j+1,j)) { //chekcs decrease // j has to bestart from zero
  b/c
  //swap // in array indexing start from zero
  swap(arr,j+1,j);
  }
  }
  }
  }
  
*/

/*
 * #1. Agr kisi array me 5 element hai aur usme se 4 apni shi jagah pe hai to
 * 5th bhi apni shi jagah pe hi hoga
 */