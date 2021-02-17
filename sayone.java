import java.util.*;
class sayone
{
public static void main ( String[] rgs)
{
   System.out.println(" Enter the counts");
   Scanner sc = new Scanner(System.in);
   int n=sc.nextInt();
   String str=countsay(n);
    System.out.println("  counts= "+str);
   }
   
   public static String countsay( int in)
   {
	   //String s1="1";
	    String res="1";
	   for ( int i=0;i<in;i++)
	   {
		    res= counts(i,res);
	   }
	   return res;
   }
   
   public static String counts(int n,String nn)
   {
   
     String tt="";
	 int count;
	 if (n==0)
	 {
		 return nn;
	 }
	 if (n==1)
	 {
		 return nn+nn;
	 }
	 if(n>1)
	 {
	System.out.println("word"+nn);
	System.out.println("word lenth"+(nn.length()-1));
	 for ( int i=0;i<(nn.length()-1);i++)
	 {
		 System.out.println("i count"+i);
		 count=1;
	 if (nn.charAt(i)==nn.charAt(i+1))
	 {
		 int tr=i;
		 while(tr<(nn.length()-1)&&nn.charAt(tr)==nn.charAt(tr+1))
		 {
		 count++;
		 tr++;
		 }
		 if(tr-i==1)
		 {
			 i++;
		 }
		 else{
			 i=tr;
		 }
		 
		
	    tt=tt+ String.valueOf(count)+nn.charAt(i);
		System.out.println("i count"+i);
	 }
	 else
	 {
		 
	 tt=tt+ (String.valueOf(count)+nn.charAt(i)+String.valueOf(count)+nn.charAt(i+1));
	 i++;
	 }
	 }
	 return tt;
	 }
	 return "ll";
   
   } 
}
	 
  