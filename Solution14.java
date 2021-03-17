class Solution14 {
    public String longestCommonPrefix(String[] str) {
		System.out.println("length "+ str.length);
		
        if(str==null)
		{
			return "";
		}
		if(str.length==1)
		{
			return str[0];
		}
		if(str.length==1)
		{
			return str[0];
		}
		int i=0,j=0,count=0;
	   char t;
	   String res="";
	   while(true)
	   { 
           i=0;
		   t=str[i].charAt(j);
	      while(i<str.length)
			{  
				if(i<str[i].length() &&str[i].charAt(j)==t)
				{
					count++;
				}
              i++;
            }
			if(count==3)
			{
				res=res+Character.toString(t);
				count=0;
			}
			else{
				break;
			}
			j++;
				
        }
        return res;
    }
	public static void main(String[] args)
    {
        Solution14 s= new Solution14();
	String str[]={"",""};
        String res=s.longestCommonPrefix(str);
        System.out.println("Result "+res);
    }
}