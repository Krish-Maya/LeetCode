
import java.util.*;
class Solution17 {

    String[] arr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.equals("")) return res;
        res.add("");
        for (char digit : digits.toCharArray()) 
		{
            int d = Character.getNumericValue(digit);
            List<String> list = new ArrayList<>();
            for (char c : arr[d].toCharArray())
				{
                for (String s : res) 
				{
					System.out.println("list="+res);
					System.out.println("s="+s);
                    list.add(s + c);
					System.out.println("list="+list);
                }
            }
            res = list;
        }
        return res;
    }
	public static void main (String[] args)
	{
	Solution17 s= new Solution17();
	String str="23";
	List<String> res=new ArrayList<>();
	res=s.letterCombinations(str);
	System.out.println(res);
	
	}
}