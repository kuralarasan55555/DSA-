package Hashing;


import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

// CONCEPT OF HASH ABOUT INPUT AS KEY AND OUTPUT AS HASH CODE  
//HASH CODE IN ALL WRAPPER CLASS LIKE INTEGER,STRING AND SO ON
public class Hash {
    public static void main(String[] args) {
       HashMap<String,Integer> student=new HashMap<String,Integer>();

    //    Hashtable<String,Integer> student=new Hashtable<String,Integer>();  //SAME IMPLEMENTATION FOR HASH MAP AND HASHTABLE 
       student.put("priya", 3);
       student.put("puja", 2);
       student.put("rohit", 7);

       String a="fnejf";
       System.out.println(a.hashCode());//HASH CODE 
    

       //ITERATE OVER AN HASHMAP
       
       Set<String> data=student.keySet();
       for (String s : data) {
         System.out.println("KEY :"+student.get(s)); //Only given key displayed
         System.out.println("Hash Code:"+s.hashCode());//HASH CODE 
         System.out.println("Modulo Hash Code:"+s.hashCode()%10);//REDUCE HASH CODE WITH SINGLE DIGIT
         System.out.println();
       }

       Set<Map.Entry<String,Integer>> data1=student.entrySet();
       for (Map.Entry<String,Integer> e : data1) {
          System.out.println(e.getKey()+" "+e.getValue());
       }  
    }
}
