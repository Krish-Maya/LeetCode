import java.util.*;
class Solution16 {
     public int threeSumClosest(int[] nums, int target) 
	 {
        
		Arrays.sort(nums);
		int res=Integer.MAX_VALUE;
		int rtr=0,ans=0;
        for(int i=0;i+2<nums.length;i++)
        {
			if (i > 0 && nums[i] == nums[i - 1]) 
			{       
         continue;
             }
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
               int tt=nums[i]+nums[j]+nums[k];
                if(Math.abs(target-tt)<res){ 
                    res=Math.abs(target-tt);
                    rtr=tt;
                }
                if(tt==target){
                    return tt;
                }
                if(tt<target){
                          j++;
                    
                    while(j<k && nums[j]==nums[j-1]){ 
                        j++;                       
						}
                }
                else{
                    k--;    
                    while(j<k && nums[k]==nums[k+1]){
                        k--; 
                         }
                }
        }
		}
       
        return rtr;
        
        
    }
    public static void main(String[] args)
    {
        Solution16 s= new Solution16();
        int n[]={-1,2,1,-4};
        int t=1;
		int res=s.threeSumClosest(n,t);
        System.out.println("Result " +res);
    }
}