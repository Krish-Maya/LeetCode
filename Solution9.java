class Solution9 {
    public boolean isPalindrome(int x)
    {
        String str=Integer.toString(x);
        StringBuffer s= new StringBuffer(str);
        s=s.reverse();
        String ss=s.toString();
        if(str.equals(ss))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    public static void main(String[] args)
    {
        int n=121;
        Solution9 s = new Solution9();
        boolean b=s.isPalindrome(n);
        if(b)
            System.out.println("True");
        System.out.println("False");
    }
}