class Solution20 {
    public boolean isValid(String s) {
        
        int len=s.length();
        
        Stack<Character> st= new Stack<Character>();
        Map<Character,Character> mp=new HashMap<Character,Character>();
        mp.put(')','(');
        mp.put(']','[');
        mp.put('}','{');
        for(int i=0;i<len;i++)
        {
                  if(mp.containsKey(s.charAt(i)))
                  {
                     char temp= st.empty()?'#':st.pop();
                  
                  if(temp!=mp.get(s.charAt(i)))
            {
                return false;
            }
            }
            else
            {
                st.push(s.charAt(i));
            }
        }
        
    return st.isEmpty();
        
    }
    public static void main(String[] args)
    {
        String str="()[]{}";
        Solution20 s= new Solution20();
        boolean b=s.isValid(str);
        if(b)
        System.out.println("True");
        System.out.println("False");
        
    }
}