import java.io.*;
import java.util.*;

public class Main {

  public static int[] mergeSort(int[] arr, int lo, int hi) {
    if(lo == hi){
        return new int[]{arr[lo]};
    }
    int mid = (lo + hi) / 2;
    int lpart[] = mergeSort(arr,lo,mid);
    int rpart[] = mergeSort(arr,mid+1,hi);
    return mergeTwoSortedArrays(lpart,rpart);
  }

  //used for merging two sorted arrays
  public static int[] mergeTwoSortedArrays(int[] a, int[] b){
    System.out.println("Merging these two arrays ");
    System.out.print("left array -> ");
    print(a);
    System.out.print("right array -> ");
    print(b);
    int i = 0, j =0, k = 0;
    int[] ans = new int[a.length + b.length];
    while(i < a.length && j < b.length){
        if(a[i] <= b[j]){
          ans[k] = a[i];
          i++;
          k++;
        }else{
          ans[k] = b[j];
          j++;
          k++;
        }
    }

    while(i < a.length){
      ans[k] = a[i];
      k++;
      i++;
    }

    while(j < b.length){
      ans[k] = b[j];
      k++;
      j++;
    }
    
    return ans;
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int[] sa = mergeSort(arr,0,arr.length - 1);
    System.out.print("Sorted Array -> ");
    print(sa);
  }

}


/*

Logic behind logic :

If there is only one element in an array, then the array will always be sorted.

To hum kya krte hai ki mid nikalte hai 
aur array ko do part me divide (actually not dividing) krke call lgate hai
jisse array ka size small hota jaata hai
aur jab at last sirf ek element reh jaata hai tab hum us element ko ek array me dlwake return kr dete hai
aur kyunki ek hi element hai to wo array sorted hi hoga 
isi type se dono calls se ek element contained array mil jaata hai 
jise hum fir merge hone ke liye bhej dete hai 
jiska code hume already aata hai
*/