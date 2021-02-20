class mergesort 
{
	static int count=0;
  public static void main ( String[] args )
  {
    int[] arr= { 12,11,9,60,80,40};
	 printarray(arr);
	 sort( arr,0,arr.length-1);
	 
	 printarray (arr);
	 }
	 public static void printarray( int[] ar)
	 {
	 int n= ar.length;
	    for( int i=0;i<n;i++)
		{
		  System.out.print ( ar[i]+ " " );
		}
		System.out.println( "" );
	}
    public static void sort ( int[] ar,int l ,int r )
	{
		 int mid ;
		  
      if ( l<r)
	  {
        mid = l+(r-l)/2;
		//System.out.println("value L"+l+"value mid"+mid+" " +r);
		sort( ar,l,mid);
		//System.out.println("value L"+l+"value mid"+mid+" " +r);
		sort( ar,mid+1,r);
		//System.out.println(" hello"+mid+""+r);
		merge(ar,l,mid,r);
		printarray(ar);
		
	  }
	  
	}
public static void merge( int[] arr,int l,int m,int r)
{
     for ( int i=l;i<r;i++)
	 {
for(int j=l;j<r;j++)
{   
     if(arr[j]>arr[j+1])
	 {
		 int temp=arr[j];
		 arr[j]=arr[j+1];
		 arr[j+1]=temp;
	 }
}
	 }
}
}	
		  