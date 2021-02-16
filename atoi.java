import java.util.*;
class atoi 
{
    
    public int myAtoi(String s) 
	{
        String temp="";
        if(s.charAt(0)>='a' && s.charAt(0)<='z')
        {
            return 0;
        }
		
        
		
			
        for( int i=0;i<s.length();i++)
        {
        if(s.charAt(i)>='a' && s.charAt(i)<='z')
        {
            int n=0;
        }
		
          else
            {
                temp=temp+s.charAt(i);
            }
            
    }
        
      int n= check(temp);
        return n;
    }
    public static int check(String n)
    {
		try{
        if(Double.parseDouble(n)<Integer.MAX_VALUE&&Double.parseDouble(n)>Integer.MIN_VALUE)
        {
			
			
        return Integer.parseInt(n);
        }
        else if (Double.parseDouble(n)<Integer.MIN_VALUE)
        {
            
           return Integer.MIN_VALUE;
        }
        else
        {
            return Integer.MAX_VALUE;
        }
		}
		catch ( Exception ex)
		{
			return 0;
		}
            
    }
    public static void main ( String[] args)
    {
        atoi sol= new atoi();
        Scanner sc = new Scanner( System.in);
        String str="-3.14159";
		str=str.replaceAll(" ","");
       
        int n=sol.myAtoi(str);
        System.out.println("Result "+n);
        
    }
}