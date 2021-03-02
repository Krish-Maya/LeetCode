class jampgame {
    public boolean canJump(int[] nums) {
       
        int l=nums.length,n=0;  
         int last=l-1;
        while(n<l)
        {
            if(l==1&& nums[n]==1)
            {
                return true;
            }
        n=n+nums[n];
        
            if(n==last)
            {
                return true;
              
            }
            if(n<l && nums[n]==0){
                return false;
                
            }
            
        }
        return false;
        
        
        
    }
    public static void main (String[] args)
        
    {
        jumpgame s= new jampgame();
        int[] n={2,3,1,1,4};
        boolean b=s.canJump(n);
        if(b)
        System.out.println("True");
        System.out.println("false");
        
        
        
    }
}