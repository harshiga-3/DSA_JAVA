
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter total no of element");
		
		int []queue=new int[10];
		int size=sc.nextInt();
		
		
		int front= -1 ;int rear=-1;
		
		
		for(int i=0;i<size;i++)
		{
		    
		System.out.println("enter option");
		
	int 	opt=sc.nextInt();
		
		
		switch (opt){
		    case 1:
		        if(rear ==queue.length -1){
		            System.out.println("queue is full");
		        }else{
		        if(front == -1 ) front =0;
		        System.out.println("enter insert");
		        queue[++rear]=sc.nextInt();
		        }
		        
		        break;
		        case 2:
		            if(front !=-1 &&  rear >= front ){
		            int tail=queue[front];
		            System.out.println("delete "+tail);
		            front++;
		            }
		            else{
		                System.out.println("queue is empty");
		            }
		            break;
		            
		            case 3:
		                if(rear>=front && front != -1){
		                System.out.println("front "+queue[front]);
		                }
		                else{
		                    System.out.println("queue is empty");
		                }
		                break;
		            
		}}
		
		
		
		for( int i=front;i<=rear;i++)
		{
		    System.out.println(queue[i]);
		}
		
		
		
		
		                
		
		
		
		
	
		
	}
}
