import java.util.*;

class longstr
{
   static String ss ="";
  public static void main(String[] args) 
  {
  
     String s= "abcabcab";
	 
	  
	  int len= findlongstring(s);
	  System.out.println("original String :"+s);
	  System.out.println("Length :"+len);
	  System.out.println("Repeating Longest word :"+ss);
	  
  }
	  public static int findlongstring(String str)
	  
	  {
	      int res=0;
		  
	      int n =str.length();
		  for ( int i=0; i<n; i++)
		  {
		   for (int  j=i;j<n;j++)
		   {
		     if ( maxlen( str,i,j)==true)
			 {
				 if (res<(j-i+1))
					 {
			      ss=str.substring(i,j+1);
				 
					 }
			     res =Math.max( res,j-i+1);
			     
			}
			}
		  }
			
				 return res;
				 
				 }
  
	public static boolean maxlen ( String str, int i,int j)

      {
		  int k;
	       boolean b[]= new boolean[256];
           for ( k =i; k<=j;k++)
			   
			   {
                 if (b[str.charAt(k)]==true )
                     
                        return false ;
           			//System.out.println(	str.charAt(k)-'a');		
			b[str.charAt(k)]=true;
			   }
			
			return true ;
			
			}
		   
		   
		  

}