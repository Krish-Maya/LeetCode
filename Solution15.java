
import java.util.*;
class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> temp= new ArrayList<>();
		Arrays.sort(nums);
        for(int i=0;i+2<nums.length;i++)
        {
			if (i > 0 && nums[i] == nums[i - 1]) 
			{         //prevent duplicates
         continue;
             }
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
                if((nums[i]+nums[j]+nums[k])==0)
                {
                    temp.add(Arrays.asList(nums[i],nums[j],nums[k]));
					j++;
					k--;
					while (j < k && nums[j] == nums[j - 1])
					{						j++;  
					}				
             while (j < k && nums[k] == nums[k + 1])
			 {				 k--; 
			 }
                    
                }
				else if(j<k && (nums[i]+nums[j]+nums[k])>0)
				{
                k--;
				}else
				{
					j++;
				}
            }
            
        }
       
        return temp;
        
        
    }
    public static void main(String[] args)
    {
        Solution15 s= new Solution15();
        int n[]={-1,0,1,2,-1,-4};
        List<List<Integer>> ll=new ArrayList<>();
        
        ll=s.threeSum(n);
        System.out.println("List " +ll);
    }
}