package Array;

import java.util.Arrays;

/**
 * SingleD
 */
public class SingleD {

    //LINEAR SEARCH
    public static int search(int array[],int key) {
        for (int i : array) {
            if(array[i]==key)
               return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a1=new int[]{3,6,2,9,5,8,1};
        System.out.println("Before sort");
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i]+" ");
        }
        System.out.println();
        Arrays.sort(a1);

        System.out.println("After sort");
         for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i]+" ");
        }
        int indexValue=search(a1,9);
        if(indexValue==-1)
           System.out.println("Element not found");
        else
           System.out.println("Element found");
    }
}