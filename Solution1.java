class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        
        int tem[]= new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for( int j=i+1;j<nums.length;j++)
            {
                if((nums[i]+nums[j])==target)
                {
                   tem[0]=i;
                    tem[1]=j;
                    break;
                }
            }
        }
        return tem;
        
        
    }
    public static void main ( String[] args)
    {
        int[] nums= {2,7,11,15};
         int l=nums.length;
        int[] temp= new int[2];
        int t= 9;
        Solution1 s= new Solution1();
        temp=s.twoSum(nums,t);
        for(int i=0;i<temp.length;i++)
        {
            System.out.print(temp[i]+" ");
        }
        
    }
    
}