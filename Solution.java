
    
import java.util.*;

class Solution

  {
     ListNode head;
	public static void addTwoNumbers(ListNode l1, ListNode l2) 
	{
		
		int c=0,d,t;
		System.out.println( "Results");
		while(l1!=null)
		{
	
		d=l1.data+l2.data+c;
		t=d;
		d=d%10;
		c=t/10;
		System.out.print(d+" ");
		l1=l1.next;
		l2=l2.next;
		}
		
		
        
    }
	 
	  static class ListNode 
	  {
		 
	    int data;
		 ListNode next;
		ListNode( int d)
		{
		   data=d;
		   next=null; 	
		  }
	  }
		  public void printlist()
		  {
			  ListNode n=head;
			while( n!=null)
			{
			   System.out.print(n.data+" " );
			   n=n.next;
			   }
			   System.out.println(" ");
		  }
		 
		   
		  
		  
		  public static void main ( String[] args )
		  {
		  
		    Solution ll=new Solution();
			Solution l2= new Solution();
			ll.head=new ListNode(9);
			ListNode n2=new ListNode(2);
			ListNode n3=new ListNode(5);
			ll.head.next=n2;	
			n2.next=n3;
			l2.head=new ListNode(4);
			ListNode s2=new ListNode(5);
			ListNode s3=new ListNode(6);
			l2.head.next=s2;	
			s2.next=s3;
			ll.printlist();
			l2.printlist();
			addTwoNumbers(ll.head,l2.head);
			
			}	
			
			   }
  
			   
			
			
			
			
		  
		  