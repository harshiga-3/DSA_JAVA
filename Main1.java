

import java.util.*;

class Node{
   public  int data;
    Node next;
    Node(int x)
    {
        this.data=x;
        this.next=null;
    }
}
public class Main1
{
    public static  Node head=null;
    
    public static void insert(int d)
    {
        Node newnode =new Node(d);
        Node temp=head;
        
        if(head==null)
        {
            head=newnode;
        }
        else{
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            
            temp.next=newnode;
        }
    }
    public static void delfirst()
    {
        
        if(head.next==null){
            head=null;
            System.out.println("first node delete");
        }
        else{
            head=head.next;
        }
    }
    
    public static void delmid(int d)
    {
       Node temp=head;
       Node prev=null;
       
       while(temp.data!=d && temp.next!=null)
       {
           prev=temp;
           temp=temp.next;
       }
       prev.next=temp.next;
    }
    
    public static void display(){
        Node temp=head;
        
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
	public static void main(String[] args) {
	    insert(10);
	    insert(20);
	    insert(30);
	    insert(40);
	    insert(50);
	    insert(60);
	    System.out.println("after insert");
	    display();
	    
	    delmid(30);
	    System.out.println("after delmid");
	    display();
	    delfirst();
	    System.out.println("after delfirst");
	    display();
	    
		
	}
}