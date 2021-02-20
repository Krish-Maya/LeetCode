import java.util.*;
class dividenum
{
  public static void main ( String[] a)
  {
     Scanner sc= new Scanner( System.in);
	 int d=sc.nextInt();
	 int di=sc.nextInt();
	 di=Math.abs(di);
	 int n= d+di;
	 int count=0,t=di;
	 boolean b=false;
	 while(di<n)
	 {
	   di=di+t;
	   count++;
	   if(di==d)
	   {
	   b=true;
	   break;
	   }
	   }
	   if (b)
	   {
	   System.out.println(" value"+(count+1));
	   }else
	   {
		   System.out.println(" value"+(count-1));
	   }
  }
}
	   