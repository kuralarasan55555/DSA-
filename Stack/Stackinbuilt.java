package Stack;

import java.util.Iterator;
import java.util.Stack;

public class Stackinbuilt {
    //Stack can be implemented inbuilt either using Collection or Vector [LIFO] 
    //INSERT AND DELETE AT TOP
    public static void main(String[] args) {
        // Stack s1=new Stack();
        Stack<Integer> s1=new Stack<>();


        //INSERT OPERATION ON STACK
        s1.push(9);
        s1.push(5);
        s1.push(2);
        System.out.println(s1);

        //DELETE OPERATION ON STACK
        s1.pop();
        System.out.println(s1);

        //PEEK OPERATION ON STACK
        System.out.println(s1.peek());
        
        //Check stack empty or not
        boolean status=s1.empty();
        System.out.println(status);

        //SEARCH OPERATION ON STACK
        int indexfound=s1.search(4);
        System.out.println(indexfound);
        
        //ITERATE OVER A STATCK
        System.out.println("ITERATE OVER A STACK");
        Iterator it=s1.iterator();
        while(it.hasNext())//CHECK WHETHER NEXT VALUE PRESENT
        {
            Object s2=it.next();//FETCH THE NEXT VALUE
            System.out.print(s2+" ");
        }
        System.out.println();

        //SIZE 
        System.out.println("The size of a stack :"+s1.size());

        //SORT OPERATION
        s1.sort(null);
        System.out.println(s1);
    }
}
