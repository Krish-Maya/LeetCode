import java.util.*;
class Solution19 {
	 ListNode head;
  public class ListNode {
	 
      int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
	 public void append(int new_data) 
    { 
        ListNode new_node = new ListNode(new_data); 
        if (head == null) 
        { 
            head = new ListNode(new_data); 
            return; 
        } 
        new_node.next = null; 
        ListNode last = head;  
        while (last.next != null) 
            last = last.next; 
        last.next = new_node; 
        return; 
    } 
  
    public void printList() 
    { 
        ListNode tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.val+" "); 
            tnode = tnode.next; 
        } 
    } 
  
 

    public ListNode removeNthFromEnd(ListNode head, int n) 
	{
		
        if (head == null) 
            return head; 
        ListNode temp = head; 
        if (n == 0) 
        { 
            head = temp.next;   // Change head 
            return head; 
        } 
        for (int i=0; temp!=null && i<n-1; i++) 
            temp = temp.next; 
        if (temp == null || temp.next == null) 
            return head; 
        ListNode next = temp.next.next; 
  
        temp.next = next;  
		return head;
     
        
    }
	public static void main(String[] args)
	{
	   Solution19 s= new Solution19();
	  // ListNode ln= new ListNode();
	   int n[]={1,2,3,4,5};
	   int r=1;
	    int temp=n.length-r;
	  
	   for(int i=0;i<n.length;i++)
	  {
	  s.append(n[i]);
	  }
	  s.printList();
	
	  ListNode ln=s.removeNthFromEnd(s.head,temp);
	   s.printList();
	 //System.out.println(s.head);
	   
	   
	   
	}
}