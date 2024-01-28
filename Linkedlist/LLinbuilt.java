package Linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;



public class LLinbuilt {
    public static void main(String[] args) {

        LinkedList<Integer> l1=new LinkedList<>();

        //Adding elements in LL
        l1.add(3);
        l1.add(7);
        l1.add(10);
        l1.add(2, 6);

        //Remove elements in LL
        l1.remove(2);
        l1.removeFirst();
        l1.removeLast();

        Iterator it=l1.iterator();
        while(it.hasNext()){
          System.out.print(it.next()+" ");
        }
        System.out.println();
        System.out.println(l1.size());//Length of LL
        
        boolean b1=l1.contains(7);
        System.out.println(b1);

        //copy elements from stack to linked list

        Stack<String> s1=new Stack<>();
        LinkedList<String> l2=new LinkedList<>();

        s1.push("hello");
        s1.push("Everyone");
        l2.addAll(s1);
        
        
        Iterator it1=l2.iterator();
        while(it1.hasNext()){
          System.out.print(it1.next()+" ");
        }
        

    }
}
