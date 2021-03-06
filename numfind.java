class numfind {
    public int firstMissingPositive(int[] nums) {
        boolean b=true;
        int c=1;
        while(b)
        {
           if( check(c,nums))
           {
               c++;
           }
            else
            {
                return c;
            }
        }
		return -1;
    }
     public static boolean check(int c, int[]nums)
     {
        
        
        
        for(int i=0;i<nums.length;i++)
        {
            if(c==nums[i])
            {
                return true;
                
            }
        }
         return false;
        
    }
    
    public static void main ( String[] args)
    {
        numfind s=new numfind();
        int[]n={3,4,-1,1};
        int res=s.firstMissingPositive(n);
        System.out.println("Result " + res);
    }
    
}