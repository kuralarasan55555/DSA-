package Stack;


class StackusingArray {
   int top=-1; 

   int capacityStack;
   static int[] s1;

   StackusingArray(int size){
    capacityStack=size;
    s1=new int[capacityStack];
    System.out.println("STATCK CREATED");
   }

   boolean isEmpty(){
    return top==-1;
   }

   boolean isFull(){
    return top+1==capacityStack;
   }
   
   void push(int e){
      if(isFull()){
        System.out.println("Stack Overflow");
      }
      else{
        top=top+1;
        s1[top]=e;
      }
   }

   void pop(){
    if(isEmpty()){
       System.out.println("Stack Underflow");
    }
    else{
    for(int i=0;i<top;i++){
        s1[i]=s1[i+1];
    }
    top--;
   }
   }

   void peek(){
       if(isEmpty())
        System.out.println("STACK EMPTY UNABLE TO DISPLAY TOP ELEMENT");
      else
        System.out.println("The top element of statck :"+s1[top]);
      
   }

   void sort(){
    if(isEmpty())
        System.out.println("STATCK EMPTY UNABLE TO SORT STATCK");
    else{
      int i=0,j=0;
       while(i<top){
         if(s1[i]>s1[j]){
          s1[i]=s1[i]+s1[j];
          s1[j]=s1[i]-s1[j];
          s1[i]=s1[i]-s1[j];

         }
         if(j<top){
          j++;
         }
         else{
          i++;
          j=i;
         }
          
       }
      }
   }

   void display(){
    if(isEmpty())
        System.out.println("STATCK EMPTY UNABLE TO DISPLAY PLEASE ADD SOME VALUES");
    else{
      System.out.println("ELEMENTS IN STATCK ARE:");
        for(int i=0;i<top;i++)
          System.out.print(s1[i]+"->");
        System.out.println(s1[top]);
    }
   }
}
public class Stackim {
    public static void main(String[] args) {
        StackusingArray s=new StackusingArray(5);
        s.pop();
        s.sort();
        s.display();
        s.push(1);
        s.push(2);
        s.peek();
        s.display();
        s.pop();
        s.display();
        s.push(4);
        s.push(5);
        s.push(3);
        s.display();
        s.push(1);
        s.display();
        s.sort();
        s.display();
        s.push(9);


        // s.push(23);
        // s.push(28);
        // s.push(21);
        // s.push(20);
        // s.push(19);
        // s.display();
        // s.sort();
        // s.display();
      
        


    }
}
