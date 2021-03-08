class Solution11 {
    public int maxArea(int[] height) 
    {
        int max=0,min=0;
		int k=0,count1s=1,count2s=1,h=0,len1=0,len2=0;
      for(int i=0;i<height.length;i++)
      {
          if(height[i]>max)
          {
              max=height[i];
          } 
       }
          for( int j=0;j<height.length;j++)
          {
              if(height[j]>min&&height[j]!=max)
              {
                  min=height[j];
              }
          }
		 while(k<height.length && max!=height[k])
		  {
			  k++;
		  }
		  int st=k;
		  k++;
		  while( k<height.length && max!=height[k])
		  {
			  count1s++;
			  k++;
		  }
		  if(max==height[k])
		  {
			  len1=count1s;
		  }
		  else
		  {
			 len1=1;; 
		  } 
		  while(h<height.length&& min!=height[h])
		  {
			  h++;
		  }
		  
		  System.out.println("h val "+h);
		  
		  while( h<height.length && min!=height[st])
		  {
			  count2s++;
			  st++;
		  }
		  
		  
		  if(min==height[h])
		  {
			  len2=count2s-1;
		  }
		  else
		  {
			 len2=1;; 
		  } 
        System.out.println("max "+ max+"min "+min+"cc "+ len1+"c2 "+len2+" "+st);
		if(len1>len2)
		{
			max=max*len1;
			return max;
		}
		else{
			return min*len2;
		}
        
        
        
    }
        
        
    
    public static void main(String[] args)
    {
        int[] n= {1,8,6,2,5,4,8,3,7};
        Solution11 s= new Solution11();
        int res= s.maxArea(n);
        System.out.println("result "+ res);
    }
    
}