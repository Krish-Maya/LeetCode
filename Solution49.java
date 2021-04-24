class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs)
    {
      List<List<String>> res= new ArrayList<List<String>>();
       
      boolean b[]=new boolean[strs.length];  
    for(int i=0;i<strs.length;i++)
    {
         List<String> list=new ArrayList<>();
         if(b[i]!=true)
            {
               list.add(strs[i]);
                b[i]=true;
            }
            
        for(int j=i+1;j<strs.length;j++)
        {
           
             if(b[j]!=true&&isAnagram(strs[i],strs[j]))
            {
                 
                list.add(strs[j]);
                b[j]=true;
            }
        }
        if(!list.isEmpty())
        {
        res.add(list);
        }
    }
        
      return res;  
        
    }
    public static boolean isAnagram(String s1,String s2)
    {
         
        boolean status = true;  
        if (s1.length() != s2.length()) {  
            status = false;  
        } else {  
            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            status = Arrays.equals(ArrayS1, ArrayS2);  
        } 
        return status;
    }
    public static void main(String[] args)
    {
        Solution49 s=new Solution49();
        String str[]={"eat","tea","tan","ate","nat","bat"};
        List<List<String>> lis= new ArrayList<>();
        lis=s.groupAnagrams(str);
        System.out.println(lis);
    }
}