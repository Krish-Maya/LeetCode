class Solution7 {
    public int reverse(int x) {
       int b=Integer.toString(x).length()-1;
        double d=(double)b,n=10;
        
        d=Math.pow(n,d);
        b=(int)d;
        int res=0;
        
        while(x>0)
        {
          int t=x%10;
            x=x/10;
            res=res+(t*b);
            b=b/10;
        }
        return res;
        
    }
    public static void main( String[] args)
    {
		Solution7 s =new Solution7();
        String str="1534236469";
		if(str.charAt(0)=='-')
		{
			str=str.substring(1,str.length());
			 int n=Integer.parseInt(str);
        
        int res=s.reverse(n);
		res=res-(2*res);
		System.out.println("result "+res);
			
		}
		else
		{
        int n=Integer.parseInt(str);
        int res=s.reverse(n);
		System.out.println("result "+res);
		}
    }
}