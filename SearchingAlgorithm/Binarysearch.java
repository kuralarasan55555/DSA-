package SearchingAlgorithm;

// TIME COMPLEXITY: BC=O(1),AC=WC=O(log n)
// SPACE COMPLEXITY O(1)

//DIVIDE AND CONQUER 
//RULE FOR BINARY SEARCH ONLY SORTED ARRAY ABLE TO PERFORM BINARY SEARCH
public class Binarysearch {

    public static int binarysearch(int[] a1,int key,int s,int e){
        int mid=(s+e)/2;
        if(s<=e){
            if(a1[mid]==key)
                return mid;
            else if(a1[mid]>key)
                return binarysearch(a1, key, s, mid-1);
            else 
                return binarysearch(a1, key, mid+1, e);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a1=new int[]{1,3,5,6,8,9}; //SORTED ARRAY
        int index=binarysearch(a1, 9, 0, a1.length-1);
        if(index==-1)
            System.out.println("Element not found in the given array");
        else
            System.out.println("Element found at index "+index);
    }
}
