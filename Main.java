
import java.util.*;
class Node{
    int data;
    Node next;
    
    Node(int x){
        this.data=x;
        this.next=null;
    }
}
public class Main
{
      static Node head=null;
    
    public static  void insert(int x){
        
       
        Node newnode =new Node(x);
        
       
        
        if(head==null)
        {
            head=newnode;
        }
        else{
            Node temp=head;
            
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            
            temp.next=newnode;
        }
        
        
        
    }
    
    
    public static void insermid(int x,int pos){
        Node newnode =new Node(x);
        
       
        Node temp=head;
        
        if(temp!=null && temp.data!=pos)
        {
            
            temp=temp.next;
        }
        
        if(temp!=null){
        
        newnode.next=temp.next;
        temp.next=newnode;
        }
       
        
        
    }
    
    public static void display(){
        
        Node temp=head;
       
		while(temp!=null)
		{
		    System.out.println(temp.data);
		    temp=temp.next;
		}
    }
	public static void main(String[] args) {
	    
	    
	    
	    Scanner sc=new Scanner(System.in);
	    for(int i=0;i<3;i++){
	    
	    System.out.println("enter the number");
		
		int n=sc.nextInt();
		
		insert(n);
	    }
		insert(2);
		insert(3);
		insert(4);
		insert(5);
		
		
		insermid(300,2);
		
	    
	    
	    display();
		
		
	}
}
