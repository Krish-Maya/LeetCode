//Palindrome longest
class Solution5 {
    public String longestPalindrome(String s)
	{
        int l=s.length();
        int count=1;
        String ss="",rs="";
		int min=0;
        if(l==1)
            return s;
        if(l==2&&s.charAt(0)!=s.charAt(1))
            return Character.toString(s.charAt(0));
        if(l==2&&s.charAt(0)==s.charAt(1))
            return s;
        for( int i=0;i<l-1;i++)
        {
			count=1;
            char c= s.charAt(i);
			int j=i+1;
            while(j<l-1&&c!=s.charAt(j))
            {
               count++;
                j++;			   
            }
			j++;
			while(j<l&&c==s.charAt(j))
            {
               count++;
                j++;			   
            }
			
			System.out.println("Result "+i+" "+count);
             ss= s.substring(i,i+count+1);
            StringBuilder sb=new StringBuilder(ss);
            sb=sb.reverse();
            String s1=sb.toString();
            if(ss.equals(s1))
            {
				if(ss.length()>min)
				{
					min=ss.length();
					rs=ss;
					System.out.println("Result "+rs+" "+min);
					
				}
                
            
            }
        }
        return rs;
        
    }
    public static void main (String[] args)
    {
        
        Solution5 s= new Solution5();
        String str="baccaacc";
        String res=s.longestPalindrome(str);
        System.out.println("Result "+res);
    }
    
    
}