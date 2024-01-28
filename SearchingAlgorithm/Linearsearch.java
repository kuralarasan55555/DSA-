package SearchingAlgorithm;
// TIME COMPLEXITY: BC=O(1),AC=WC=O(n)
// SPACE COMPLEXITY O(1)
import java.util.Scanner;

//BRUTE FORCE=STRAIGHT FORWARD METHOD OF SEARCHING ELEMENTS
public class Linearsearch {
    public static void main(String[] args) {
        int al[]=new int[]{6,4,5,8,2,1,9};
        Scanner sc=new Scanner(System.in);
        int count=0;

        System.out.println("ENTER THE ELEMENT TO BE SEARCHED");
        int key=sc.nextInt();

        for(int i=0;i<al.length;i++){
            if(al[i]==key){
                System.out.println("Element is at the index "+i);
                count++;
            }
        }
        if(count==0){
            System.out.println("Element not found in the given array");
        }
    }
}
