
  
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution2 {
	public static ListNode head=null;
	public static void addToTheLast(ListNode node) {
         
  if (head == null) {
   head = node;
  } else {
   ListNode temp = head;
   while (temp.next != null)
   {
    temp = temp.next;
   }
   temp.next = node;
  }
 }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int n=0;
        int st=0;
        ListNode head=new ListNode();
		addToTheLast(head);
		//temp.next=new ListNode(0);
        while(l1!=null &&l2!=null)
        {
			
          st=n+l1.val+l2.val;
            l1=l1.next;
            l2=l2.next;
			if(st>=10)
			{
            n=st/10;
            st=st%10;
			}
			addToTheLast(new ListNode(st));
            
        }
		while(l1!=null)
		{
			
			
			addToTheLast(new ListNode(l1.val));
			l1=l1.next;
		}
		while(l2!=null)
		{
			
			addToTheLast(new ListNode(l2.val));
			l2=l2.next;
		}
		head=head.next;
		
		 while(head!=null)
		{
			System.out.println(head.val+" ");
			head=head.next;
		}
		
        return head;
    }
    public static void main (String[] a)
    {
        Solution2 s= new Solution2();
       ListNode head1=new ListNode();
       ListNode head2=new ListNode();
	   ListNode head=new ListNode();
        head1=new ListNode(2);
       head1.next=new ListNode(4);
        head1.next.next=new ListNode(3);
		head1.next.next.next=new ListNode(5);
        head2=new ListNode(5);
        head2.next=new ListNode(6);
        head2.next.next=new ListNode(4);
        head=s.addTwoNumbers(head1,head2);
        
        while(head!=null)
		{
			System.out.println(head.val+" ");
			head=head.next;
		}
        
        
        
        
        
        
    }
    
}