import java.util.*;
class Queue{
    int max;
    int rear;
    int front;
    int []arr;
    Queue(int size){
      front=0;
      rear=-1;
      max=size;
      arr=new int[max];
      
    }
    
    public  void enqueue(int x)
    {
        if(rear==max-1)
        {
            System.out.println("queue in overflow");
        }
        else{
            rear++;
            arr[rear]=x;
        }
    }
    
    public  void dequeue()
    {
        if(rear<front)
        {
            System.out.println("queue is underflow");
        }else{
            System.out.println("delete: "+arr[front]);
            front++;
        }
    }
    
    public  void peek()
    {
        if(front>rear)
        {
            System.out.println("queue is underflow");
        }else{
            System.out.println("peek"+arr[front]);
        }
    }
    
    public  void display(){
        for(int i=front;i<=rear;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int op=sc.nextInt();
	    Queue q=new Queue(n);
/*	q.enqueue(10);
	q.enqueue(20);
	q.enqueue(30);
	q.enqueue(40);
	q.dequeue();
	q.display();
	q.peek();
	q.display();*/
	
	
	while(op>0)
	{
	    System.out.println("enter option");
	    
	    int c=sc.nextInt();
	    
	    switch(c){
	        case 1:
	            int val=sc.nextInt();
	            q.enqueue(val);
	            break;
	            
	       case 2:
	           q.dequeue();
	           break;
	           case 3:
	               q.peek();
	               break;
	               
	       case 4:
	           q.display();
	           break;
	           
	           default:
	           System.out.println("not valid");
	           
	           op--;
	    }
	}
	
	
	
	
	}
}