package Sorting;
//Time complexity: BEST=AVERAGE=WORST=O(n^2)
//Space complexit: O(1)

public class Selectionsort {
    public static void selectionSort(int[] al) {
        for (int i = 0; i < al.length; i++) {

            int mineleindex=i;//ASSUME FIRST ELEMENT AS MINIMUM INDEX

            for (int j = i+1; j < al.length; j++) {
                if(al[j]<al[mineleindex])
                    mineleindex=j;//UPDATE MINIMUM INDEX ELEMENT 
            }
            int swap=al[i];
            al[i]=al[mineleindex];
            al[mineleindex]=swap;
        }
        for (int i : al) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr=new int[]{3,7,8,2,1,9,4};
        selectionSort(arr);
    }
}
