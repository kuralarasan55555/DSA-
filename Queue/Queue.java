package Queue;

class QueueusingArray{

    //FIFO [ENQUEUE AT REAR] [DEQUEUE AT FRONT]   INITIAL FRONT=REAR=0
    int rear,front;
    int capacityQueue;
    static int[] q1;//1 D ARRAY

    QueueusingArray(int size){
        capacityQueue=size;
        q1=new int[capacityQueue];
    }
    
    void enqueue(int value){
        if(rear==capacityQueue){
            System.out.println("QUEUE IS ALREADY FULL,YOU CANNOT INSERT ELEMENT");
        }
        else{
            q1[rear]=value;
            rear++;
        }
    }  
    void dequeue(){
        if(rear==0){
            System.out.println("QUEUE IS EMPTY,THERE IS NOTHING TO DELETE");
        }
        else{
            for(int i=0;i<rear-1;i++){
                q1[i]=q1[i+1];
            }
            rear--;
        }
    }
    void display(){
         if(rear==0){
            System.out.println("QUEUE IS EMPTY,THERE IS NOTHING TO DISPLAY");
        }
        else{    
            for(int i=0;i<rear;i++){
               System.out.print(q1[i]+" ");
            }
        }
    }

}
public class Queue {
    public static void main(String[] args) {
       QueueusingArray q=new QueueusingArray(5);
       q.enqueue(2);
       q.enqueue(4);
       q.enqueue(8);
       q.display();
       q.dequeue();
       System.out.println();
       q.display();

   

    }
}
