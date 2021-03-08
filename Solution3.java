class Solution3 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] temp=new int[nums1.length+nums2.length];
		System.out.println("nums1.length+nums2.length"+nums1.length+nums2.length);
        int k=0;double dd=0;
          for(int i=0;i<nums1.length;i++)
        {
            temp[k]=nums1[i];
            k++;
        }
            for( int j=0;j<nums2.length;j++)
            {
                temp[k]=nums2[j];
               
				System.out.println("temp 0="+temp[k]);
				k++;
                //if(nums1[i]>num2[j])
            }
        for(int i=0;i<temp.length-1;i++)
        {
            
            for(int j=i+1;j<temp.length;j++)
        {
            if(temp[i]>temp[j])
            {
                int tt=temp[i];
                temp[i]=temp[j];
                temp[j]=tt;
                
            }
        }
		}
		System.out.println("temp 0="+temp[0]);
             if(temp.length%2==0)
            {
                int nn=temp.length/2;
                nn=temp[nn]+temp[nn-1];
                dd=(double)nn;
             dd=dd/2;
            }
            else
            {
            int nn=temp.length/2;
             dd=(double)temp[nn];
            }
            
        
          return dd;  
        }
        
    
    public static void main(String[] args)
    {
        int[] n={};
        int[] m={1};
        Solution3 s= new Solution3();
        double d=s.findMedianSortedArrays(n,m);
        System.out.println(d);
    }
}