import java.util.*;
class countalpha
{
  public static void main( String[] args)
  {
	  
   String str="a5b4",s="";
   int t= str.length()-1;
   for(int i=0;i<t;i++)
   {
     int temp=str.charAt(i+1)-'0';
	 
		 System.out.println("number"+str.charAt(i+1));
	 while(temp!=0)
	 {
	   s=s+str.charAt(i);
	   --temp;
	   }
	   i++;
	   }
	   System.out.println("String "+s);
	   }
	   }