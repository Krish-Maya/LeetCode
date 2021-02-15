class ZigZag {
    public String convert(String s, int numRows) {
        
        String sam="";
        char[] c= s.toCharArray();
        String[] str= new String[numRows];
        Arrays.fill(str,"");
        int len=s.length();
        boolean down = true;
        int r=0;
        if(numRows==1)
        {
            sam=s;
            return sam;
        }
    
        for(int i=0;i<len;++i)
        {
           str[r]+=(c[i]);
            if( r==numRows-1)
            {
                down=false;
            }
            else if (r==0)
            {
                down=true;
            }
            if(down)
            {
                r++;
            }
            else
            {
                r--;
            }
        }
        
        for (int i = 0; i <numRows; ++i)  
        { 
            sam=sam+str[i].toString();
           
        } 
         
      
        return sam;
    }
    public static void main (String[] agrs)
    {
        String str="paypalishiring";
        int n=3;
        ZigZag s= new ZigZag();
       String string= s.convert(str,n);
        System.out.println(string);
       
        
        
        
    }
}