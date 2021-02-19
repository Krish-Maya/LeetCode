import java.util.*;
class sumone
{
  public static void main ( String[] args)
  {
     System.out.println(" Enter String");
	 int[] arr= {0};
	 System.out.print(" Input :");
	 for(int a: arr)
	 {
	 System.out.print(a+" ");
	 }
	 int n=arr.length;
	 if(n>2)
	 {
	 check( arr,n);
	 }
	 else 
	 {
		  System.out.println(" ");
		 System.out.print(" Output :");
		 System.out.print("[");
		for(int a: arr)
	 {
	 System.out.print(a+" ");
	 }
	 System.out.println("]");
	 }
  }
	 public static void check(int[] n, int len)
	 {
		 for(int i=0; i<len-2;i++)
		 {
			for( int j=i+1;j<len;j++)
			{
				for( int k=j+1;k<len;k++)
				{
					if((n[i]+n[j]+n[k])==0)
					{
					System.out.println("["+n[i]+","+n[j]+","+n[k]+"]");
					System.out.println(" ");
					}
				}
			}
			
		 }
	 }
	 }