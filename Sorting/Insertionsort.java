package Sorting;
//TIME COMPLEXITY : BEST CASE = O(n) Average=Worst=O(n^2)
//SPACE COMPLEXITY : O(1)
//STABLE 

public class Insertionsort {
    public static void insertionSort(int[] a1){
        for (int i = 0; i < a1.length; i++) {
            int j=i-1;
            int b=a1[i];
            while (j>=0&&b<=a1[j]) {
                a1[j+1]=a1[j];
                j=j-1;
            }
            a1[j+1]=b;
        }
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] a1=new int[]{3,7,1,9,4,2,6};
        insertionSort(a1);
    }
}
