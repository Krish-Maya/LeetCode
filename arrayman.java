import java.util.*;
class arrayman
{
  public static void main( String[] args)
  {
   int arr[]={13,2,4,15,12,10,5};
    int  n=arr.length;
	 for( int i=0;i<n-2;i++)
	 {
	    for(int j=i+2;j<n;j++)
		{
		   if( arr[i]<arr[j])
		   {
		     int tem=arr[i];
			 arr[i]=arr[j];
			 arr[j]=tem;
			 }
			 j++;
			 }
			 i++;
			 }
			  for(int i=0;i<n;i++)
			 {
				 System.out.print(arr[i]+" ");
			 }	
		 for( int i=1;i<n-1;i++)
	         {
	    for(int j=i+2;j<n;j++)
		{
		   if( arr[i]>arr[j])
		   {
		     int tem=arr[i];
			 arr[i]=arr[j];
			 arr[j]=tem;
			 
			 }
			 j++;
			 }
			 i++;
			 }
			 for(int i=0;i<n;i++)
			 {
				 System.out.print(arr[i]+" ");
			 }
			 }
}